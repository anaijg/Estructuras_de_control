package condicional;

import java.util.Scanner;

/*
Escribe un programa que pide 5 números por teclado y al concluir escribe el mayor y menor de ellos (sin utilizar for).
 */
public class EjercicioIf03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // pido cinco números
        System.out.println("Numero 1: ");
        int numero1 = sc.nextInt();
        System.out.println("Numero 2: ");
        int numero2 = sc.nextInt();
        System.out.println("Numero 3: ");
        int numero3 = sc.nextInt();
        System.out.println("Numero 4: ");
        int numero4 = sc.nextInt();
        System.out.println("Numero 5: ");
        int numero5 = sc.nextInt();

        // creo dos variables que van a guardar el máximo y el mínimo temporalmente, mientras voy mirando todos los números
        // como voy a empezar a mirar por el primer número, ese es temporalmente el número mayor y más pequeño de los que he visto
        int maximoTemporal = numero1;


        // ahora vemos que pasa con el segundo número
        // la idea es: si el segundo número es mayor que el que guarda máximoTemporal
        if (numero2 > maximoTemporal) {
            // actualizo el valor de maximoTemporal con este número
            maximoTemporal = numero2;
            System.out.println(maximoTemporal);
        } // si el segundo número no es mayor, pues no hago nada, por eso no pongo else

        // y así con los demás
        if (numero3 > maximoTemporal) {
            maximoTemporal = numero3;
            System.out.println(maximoTemporal);
        }


        if (numero4 > maximoTemporal) {
            maximoTemporal = numero4;
            System.out.println(maximoTemporal);
        }

        if (numero5 > maximoTemporal) {
            maximoTemporal = numero5;
            System.out.println(maximoTemporal);
        }

        // cuando he terminado de comparar todos con el máximo temporal, en la variable maximoTemporal tengo guardado el mayor de todos
        System.out.println("El mayor de todos los números es: " + maximoTemporal);


        // ahora vamos con el mínimo, con la misma lógica
        int minimoTemporal = numero1;

        if (numero2 < minimoTemporal) {
            // actualizo el valor de minimoTemporal con este número
            minimoTemporal = numero2;
            System.out.println(minimoTemporal);
        } // si el segundo número no es menor, pues no hago nada, por eso no pongo else

        // y así con los demás
        if (numero3 < minimoTemporal) {
            minimoTemporal = numero3;
            System.out.println(minimoTemporal);
        }


        if (numero4 < minimoTemporal) {
            minimoTemporal = numero4;
            System.out.println(minimoTemporal);
        }

        if (numero5 < minimoTemporal) {
            minimoTemporal = numero5;
            System.out.println(minimoTemporal);
        }

        // cuando he terminado de comparar todos con el mínimo temporal, en la variable minimoTemporal tengo guardado el menor de todos
        System.out.println("El menor de todos los números es: " + minimoTemporal);
    }
}
