//INSTRUCCIONES DEL SUDOKU, PERO NO TIENE FUNCIONALIDAD HASTA QUE LO HAGA REALIDAD
public class Sudoku {
    private int[][] cuadrado = new int[3][3];

    public void iniciarCuadrado() {
        System.out.println("Procedemos a iniciar el Sudoku");
        rellenarNumeros();
        mostrarNumeros();
    }

    public void rellenarNumeros() {
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                // rellena numeros aleatorios pero se pueden repetir
                /*cuadrado[i][j] = (int)(Math.random()+20)+1; // 1-20
                 * */
                // rellena numeros aleatorios que no se repiten
                int aleatorio;
                do {
                    aleatorio = (int) (Math.random() * 16) + 1;
                } while (estaNumero(aleatorio));
                cuadrado[i][j] = aleatorio;
            }
        }
        // guardar aquellos que no estan repetidos

    }

    private boolean estaNumero(int numero) {
        for (int[] fila : cuadrado) {
            for (int item : fila) {
                if (item == numero) {
                    return true;
                }
            }
        }
        return false;
    }

    public void mostrarNumeros() {

        for (int[] fila : cuadrado) {
            for (int item : fila) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }
}
