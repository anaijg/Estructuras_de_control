package condicional;

import java.util.Scanner;

/*
Escribe un programa que pida un nombre de usuario y una contraseña. Esos datos se comparan con dos valores guardados previamente en el programa. Si coinciden, se indica “Has entrado al sistema”, en caso contrario se indica que usuario y/o contraseña son incorrectos.
 */
public class EjercicioIf04 {
    public static void main(String[] args) {
        // ponemos un usuario y una contraseña random
        String usuario = "usuario";
        String contraseña = "1234";




        // pedimos usuario y contraseña
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuarioAdivinado = sc.nextLine();
        System.out.println("Contraseña: ");
        String contraseñaAdivinada = sc.nextLine();

        // tenemos que compararlo
        // 👁️‍🗨️ ¡OJO! cuando comparamos Strings, tenemos que hacerlo obligatoriamente con cadena1.equals(cadena2) -> si las dos cadenas son iguales, devolverá true
        if(usuario.equals(usuarioAdivinado)  && contraseña.equals(contraseñaAdivinada)) {
            System.out.println("Has entrado al sistema.");
        } else {
            System.out.println("Usuario y/o contraseña incorrecto.");
        }
    }
}
