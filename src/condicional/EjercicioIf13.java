package condicional;

import java.util.Scanner;

/*

13. Escribe un programa que lea el número de dirección (1 - arriba, 2 - abajo, 3 - izquierda, 4 - derecha, 0 – no mover) y muestre el texto «subir», «bajar», « mover a la izquierda », « mover a la derecha », « no mover », según el número introducido). Si es un número que no pertenece a ninguna de las direcciones enumeradas, el programa debería generar: «¡error\!»

 */
public class EjercicioIf13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una dirección:\n1 - arriba\n2 - abajo\n3 - izquierda\n4 - derecha\n0 – no mover");
        int dirección = sc.nextInt();

        if (dirección == 1) {
            System.out.println("arriba \uD83D\uDC46");
        } else if (dirección == 2) {
            System.out.println("abajo \uD83D\uDC47");
        } else if (dirección == 3) {
            System.out.println("izquierda \uD83D\uDC48");
        } else if (dirección == 4) {
            System.out.println("derecha \uD83D\uDC49");
        } else if (dirección == 0) {
            System.out.println("no mover ✋");
        } else {
            System.out.println("¡Error! \uD83D\uDE45");
        }
    }
}
