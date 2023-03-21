package br.univali.poo.exercicio3_2;

public class Gerente extends Empregado{

    private String departamento;
    public Gerente(String nome, float salario, String departamento) {
        super(nome, salario);
        this.departamento  = departamento;
    }

    public void setDepartamento(String departamento){ this.departamento = departamento; }

    public String getDepartamento(){ return departamento; }

    @Override
    public String toString()
    {
        return String.format(super.toString() + "%n%s: %s%n","Departemento", getDepartamento());
    }
}
