import java.util.*;

public class Matricula {

    public static void main(String[] args) {

        HashMap<Integer, String> alunos = new HashMap<>();
        alunos.put(101, "Maria");
        alunos.put(102, "João");
        alunos.put(103, "Gabriel");
        alunos.put(104, "Jullia");

        System.out.println("Aluno/a encontrado/a: " + alunos.get(103));

        alunos.remove(104);

        System.out.println("Alunos encontrados: " + alunos);
        
    }
}
