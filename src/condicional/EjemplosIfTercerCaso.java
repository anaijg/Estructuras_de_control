package condicional;

import java.util.Scanner;

// edad != 3 -> se lee edad distinto de 3

public class EjemplosIfTercerCaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número de día de la semana: ");
        int numero = sc.nextInt();
        if (numero <= 0 || numero > 7) {
            System.out.println("No es un número de la semana correcto. ");
        } else if (numero == 1) {
            System.out.println("Lunes");
        } else if (numero == 2) {
            System.out.println("Martes");
        } else if (numero == 3) {
            System.out.println("Miércoles");
        } else if (numero == 4) {
            System.out.println("Jueves");
        } else if (numero == 5) {
            System.out.println("Viernes");
        } else if (numero == 6) {
            System.out.println("Sábado");
        } else {
            System.out.println("Domingo");
        }
    }
}
