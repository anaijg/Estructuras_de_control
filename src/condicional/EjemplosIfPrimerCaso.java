package condicional;

import java.util.Scanner;

public class EjemplosIfPrimerCaso {
    public static void main(String[] args) {
        // Primer caso: if con una rama
        Scanner sc = new Scanner(System.in);
        System.out.println("Edad: ");
        int edad = sc.nextInt();

        // todos los operadores relacionales
        // dan como resultado true o false
        if (edad >= 18) { // si el resultado es true, entra en el bloque
            System.out.println("Adelante, puedes pasar.");
        }
        // si el resultado es false, no entra el bloque y salta a la primera línea tras el bloque if
    }
}
