public class SentenciaIF {

    public void examenAprobado(int nota) {
        System.out.println("Procedemos a evaluar si un examen esta OK ");
        System.out.println("La nota que vamos a evaluar es: " + nota);
        if (nota >= 5) {  // palabra reservada, no puedes usarla para nada que no sea ESTO
            System.out.println("Esto esta aprobado");
        } else {
            System.out.println("El examen está suspenso ");
        }
        System.out.println("Terminando la evaluacion del examen");
        System.out.println("Programa finalizado");
    }

    public void notaExamen(int nota) {
        // suspenso -> 0-4.99
        // aprobado -> 5-7.99
        // notable -> 8-8.99
        // sobresaliente -> 9-9.99
        // MH -> 10
        if (nota > 0 && nota <= 10) {
            if (nota < 5) {
                System.out.println("El examen está suspenso ");
            } else if (nota < 8) {
                System.out.println("El examen está aprobado");
            } else if (nota < 9) {
                System.out.println("El examen esta notable");
            } else if (nota < 10) {
                System.out.println("El examen esta sobresaliente");
            } else {
                System.out.println("Tienes matricula de honor");
            }
        } else {
            System.out.println("La nota no esta en la escala correcta ");
        }
    }
}
