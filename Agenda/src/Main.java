import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // o se puede hacer asi tambien->
        /*Object[] persona= new  Object[4];
        //nombre, apellido, correo, telefono
        persona[0] = "Diego";
        persona[1] = "Senra";
        persona[2] = "Senra04@gmail.com";
        persona[3] = "690296764"; */
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el nombre de la persona");
        String nombre = scanner.next();
        System.out.println("Dime el apellido de la persona");
        String apellido = scanner.next();
        System.out.println("Dime el correo de la persona");
        String correo = scanner.next();
        System.out.println("Dime el telefono de la persona");
        int telefono = scanner.nextInt();
        // usamos objet porque puede guardar todos los tipos.
        Object[] persona1 = new Object[]{"Diego", "Senra", "Senra04@gmail.com", 1234};
        System.out.println("Los datos del usuario son:");
        for (Object item : persona1) {
            System.out.println(item);
        }
        Object[] persona2 = new Object[]{"Maria", "Dominguez", "Mery@gmail.com", 5678};
        System.out.println("Los datos del usuario son:");
        for (Object item : persona2) {
            System.out.println(item);
        }*/

        // si quisiera pedir los datos de varias personas... se usaria array multidimensional. tiene n filas y en cada una n columnas.
        // matriz
        /*int[][]numeros = new int[3][3]; // Array multidimensional, donde cada fila es un array
        //0,0,0,0
        //0,0,0,0
        //0,0,0,0
        */
        int[][] numeros = new int[][]{{4, 6, 1,}, {1, 8, 9}, {11, 18, 19}};
        // 4    6   1
        // 1    8   9
        // 11, 18, 19
        // System.out.println(numeros[0][2]);
        //numeros[2][0]= 20;
        //numeros.length -> cuantas filas
        //numeros [0].lenght -> cuantas columnas o longuitud tiene la fila indicada.
        for (int i = 0; i < numeros.length; i++) {
            // System.out.println("accediendo a la fila "+i);
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        // antes rellenabamos y ahora mostramos con for each->iter
        int[][] numeros1 = new int[4][4];
        for (int i = 0; i < numeros1.length; i++) {
            for (int j = 0; j < numeros1[i].length; j++) {
                numeros1[i][j] = (int) (Math.random() * 16) + 1; //1-16
            }
        }
        for (int[] fila : numeros1) {
            for (int item : fila) {
                System.out.print(item + "\t");
                /*if (item % 2 == 0) {
                    System.out.print(item + "\t");
                }*/ //-----> por ejemplo si solo quisieramos imprimir los pares
            }
            System.out.println();
        }
    }
}
