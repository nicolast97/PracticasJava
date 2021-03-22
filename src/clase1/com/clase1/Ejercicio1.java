package com.clase1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 1 - Ingresar un numero:");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("Primeros " +  n + " numeros pares.");
        numerosPares(n);

    }

    public static void numerosPares(int n) {
        int iterator = 2;
        int count = 1;
        while (count <= n) {
            System.out.println(iterator);
            iterator += 2;
            count++;
        }
    }

}
