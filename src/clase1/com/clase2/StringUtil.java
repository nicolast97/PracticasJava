package com.clase2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringUtil
{

	public StringUtil() {

	}

	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c, int n)
	{
		StringBuilder builder = new StringBuilder(n);
		while (builder.length() < n){
			builder.append(c);
		}
		return builder.toString();
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		StringBuilder builder = new StringBuilder();
		builder.append(s);
		while (builder.length() < n) {
			if (builder.length() < n) {
				builder.insert(0, c);
			}
		}
		return builder.toString();
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		String[] chars = new String[arr.length];
		for (int i = 0; i<arr.length; i++) {
			chars[i] = String.valueOf(arr[i]);
		}
		return chars;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int[] numbers = new int[arr.length];
		for (int i = 0; i<arr.length; i++) {
			numbers[i] = Integer.valueOf(arr[i]);
		}
		return numbers;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int maxLength = 0;
		for (int i = 0; i < arr.length; i++ ) {
			int elementLength = arr[i].length();
			if(maxLength < elementLength){
				maxLength = elementLength;
			}
		}
		return maxLength;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
	}
}
