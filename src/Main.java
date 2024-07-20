import model.OrdenaProdutoPorPreco;
import model.Produtos;
import model.enums.TipoProduto;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Instancia um objeto do tipo Retangulo por meio da interface Figura.
         */
        Figura figura = Retangulo::new;
        figura.calcula(10.0,10.2);
        System.out.println(figura.calcula(10.5,10.9));

        /*
        Pacote Stream
         */
        System.out.println("--------------------------------------------------");
        System.out.println("Pacote Stream");
         List<Produtos> listaProdutos = new ArrayList<>();
//                 Arrays.asList(
//                new Produtos(5L, TipoProduto.GELADEIRA, "Samsung", 100.0),
//                new Produtos(3L, TipoProduto.FOGÃO, "Dako", 101.0),
//                new Produtos(2L, TipoProduto.CELULAR, "Apple", 100.0));
         //Cria alguns produtos do tipo geladeria
        for(int i = 0; i < 5; i++){
            Produtos p =null;
             p = new Produtos(i-1L, TipoProduto.GELADEIRA, "Samsung"+i, 100.0+i);
            listaProdutos.add(p);
        }

        //Cria uma lista só de geladeiras
        List<Produtos> listaGeladeiras = new ArrayList<Produtos>();
        for (Produtos p : listaProdutos) {
            if (p.getTipo().equals(TipoProduto.GELADEIRA)) {
                listaGeladeiras.add(p);
            }
        }
        //Ordena a lista de geladeira
        Collections.sort(listaGeladeiras, new OrdenaProdutoPorPreco());

        //Lista dos nomes das geladeiras
        List<String> listaNomeGeladeiras = new ArrayList<>();
        for(Produtos p : listaGeladeiras){
            listaNomeGeladeiras.add(p.getMarca().toUpperCase());
        }

        for(String nome: listaNomeGeladeiras){
            System.out.println(nome);
        }

        /*
        *Ideia de pipeline saída de uma operação é a entrada da outra.
        * Fluxo de dados com Stream

         */
        System.out.println("-----------------------------------------------------------");
        System.out.println("Fazendo os passos anteriores com a interface stream");
        System.out.println("PIPELINE");
        listaProdutos.stream().filter(p -> p.getTipo().equals(TipoProduto.GELADEIRA))
                .sorted((p1,p2)-> p1.getValor()
                        .compareTo(p2.getValor())).map(p -> p.getMarca().toUpperCase()).forEach(System.out::println);
    }

}
