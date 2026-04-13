import java.util.Scanner;

public class Bonoloto {
    private int[] numerosSistema = new int[5]; // 0,0,0,0,0
    private int[] numerosUsuario = new int[5];// 0,0,0,0,0
    private int aciertos = 0;
    private Scanner scanner = new Scanner(System.in);

    public void iniciarJuego() {
        // al iniciar el juego pasan dos cosas
        // 1. Salen de la maquina 5 numeros que seran los numeros del sistema 0-20
        //
        // aunque queremos generar numeros entre el 0-20, se pone
        // 21 porque como solo queremos el entero 20,99 y lo hemos
        // casteado, asi nos dara el 20
        for (int i = 0; i < 5; i++) {
            numerosSistema[i] = (int) (Math.random() * 21);
        }
        //2. Se le piden 5 numeros al usuario
        System.out.println("Procedemos a sellar tu boleto");
        for (int i = 0; i < 5; i++) {

            int numeroIntroducido;
            do {
                System.out.println("Introduce el numero con el que quieres jugar");
                numeroIntroducido = scanner.nextInt();
                if (numeroIntroducido < 0 || numeroIntroducido > 20) {
                    System.out.println("Incorrecto");
                }
            } while (numeroIntroducido < 0 || numeroIntroducido > 20);
            numerosUsuario[i] = numeroIntroducido;
        }

        System.out.println("Procedemos a ver las coincidencias con los numeros del sistema");
        for (int item : numerosUsuario) {
            buscarNumero(item);
        }
        System.out.println("Has acertado una cantidad de " + aciertos);
    }

    public void listarNumerosSistema() {
        for (int item : numerosSistema) {
            System.out.println(item);
        }
    }

    public void listarNumerosUsuarios() {
        for (int item : numerosUsuario) {
            System.out.println(item);
        }
    }

    // le damos un numero y se encarga de buscarlo dentro del array del sistema
    public void buscarNumero(int numero) {
        //buscar un numero dentro del array sistema
        // numerosSistema->es donde buscar--variable de clase
        // numero que quiero buscar--parametro
        for (int item : numerosSistema) {
            if (item == numero) {
                aciertos++;
                break;
            }
        }
    }
}
