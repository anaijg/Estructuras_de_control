package buclefor;
/*
Hacer un programa que calcule la suma de los números enteros del 1 al 10 (inclusive) usando el bucle for.
 */
public class EjerciciosFor19 {
    public static void main(String[] args) {
      // quiero esto: 1 + 2 + 3 + ... + 10
      // necesito crear una variable que vaya guardando el incremento con cada vuelta
      int suma = 0; // esto es un acumulador, va acumulando los incrementos de la variable
        for (int i = 1; i <= 10; i++) {
            suma += i; // suma = suma + i
            System.out.println("Suma = " + suma + " i = " + i);
        }
        System.out.println(suma);
    }
}
