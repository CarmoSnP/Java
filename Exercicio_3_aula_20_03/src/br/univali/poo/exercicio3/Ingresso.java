package br.univali.poo.exercicio3;

public class Ingresso {
    private double valor;

    public Ingresso(){ this.valor = 0; }
    public Ingresso(double valor){ this.valor = valor; }

    public void setValor (double valor){ this.valor = valor; }

    public double getValor(){ return valor; }

    @Override
    public String toString(){ return String.format("%s: %s%n","valor", getValor()); }

}
