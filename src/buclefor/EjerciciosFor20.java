package buclefor;

import java.util.Scanner;

/**
 * Hacer un programa que pida dos números a y b, enteros, por teclado (se asume que a es menor que b siempre), e imprima la suma de todos los números enteros desde a hasta b, ambos inclusive.
 */
public class EjerciciosFor20 {
    public static void main(String[] args) {
        // pedir dos números a y b enteros por teclado (se asume que a es menor que b siempre)
        // input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce a: ");
        int a = scanner.nextInt(); // ej 5
        System.out.print("Introduce b: ");
        int b = scanner.nextInt(); // ej 13

        // imprimir la suma de todos los números enteros desde a hasta b, ambos inclusive.
        // procesamiento: calcular la suma de todos los números enteros
        // ej: a = 5 y b= 13 --> suma = 5 + 6 + 7 + ... + 13
        int suma = 0;
        for (int i = a; i <= b ; i++) { // <= b < b + 1 son lo mismo
            suma = suma + i;
        }

        // output
        System.out.println(suma);
    }
}
