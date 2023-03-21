package br.univali.poo.exercicio3;

public class IngressoVip extends Ingresso {

    private double valorAdicional;
    public IngressoVip(){
        super();
        valorAdicional = 0;
    }
    public IngressoVip(double valorAdicional, double valor){
        super(valor);
        this.valorAdicional = valorAdicional; }

    public IngressoVip(double i) {
    }

    public void setValorAdicional(double valorAdicional){ this.valorAdicional = valorAdicional; }

    public  double getValorAdicional(){ return valorAdicional; }

    @Override
    public String toString(){ return String.format(super.toString() + "%n%s: %s%n%n%s: %s%n", "valor adicional",getValorAdicional(),"valor vip", getValorAdicional() + getValor());}
}
