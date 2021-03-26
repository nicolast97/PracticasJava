package com.clase1.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 3 - Ingresar un numero: " );
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(n + " es un numero primo? " );
        System.out.println(esPrimo(n) ? "si." : "no.");
    }

    public static boolean esPrimo(int n) {
        boolean primo = true;
        for (int i = 2; i < n ; i++) {
            if (n%i == 0) {
                primo = false;
            }
        }
        return primo;
    }

}
