public class Operadores {
    public void operadoresAritmeticos() {
        //unarios
        int operandoUno = 5;
        // incremento -> para poder hacer un contador
        operandoUno++; // esto le suma uno al valor que ya tenia
        operandoUno++;
        operandoUno++;
        operandoUno++;

        System.out.println("El valor de operando uno es " + operandoUno);
        // decremento -> le resta uno al valor que ya tenia ->
        operandoUno--;
        operandoUno--;
        operandoUno--;

        System.out.println("El valor del operando uno despues de los decrementos es " + operandoUno);
        // binarios -> dos operadores: sima (+) resta (-) multi(*) div (/) modulo-resto division (%)
        operandoUno = 8; // reasignamos un valor para la siguiente operacion, si lo quito se usaria el valor anterior
        int operandoDos = 3;
        int suma = operandoUno + operandoDos;

        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la suma es " + (operandoUno + operandoDos));
        System.out.println("El resultado de la suma es " + operandoUno + operandoDos);

        int resta = operandoUno - operandoDos;
        System.out.println("El resultado de la resta es " + resta);
        int multi = operandoUno * operandoDos;
        System.out.println("El resultado de la multiplicacion es " + multi);

        double division = (double) operandoUno / operandoDos; // -> la division de dos numeros enteros da como resultado un INT
        // -> Si quieres una division real, uno de los operando hay que pasarlo MOMENTANEAMENTE(casting) a double añadiendo (double) delannte
        System.out.println("El resultado de la division es " + division);

        int modulo = operandoUno % operandoDos;
        System.out.println("El módulo de la división es " + modulo);
        // el modulo me vale para saber si un numero es par o impar, si el resultado es par es 0

    }

    public void operadoresAsignacion() {
        int operadorUno = 10;
        int operadorDos = 6;

        // operadorUno = operadorUno + 5; se puede nombrar asi pero no es lo correcto
        operadorUno += 5; // en operador uno guarda el valor de operadorUno mas lo que indicamos (5)
        operadorUno += operadorDos;
        System.out.println("El valor de operadorUno es " +operadorUno);

        operadorUno -= 5;
        System.out.println("El valor de operadorUno es "+operadorUno);

        operadorUno *= 2;
        System.out.println("El valor de operadorUno es "+operadorUno);

        operadorUno %= 2;
        System.out.println("El valor de operadorUno es "+operadorUno);
    }
    //
    public void operadoresComparacion(){
        int operadorUno = 10;
        int operadorDos = 20;
        boolean resultado = operadorUno>operadorDos;
        System.out.println("El resultado de la comparacion es "+resultado);
        resultado = operadorUno<operadorDos;
        System.out.println("El resultado de la comparacion es "+resultado);
        resultado = operadorUno<=operadorDos;
        resultado = operadorUno>=operadorDos;
        resultado = operadorUno==operadorDos;
        resultado = operadorUno!=operadorDos;

    }

    public void operadoresLogicos(){
        int sueldo = 20000;
        int edad = 45;
        boolean conducir = true;
        // mi candidato es valido cuando quiere cobrar menos de 30K, menos de 40 y tiene carne
        // !conducir -> se niega el valor de conducir
        boolean candidatoValido = sueldo<30000 && edad<40 &&  conducir;
        candidatoValido = sueldo<20000 || edad<25 || conducir;
        // candidatoValido = sueldo<20000 || edad<25 || conducir && sueldo>25000 && edad>50;
        // en este supuesto los && prevalecen sobre || con lo que daría False
        System.out.println("El candidato es "+candidatoValido);

        // && -> para que se cumpla todos son true
    }

    public void evaluarCandidato(double sueldo, int edad, boolean conducir, String nombre){
        boolean resultado = sueldo<=20000 && edad<40 && conducir;
        System.out.println("Evaluando al candidato"+nombre);
        System.out.println("la evaluacion del candidato es "+resultado);
    }
}
