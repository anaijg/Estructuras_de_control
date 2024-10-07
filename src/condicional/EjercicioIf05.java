package condicional;

import java.util.Scanner;

/*
Escribe el mismo programa anterior, pero indicando exactamente qué es lo que es incorrecto: si el usuario, la contraseña o ambos.
 */
public class EjercicioIf05 {
    public static void main(String[] args) {
        String usuarioReal = "usuario";
        String contraseñaReal = "1234";

        // pedimos usuario y contraseña
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuarioAdivinado = sc.nextLine();
        System.out.println("Contraseña: ");
        String contraseñaAdivinada = sc.nextLine();

        // comparamos
        if (usuarioAdivinado.equals(usuarioReal)) {
            // una vez que sé que el usuario coincide, compruebo la contraseña
            if (contraseñaAdivinada.equals(contraseñaReal)) {
                // usuario y contraseña correctos
                System.out.println("Has entrado al sistema.");
            } else {
                // si entro aquí es que: el usuario es correcto (if de fuera) pero la contraseña, no (if interno)
                System.out.println("La contraseña es incorrecta.");
            }
        } else {
            // el usuario es incorrecto
            if (contraseñaAdivinada.equals(contraseñaReal)) {
                // usuario incorrecto (if externo), contraseña correcta (if interno)
                System.out.println("El usuario es incorrecto");
            } else {
                // usuario y contraseña incorrectos
                System.out.println("Usuario y contraseña incorrectos.");
            }
        }
    }
}
