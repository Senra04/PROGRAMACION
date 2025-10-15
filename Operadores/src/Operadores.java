public class Operadores {
    public void operadoresAritmeticos(){
        //unarios
        int operandoUno = 5;
        // incremento -> para poder hacer un contador
        operandoUno++; // esto le suma uno al valor que ya tenia
        operandoUno++;
        operandoUno++;
        operandoUno++;

        System.out.println("El valor de operando uno es "+operandoUno);
        // decremento -> le resta uno al valor que ya tenia ->
        operandoUno--;
        operandoUno--;
        operandoUno--;

        System.out.println("El valor del operando uno despues de los decrementos es "+operandoUno);
        // binarios -> dos operadores: sima (+) resta (-) multi(*) div (/) modulo-resto division (%)
        operandoUno = 8; // reasignamos un valor para la siguiente operacion, si lo quito se usaria el valor anterior
        int operandoDos= 3;
        int suma = operandoUno + operandoDos;

        System.out.println("El resultado de la suma es "+suma);
        System.out.println("El resultado de la suma es "+(operandoUno+operandoDos));
        System.out.println("El resultado de la suma es "+operandoUno+operandoDos);

        int resta = operandoUno-operandoDos;
        System.out.println("El resultado de la resta es "+resta);
        int multi = operandoUno*operandoDos;
        System.out.println("El resultado de la multiplicacion es "+multi);

        double division = (double)operandoUno/operandoDos; // -> la division de dos numeros enteros da como resultado un INT
        // -> Si quieres una division real, uno de los operando hay que pasarlo MOMENTANEAMENTE(casting) a double añadiendo (double) delannte
        System.out.println("El resultado de la division es "+division);

    }
}
