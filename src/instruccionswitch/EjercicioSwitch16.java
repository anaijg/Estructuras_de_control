package instrucciónswitch;

import java.util.Scanner;

/**
 * Escribe un programa que pida dos números enteros, y pida la operación que quiere realizar con estos (+, -, *, /). El programa debe realizar la operación pedida y visualizar el resultado. En caso de que el símbolo introducido no sea correcto, visualizar: operación incorrecta.
 */
public class EjercicioSwitch16 {
    public static void main(String[] args) {
        // pido datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Segundo número: ");
        int num2 = scanner.nextInt(); scanner.nextLine(); // añado el nextLine para que no "salte" al llegar al siguiente nextLine()
        System.out.println("Operación (+, -, *, /)");
        char operación = scanner.nextLine().charAt(0);
        // hago una operación u otra
        int resultado = 0;
        switch (operación) {
            case '+' -> resultado = num1 + num2;
            case '-' -> resultado = num1 - num2;
            case '*' -> resultado = num1 * num2;
            case '/' -> resultado = num1 / num2;
        }
        System.out.println("Resultado: " + resultado);
    }
}
