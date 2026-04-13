public class SentenciaFor {

    public void sentenciaFor() {

        for (int i = 0; i <= 5; i += 1) {
            //inicial;final;incrementa
            // [0,4]

            /*System.out.printf("%d",i);   esto es un contador visual que va cargando poco a poco
           try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
            System.out.println("Ejecutando incremento " + i);
        }
        System.out.println("");// salto de linea

        System.out.println("Ahora pruebo decrementando");

        System.out.println("");// salto de linea
        for (int i = 5; i >= 0; i -= 1) {
            if (i % 2 == 0) { // si quiero una condicion para que decremente de algun modo en concreto, solo pares ejmplo
                System.out.println("Ejecutando decremento " + i);
            }
        }
    }

    public void tablaMultiplicarNumero(int numero) {
        // 6
        // 6*0,6*1,6*2...etc
        System.out.println("Procedemos a escribir la tabla de multiplicar del " + numero);
        //[0,1,2.....10]
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d * %d = %d%n", i, numero, i * numero);//%n salto de linea
        }
    }

    public void todasTablas() {
        // tablas del 0 al 10
        for (int i = 0; i < 11; i++) {
            System.out.println("Sacando la tabla del " + i);
            // i=1 ---> 1*0,1*2...etc
            // i= 2 ----> 2*0.2*1....etc
            for (int j = 0; j < 11; j++) {
                System.out.printf("\t%d * %d = %d%n", j, i, i * j);
            }
        }
    }

    public void dibujarCuadrado() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    System.out.print("*");
                } else if (j == 0 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

