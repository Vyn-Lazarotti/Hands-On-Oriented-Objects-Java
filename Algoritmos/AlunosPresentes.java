import java.util.*;

public class AlunosPresentes {

    public static void main(String[] args) {

        HashSet<String> nomesAlunos = new HashSet<>();
        nomesAlunos.add("Vinicius");
        nomesAlunos.add("Beatriz");
        nomesAlunos.add("Beatriz");
        nomesAlunos.add("Anna");
        nomesAlunos.add("Duda");
        nomesAlunos.add("Carlos");
        nomesAlunos.add("Marcelo");
        nomesAlunos.add("João");
        nomesAlunos.add("João");
        nomesAlunos.add("Emily");

        System.out.println("Alunos presentes: " + nomesAlunos);
        System.out.println("Quantidade de alunos presentes: " + nomesAlunos.size());

    }
}
