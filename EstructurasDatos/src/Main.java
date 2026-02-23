import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Array
        // mediante numero de huecos
        // mediante elementos
        // [x,x,x,x,x]

        System.out.println("Cuantos numeros quieres guardar");
        //int tamanioNumeros = scanner.nextInt();

        int[] listaNumeros = new int[8];
        // [false, false, false]
        boolean[] listaAciertos = new boolean[3];
        // [0.0,0.0,0.0,0.0,0.0,0.0]
        double[] lsitaNotas = new double[6];
        // ["","","",""] o [null,null,null,null]
        String[] listaNombres = new String[4];

        // [78,23,45,72]
        int[] listaNumerosIntroducidos = new int[]{54, 23, 45, 72};

        // ¿Acciones para Array?->cuantos elementos hay en el array?
        System.out.println("El tamaño del Array es " + listaNumeros.length);

        // [0,0,0,0,0,0,0,0]
        // modificar uno de los elementos del array
        listaNumeros[listaNumeros.length - 1] = 34;
        listaNumeros[0] = 64;
        listaNumeros[listaNumeros.length / 2] = 56;

        // [64,0,0,0,56,0,0,34]
        // obtener uno de los elementos del array

        System.out.println("Accediendo a posiciones");
        System.out.println("La posicion 0 es el valor: " + listaNumeros[0]);
        System.out.println("La posicion 4 es el valor: " + listaNumeros[4]);
        System.out.println("La posicion 7 es el valor: " + listaNumeros[7]);
        System.out.println("La posicion 1 es el valor: " + listaNumeros[1]);

        //obtener todos los elementos-> for

        System.out.println("Imprimiendo los elementos del array");
        //System.out.println(listaNumeros);
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println(listaNumeros[i]);
        }

        //si quiero rellenar los elementos con aleatorios

        for (int i = 0; i < listaNumeros.length; i++) {
            listaNumeros[i] = (int) (Math.random() * 50); //(int) casteo
        }
        System.out.println("Imprimiendo los elementos del array aleatorios");
        //System.out.println(listaNumeros);
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println(listaNumeros[i]);
        }

        // Sumatorio de todos los numeros del array
        System.out.println("Sumatorio de los numeros");

        int sumatorio = 0;
        /*for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println(listaNumeros[i]);
            sumatorio += listaNumeros[i];
        }*/
        for (int item : listaNumeros) {
            System.out.println("Ejecutando valor "+item);
            sumatorio += item;
        }
        System.out.println("El sumatorio de los numeros es " + sumatorio);

        System.out.println("Imprimiendo palabras");
        //String[] palabras = new String[]{"Hola", "Adios", "Programacion", "Clase", "Java"};

        String[] palabras = new String[]{null, null, "hola", null, "adios"};
        //null,null,null,null,null

        /*for (String item : palabras) {
            System.out.println(item);
        }*/
        //System.out.println("La palabra aleatoria es: " + palabras[(int) (Math.random() * palabras.length)]);
        //Quiero saber si la palabra hola esta en el array
        for (String item : palabras) {
            if (item != null && item.equals("hola")) {
                System.out.println("Encontrado");
            }
            ;

        }
    }
}