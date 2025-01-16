package instrucciónswitch;

import java.util.Scanner;

/**
 * Realizar un programa que pida un número entero por teclado y visualice el dia de la semana correspondiente.
 */
public class EjercicioSwitch15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 7");
        int numero = scanner.nextInt();
        String dia = "";
        switch (numero) {
            case 1 -> dia = "Lunes";
            case 2 -> dia = "Martes";
            case 3 -> dia = "Miércoles";
            case 4 -> dia = "Jueves";
            case 5 -> dia = "Viernes";
            case 6 -> dia = "Sábado";
            case 7 -> dia = "Domingo";
            default -> dia = "ninguno";
        }
        System.out.println(dia);
    }
}
