package condicional;

import java.util.Scanner;

public class EjercicioIf05Resa {
    public static void main(String[] args) {
        String usuarioReal = "usuario";
        String contraseñaReal = "1234";

        // pedimos usuario y contraseña
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuarioAdivinado = sc.nextLine();
        System.out.println("Contraseña: ");
        String contraseñaAdivinada = sc.nextLine();

        boolean usuario = false;
        boolean contraseña = false;

        if(usuarioReal.equals(usuarioAdivinado)){
            usuario = true;
        }

        if(contraseñaReal.equals(contraseñaAdivinada)){
            contraseña = true;
        }

        if(usuario == true && contraseña == true){
            System.out.println("Entraste al sistema");
        } else if (usuario == true && contraseña == false) {
            System.out.println("Contraseña incorrecta");
        } else if (usuario == false && contraseña == true) {
            System.out.println("Usuario incorrecto");
        }else {
            System.out.println("Usuario y contraseña incorrecta");
        }
    }
}
