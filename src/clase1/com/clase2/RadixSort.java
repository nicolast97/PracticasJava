package com.clase2;

import java.lang.reflect.Array;

public class RadixSort {

    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtil();
        String s = "prueba";
        int[] numeros = new int[]{1,2,3,4,5,6,7,8,9,10};
        String[] caracteres = stringUtil.toStringArray(numeros);
        for (int i = 0; i<caracteres.length;i++) {
           System.out.println(caracteres[i]);
        }
    }

}
