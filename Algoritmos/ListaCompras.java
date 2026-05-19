import java.util.*;

public class ListaCompras {

    public static void main (String[] args) {

        ArrayList<String> produtos = new ArrayList<>();
        produtos.add("Pão");
        produtos.add("Frango");
        produtos.add("Alface");
        produtos.add("Queijo");
        produtos.add("Ketchup");

        for(String produto : produtos) {
            System.out.println("Produto: " + produto);
            System.out.println(produtos.size());
        }

    }
}