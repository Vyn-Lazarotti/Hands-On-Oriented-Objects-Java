import java.util.*;

public class Fila {

    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();
        fila.add("Vinicius");
        fila.add("Marcelo");
        fila.add("Kaio");
        fila.add("Cadu");
        fila.add("Rita");
        fila.add("Helena");

        System.out.println("Fila: " + fila);
        for (int i = 0; i < 2; i++) {
            System.out.println("Cliente atendido: " + fila.poll());
        }
        System.out.println("Fila atual: " + fila);
    }

}