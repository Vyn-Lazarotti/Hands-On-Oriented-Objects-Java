import java.util.*;

public class Atleta {

    private String nome;
    private int numero;
    private String posicao;

    public Atleta(String nome, int numero, String posicao) {
        this.nome = nome;
        this.numero = numero;
        this.posicao = posicao;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Nome: " + nome + ", Número: " + numero + ", Posição: " + posicao;
    }

    public static void main(String [] arguments){
        List<Atleta> atletas = new ArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome = sc.nextLine();
        System.out.println("Informe o número: ");
        int num = sc.nextInt();
        System.out.println("Informe a posição: ");
        sc.nextLine();
        String pos = sc.nextLine();

        atletas.add(new Atleta(nome, num, pos));
        atletas.add(new Atleta("Olavo", 10, "pivo"));
        atletas.add(new Atleta("Neymar", 10, "atacante"));
        atletas.add(new Atleta("Caio", 19, "centro avante"));
        atletas.add(new Atleta("Wellington", 10, "atacante"));

        /* for (int i = 0; i < atletas.size(); i++) {
            System.out.println(atletas.get(i).getNome());
            System.out.println(atletas.get(i).toString());
        } */


        for (Atleta a : atletas) {
            System.out.println(a);
        }

        sc.close();
    }
}
