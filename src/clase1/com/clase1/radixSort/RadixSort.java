package com.clase1.radixSort;

import java.util.ArrayList;
import java.util.HashMap;

public class RadixSort {

    public static void main(String[] args) {
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
        arr = radixSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] radixSort(int[] arr) {
        String[] sArr = StringUtil.toStringArray(arr);
        StringUtil.lNormalize(sArr, '0');
        int indiceDigitos = StringUtil.maxLength(sArr) - 1;
        HashMap<Character, ArrayList<String>> listas = new HashMap<>();
        while (indiceDigitos >= 0) {
            listas.clear();
            ordenarListas(sArr, listas, indiceDigitos);
            sArr = ordenarNuevoArreglo(listas, sArr.length);
            indiceDigitos--;
        }
        arr = StringUtil.toIntArray(sArr);
        return arr;
    }

    //Recorro el el arreglo donde voy tomando el caracter del indice y segun cual sea lo guardo en las listas
    //del hashmap para que quede de forma ordenada donde cada lista guarda el caracter del inidice indicado.
    private static void ordenarListas(String[] arr, HashMap<Character, ArrayList<String>> listas, int indice) {
        for (String elem : arr) {
            char caracter = elem.charAt(indice);
            if (!listas.containsKey(caracter)) {
                ArrayList listaNueva = new ArrayList();
                listaNueva.add(elem);
                listas.put(caracter, listaNueva);
            } else {
                ArrayList listaExistente = listas.get(caracter);
                listaExistente.add(elem);
                listas.replace(caracter, listaExistente);
            }
        }
    }

    //Construyo un nuevo arreglo a partir de las listas ordenadas de modo que el nuevo arreglo este ordenado
    //a partir del caracter del indice correspondiente.
    private static String[] ordenarNuevoArreglo(HashMap<Character, ArrayList<String>> listas, int tamañoOriginal) {
        String[] arregloOrdenado = new String[tamañoOriginal];
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
        return arregloOrdenado;
    }

}
