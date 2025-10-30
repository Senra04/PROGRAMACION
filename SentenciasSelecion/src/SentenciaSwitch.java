import java.util.Scanner;

public class SentenciaSwitch {

    public void usoSwitchInt() {
        // obtenido por el usuario o por parametros
        String nombre = null;
        int valor = 5;
        // 1, 5, 7, o resto
        switch (valor) {
            case 1:
                //cuerpo cuando la variable toma valor 1
                nombre = "Diego";
                System.out.println("Toma valor de 1 ");
                break;

            case 5:
                //cuerpo cuando la variable toma valor 5
                nombre = "Maria";
                System.out.println("Toma valor de 5 ");
                break;

            case 7:
                //cuerpo cuando la variable toma valor 7
                nombre = "Pepito";
                System.out.println("Toma valor de 7 ");
                break;
            default:
                nombre = "sin nombre";
                System.out.println("Valor no contemplado ");


        }
        System.out.println("El nombre resultante es " + nombre);
        System.out.println("Terminado el bloque switch ");
    }

    public void usoSwitchString() {
        String nombre = "Diego";
        switch (nombre.toLowerCase()) { //.toLowerCase para pasar todo a minusculas para que lo analice
            case "borja":
                System.out.println("El nombre es borja");
                break;

            case "maria":
                System.out.println("El nombre es maria");

                break;

            case "diego":
                System.out.println("El nombre es diego");

                break;

            default:
                System.out.println("Nombre no contemplado");
        }
        System.out.println("Terminando de analizar el nombre");
    }

    public void usoSwitchChar() {
        char letra = 'A';
        switch (letra) {
            case 'A':
                System.out.println("Hola");
                break;

            case 'B':
                break;

            case 'C':
                break;

            case 'D':
                break;

            case 69:
                break;

            default:
                System.out.println("Letra no contemplada");
        }
    }

    public void usoSwitchLambda() {
        int nota = 7;
        switch (nota) {
            case 1 -> {
                System.out.println("Seleccionado el caso 1");
            }
            case 2 -> {
                System.out.println("Seleccionado el caso 2");
            }
            case 3 -> {
                System.out.println("Seleccionado el caso 3");
            }
            case 4 | 5 | 6 | 7 -> {
                System.out.println("Seleccionado el caso 4");
            }
            default -> {
                System.out.println("Sin contemplar");
            }
        }

    }

    public void menuOpciones() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu operaciones");
        System.out.println("1. Sumar ");
        System.out.println("2. Restar ");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir ");
        System.out.println("5. Modulo");
        System.out.println("Que operacion quieres hacer");
        int opcion = scanner.nextInt();
        System.out.println("Dime el primer operando");
        int op1 = scanner.nextInt();
        System.out.println("Dime el segundo operando");
        int op2 = scanner.nextInt();
        double resultado = 0;
        switch (opcion) {
            case 1 -> {
                System.out.println("Vas a sumar");
                resultado = op1 + op2;
            }
            case 2 -> {
                System.out.println("Vas a restar");
                resultado = op1 - op2;
            }
            case 3 -> {
                System.out.println("Vas a multiplicar");
                resultado = op1 * op2;
            }
            case 4 -> {
                System.out.println("Vas a dividir");
                resultado = (double) op1 / op2;
            }
            case 5 -> {
                System.out.println("Vas a modular");
                resultado = op1 % op2;
            }
            default -> {
                System.out.println("Datos incorrectos ");
            }
        }
        System.out.printf("El resultado de la operacion es %.1f%n", resultado);

    }
}

