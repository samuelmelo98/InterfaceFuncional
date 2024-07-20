package model;

import java.util.Comparator;
/*
Classe criada para comparar o valor dos objetos Produtos
 */
public class OrdenaProdutoPorPreco implements Comparator<Produtos> {

    //método da interface comparator
    @Override
    public int compare(Produtos o1, Produtos o2) {
        return o1.getValor().compareTo(o2.getValor());
    }
}
