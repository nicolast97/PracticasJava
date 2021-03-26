package com.clase1.ejercicios;

import java.util.Scanner;

import static com.clase1.ejercicios.Ejercicio3.esPrimo;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio 4 - Ingresar un numero N: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("Primeros " + n + " numeros primos.");
        contarPrimos(n);
    }

    public static void contarPrimos(int n) {
        int contador = 1;
        int iterator = 1;
        while(contador <= n) {
            if (esPrimo(iterator)) {
                System.out.println(iterator);
                contador++;
            }
            iterator++;
        }
    }

}
