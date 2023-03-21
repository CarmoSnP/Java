package br.univali.poo.exercicio3;

public class main {
    public static void main(String[] args){
        Ingresso i = new Ingresso(20);
        IngressoVip ii = new IngressoVip(30, 20);

        System.out.println(i.toString());
        System.out.println(ii.toString());
    }
}
