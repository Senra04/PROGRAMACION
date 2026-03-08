import java.util.Scanner;

public class MainSudoku {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        // acceso a todos los metodos de la clase y sus propiedades
        sudoku.iniciarCuadrado();
        //sudoku.rellenarNumeros();
        //sudoku.mostrarNumeros();

        Scanner scanner=new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1 Rellenar cuadrado");
            System.out.println("2 Listar cuadrado");
            System.out.println("¿Que opcion quieres hacer?");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1 ->{
                    sudoku.rellenarNumeros();
                }
                case 2 ->{
                    sudoku.mostrarNumeros();
                }
            }
        }while (opcion!=3);
    }
}
