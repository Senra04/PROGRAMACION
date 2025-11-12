import java.util.Scanner;

public class Ejercicios {

    public void ejercicioT310() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la altura en cm: ");
        int altura = scanner.nextInt();
        if (altura >= 120 && altura <= 200) {
            System.out.println("Puedes subir");
        } else if (altura < 120) {
            System.out.println("Demasiado bajito para subir");
        } else {
            System.out.printf("Demasiado alto para subir");
        }

    }

    public void ejercicioT312() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica que contraseña quieres evaluar:");
        String contrasena = scanner.next();
        boolean requisitoLong = contrasena.length() >= 8; // cuantas letras tiene la palabra
        boolean contieneNumero = contieneNumero(contrasena);
        boolean passInvalida = contrasena.equals("pasword") || contrasena.equals("12345678");
        System.out.println("Requisito long:" + requisitoLong);
        System.out.println("Requisito numero:" + contieneNumero);
        System.out.println("Requisito pass invalida:" + passInvalida);

        boolean passOK = requisitoLong && contieneNumero && !passInvalida;
        System.out.println("¿La contraseña es valida?: " + passOK);
    }


    public int longCadena(String cadena) {
        return cadena.length();
    }

    public boolean contieneNumero(String cadena) {
        return cadena.contains("1") || cadena.contains("2") || cadena.contains("3") ||
                cadena.contains("4") || cadena.contains("5") || cadena.contains("6") ||
                cadena.contains("7") || cadena.contains("8") || cadena.contains("9") || cadena.contains("0");
    }
}
