package condicional;

import java.util.Scanner;

/*
Escribe un programa que pida tres números y los muestre ordenados (de menor a mayor).
 */
public class EjercicioIf06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a = ");
        int a = sc.nextInt();
        System.out.println("b = ");
        int b = sc.nextInt();
        System.out.println("c = ");
        int c = sc.nextInt();

        // Hay 6 casos posibles:
        // a < b < c
        // a < c < b

        // b < a < c
        // b < c < a

        // c < a < b
        // c < b < a

        // como lo que evaluamos no es una variable, sino una expresión (tiene operadores) no se puede utilizar switch
        if (a <= b && b <= c) { // es lo mismo que decir a < b < c
            System.out.println(a + "" + b + c); // ponemos las comillas para que no los sume, sino que los considere texto
        } else if (a <= c && c <= b ) {
            System.out.println(a + "" + c + b);
        } else if (b <= a && a <= c) {
            System.out.println(b + "" + a + c);
        } else if (b <= c && c <= a) {
            System.out.println(b + "" + c + a);
        } else if (c <= a && a <= b) {
            System.out.println(c + "" + a + b);
        } else {
            System.out.println(c + "" + b + a);
        }
    }
}
