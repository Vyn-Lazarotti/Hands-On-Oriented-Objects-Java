import java.util.*;

public class Notas {

    public static void main(String[] args) {

        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7.5);
        notas.add(10.0);
        notas.add(2.3);
        notas.add(5.6);

        double soma = 0;

        for(double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.size();
        System.out.println("Média da turma: " + media);

        if (media >= 7) {
            System.out.println("A turma ficou com média acima ou igual a 7");
        }else {
            System.out.println("A turma ficou com média abaixo de 7");
        }
    }
}