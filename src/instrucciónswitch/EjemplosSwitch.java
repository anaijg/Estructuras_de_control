package instrucciónswitch;

import java.util.Scanner;

public class EjemplosSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige opción (1-4):");
        System.out.println("1. Comenzar partida");
        System.out.println("2. Cargar partida guardada");
        System.out.println("3. Ayuda");
        System.out.println("4. Salir");
        int acción = sc.nextInt();



//        if (acción == 1) {
//            System.out.println("Comenzando partida...");
//        } else if (acción == 2) {
//            System.out.println("Cargando partida...");
//        } else if (acción == 3) {
//            System.out.println("Mostrando la ayuda...");
//        } else if (acción == 4) {
//            System.out.println("Saliendo...");
//        } else {
//            System.out.println("Acción no prevista.");
//        }


        // switch
//        switch (acción) { // (nombre de la variable)
//            case 1: // escribimos lo que tiene que hacer en caso de que acción = 1
//                System.out.println("Comenzando partida...");
//                break; // si no ponemos break, se metería en el siguiente case
//            case 2:
//                System.out.println("Cargando una partida guardada");
//                break;
//            case 3:
//                System.out.println("Mostrando la ayuda...");
//                break;
//            case 4:
//                System.out.println("Saliendo...");
//                break;
//            default: // en cualquier otro caso...
//                System.out.println("Acción no prevista, por favor inténtalo de nuevo");
//        }

        switch (acción) { // (nombre de la variable)
            case 1 ->
                System.out.println("Comenzando partida...");
            case 2 -> {
                System.out.println("Cargando una partida guardada");
            }
            case 3 -> {
                System.out.println("Mostrando la ayuda...");
            }
            case 4 -> {
                System.out.println("Saliendo...");
            }
            default ->  {
                System.out.println("Acción no prevista, por favor inténtalo de nuevo");
            }// en cualquier otro caso...
        }
    }
}
