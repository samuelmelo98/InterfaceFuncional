package model;

import model.enums.TipoProduto;

public class Produtos {
    private Long qtd;
    TipoProduto tipo;
    private String marca;
    private Double valor;

    public Produtos(Long quantidade, TipoProduto tipo, String marca, Double valor){
        this.qtd = quantidade;
        this.tipo = tipo;
        this.marca = marca;
        this.valor = valor;
    }

    public Long getQtd() {
        return qtd;
    }

    public void setQtd(Long qtd) {
        this.qtd = qtd;
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProduto tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
