package br.univali.poo.exercicio_1;


public class Invoice {

    private String numero;
    private String descricao;
    private int quantidade;
    private double precointem;

    public Invoice(String numero, String descricao, int quantidade, double precointem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = Math.max(quantidade, 0);
        this.precointem = Math.max(precointem, 0.0);
    }
    public void setNumero(String numero){this.numero = numero;}
    public void setDescricao(String descricao){this.descricao = descricao;}
    public  void setQuantidade(int quantidade){this.quantidade = quantidade;}
    public void setPrecointem(double precointem){this.precointem = precointem;}

    public String getNumero(){return numero;}
    public String getDescricao(){return  descricao;}
    public int getQuantidade(){return quantidade;}
    public double getPrecointem(){return precointem;}
}