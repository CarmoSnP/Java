package br.univali.poo.exercicio3_2;

public class main {
    public static void main (String[] args){

        Gerente teste = new Gerente("igor", 200F, "RH");
        Vendedor teste1 = new Vendedor("vini", 5000F, 50);

        System.out.println(teste.toString());
        System.out.println(teste1.toString());
    }
}
