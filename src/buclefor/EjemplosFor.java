package buclefor;

public class EjemplosFor {
    public static void main(String[] args) {
        // bucles -> sirven para repetir las instrucciones dentro del bloque {} un cierto número de veces

        // si se conoce de antemano el número exacto de veces que queremos repetir las instrucciones
        // utilizamos for (normalmente)

        // si no conocemos de antemano el número de iteraciones se utiliza while o do-while (normalmente, porque en realidad todos los tipos de bucle son intercambiables)

        // empezamos con for
        // int i = 0 -> inicialización; creamos una variable i, entera, y la inicializamos a 0
        // NOTA: a la variable i se la denomina variable del bucle, y es la que va a ir contando las vueltas, es decir, con cada vuelta se incrementa una unidad
        //
        int tope = 10;
        // mientras i sea menor que 10 en este caso vale 10, podríamos poner cualquier otro número positivo
        // se va a ejecutar las instrucciones del bloque, con cada vez i se va a incrementar (i++)
        for (int i = 1; i <= tope; i++) {
            System.out.println("Vuelta número: " + i);
        }
    }
}
