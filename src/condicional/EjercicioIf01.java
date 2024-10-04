package condicional;

import java.util.Scanner;

/*
Escribe un programa que pida un número e indique si es par o impar (un número es par si al dividirlo entre 2 el resto es 0).
 */
public class EjercicioIf01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) { // si al dividir el número entre dos el resto es 0
            System.out.println("El número " + numero + " es par.");
        } else { // si no, es impar
            System.out.println("El número " + numero + " es impar.");
        }
    }
}
