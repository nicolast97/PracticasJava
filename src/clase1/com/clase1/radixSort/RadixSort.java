package com.clase1.radixSort;

import java.util.ArrayList;
import java.util.HashMap;

public class RadixSort {

    public static void main(String[] args) {
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };

       arr = radixSort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] radixSort(int[] arr) {

        String[] sArr = StringUtil.toStringArray(arr);
        StringUtil.lNormalize(sArr,'0');
        int indiceDigitos = StringUtil.maxLength(sArr)-1;
        HashMap<Character,ArrayList<String>> listas = new HashMap<>();
        while (indiceDigitos >= 0) {
            listas.clear();
            for (String elem : sArr) {
                char ultimoCaracter = elem.charAt(indiceDigitos);
                if (!listas.containsKey(ultimoCaracter)) {
                    ArrayList listaNueva = new ArrayList();
                    listaNueva.add(elem);
                    listas.put(ultimoCaracter,listaNueva);
                } else {
                    ArrayList listaExistente = listas.get(ultimoCaracter);
                    listaExistente.add(elem);
                    listas.replace(ultimoCaracter, listaExistente);
                }
            }
            String[] arregloOrdenado = new String[sArr.length];
            int indiceIngresado = 0;
            while (indiceIngresado < arregloOrdenado.length) {
                for (Character digito : listas.keySet()) {
                    ArrayList<String> listaOrdenada = listas.get(digito);
                    for (String elem : listaOrdenada) {
                        arregloOrdenado[indiceIngresado] = elem;
                        indiceIngresado++;
                    }
                }
            }
            sArr = arregloOrdenado;
            indiceDigitos--;
        }
        arr = StringUtil.toIntArray(sArr);
        return arr;
    }
}
