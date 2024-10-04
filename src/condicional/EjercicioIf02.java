package condicional;

import java.util.Scanner;

/*
Escribe un programa que pida dos números e indique si el primero es mayor que el segundo o no.
 */
public class EjercicioIf02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero 1: ");
        int numero1 = sc.nextInt();
        System.out.println("Numero 2: ");
        int numero2 = sc.nextInt();

        // me preguntan si el primero es mayor o no
        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else { // si no es mayor, tiene que ser menor o igual
            System.out.println(numero1 + " no es mayor que " + numero2);
        }
    }
}
