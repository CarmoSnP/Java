package br.univali.poo.exercicio3_2;

public class Empregado {
    private String nome;
    private float salario;

    public Empregado (String nome, float salario)
    {
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome (String nome){this.nome = nome;}
    public void setSalario(float salario){this.salario = salario;}

    public String getNome(){return nome;}
    public float getSalario(){return salario;}

    @Override
    public String toString(){return String.format("%s: %s%n%s: %s%n","nome", getNome(),"salario", getSalario());}
}
