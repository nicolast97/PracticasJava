package com.clase1.ejercicios;

import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 5 - Ingresar un numero N");
        int n = scanner.nextInt();
        System.out.println("Ingresar un numero M");
        int m = scanner.nextInt();
        System.out.println("Ingresar un numero D");
        int d = scanner.nextInt();
        scanner.close();
        System.out.println("Ejercicio 5: Primeros " + n + " numeros que tienen al menos " + m + " digitos " + d + ".");
        contarDigitos(n, m, d);

    }

    public static void contarDigitos(int n, int m, int d) {
        LinkedList<Integer> list = new LinkedList<>();
        int total = 0;
        int i = 0;

        while (total < n) {
            i++;
            list.clear();
            int number = i;
            int contador = 0;
            while (number > 0) {
                list.push(number % 10);
                number = number / 10;
            }
            while ((!list.isEmpty())) {
                if (list.pop() == d)
                    contador++;
            }
            if (contador >= m) {
                System.out.println(i);
                total++;
            }
        }
    }

}

