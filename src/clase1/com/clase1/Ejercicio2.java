package com.clase1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 2 - Ingresar un numero N: ");
        int n = scanner.nextInt();
        System.out.println("Ingresar un numero M: ");
        int m = scanner.nextInt();
        scanner.close();
        System.out.println("Primeros " + n + " numeros multiplos de " + m + ".");
        multiplos(n, m);


    }

    public static void multiplos(int n, int m) {
        int count = 0;
        int i = 1;
        while (count < n) {
            if (i % m == 0) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }

}
