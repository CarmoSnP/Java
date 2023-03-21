package br.univali.poo.exercicio_1;

public class InvoiceTeste
{
    public static void main(String[] args){
        Invoice teste1 = new Invoice("123", "teste1", 2, 10);
        Invoice teste2 = new Invoice("456", "teste2", 3, 20);

        System.out.print("Numero: " + teste1.getNumero() + "\n");
        System.out.print("Descicao: " + teste1.getDescricao() + "\n");
        System.out.print("Quantidade: " + teste1.getQuantidade() + "\n");
        System.out.print("Preco Intem: " + teste1.getPrecointem() + "\n");

        System.out.println("Numero: " + teste2.getNumero() + "\n");
        System.out.print("Descicao: " + teste2.getDescricao() + "\n");
        System.out.print("Quantidade: " + teste2.getQuantidade() + "\n");
        System.out.print("Preco Intem: " + teste2.getPrecointem() + "\n");
    }
}
