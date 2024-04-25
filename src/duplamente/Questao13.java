package duplamente;

import dados.Item;

/*
 Escreva um algoritmo que a partir de uma Lista Duplamente Encadeada denominada L1,
 identifique nesta lista todos os produtos enlatados e insira-os em uma outra Lista Duplamente
 Encadeada denominada L2. Considerações:
• Este método deverá ser escrito na classe da ListaDupla.
• A lista L1 não está vazia e a L2 já está instanciada e vazia, será passada por parâmetro.
• Se o valor do campo chave for maior do que 100 são produtos enlatados
*/

public class Questao13 {
    public static void main(String[] args) {
        ListaDupla listadupla = new ListaDupla();
        ListaDupla listadupla2 = new ListaDupla();

        listadupla.inserirUltimo(new Item(150));
        listadupla.inserirUltimo(new Item(70));
        listadupla.inserirUltimo(new Item(225));
        listadupla.inserirUltimo(new Item(102));
        listadupla.inserirUltimo(new Item(35));

        System.out.println("\n");
        listadupla.enlatados(listadupla2);

    }

}
