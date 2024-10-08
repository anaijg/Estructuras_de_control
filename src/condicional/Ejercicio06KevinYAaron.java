package condicional;

import java.util.Scanner;

public class Ejercicio06KevinYAaron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a = ");
        int a = sc.nextInt();
        System.out.println("b = ");
        int b = sc.nextInt();
        System.out.println("c = ");
        int c = sc.nextInt();

        // busco el mínimo como vimos en el ejercicio 3 de if
        int minimoTemporal = a;
        // TODO ver cómo terminamos esto
        // comparo con los otros dos y si alguno es menor, lo sustituyo
        if (b < a) {
            minimoTemporal = b;
        }
        if (c < minimoTemporal) {
            minimoTemporal = c;
        }

        // en mínimoTemporal tengo el más pequeño, que puede ser a, b o c
        // ahora tengo que encontrar el siguiente más pequeño



    }
}
