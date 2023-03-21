package br.univali.poo.exercicio3_2;

public class Vendedor extends Empregado{

    private float percentualComisao;

    public Vendedor(String nome, float salario, float percentualComisao)
    {
        super(nome, salario);
        this.percentualComisao = percentualComisao;
    }

    public void setPercentualComisao (float percentualComisao){ this.percentualComisao = percentualComisao; }

    public float getPercentualComisao(){ return percentualComisao; }

    public float calcularSalario(){return super.getSalario() + (super.getSalario() * (getPercentualComisao() / 100));}

    @Override
    public String toString()
    {
        return String.format( super.toString()+"%n%s: %n%s%n%s: %s%n","percentual", getPercentualComisao()/100,
                "salario com comisao", calcularSalario());
    }
}
