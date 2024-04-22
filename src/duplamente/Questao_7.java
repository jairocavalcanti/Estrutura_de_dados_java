package duplamente;

import dados.Item;

/*
 Faça um método para partir uma lista duplamente encadeada aproximadamente ao meio. O
 método retornará a nova lista. A lista não está vazia
*/

public class Questao_7 {
    public static void main(String[] args) {
       ListaDupla lista = new ListaDupla();
       ListaDupla lista_02 = new ListaDupla();

       lista.inserirUltimo(new Item(10));
       lista.inserirUltimo(new Item(20));
       lista.inserirUltimo(new Item(30));
       lista.inserirUltimo(new Item(40));

       lista_02 = lista.partirLista();

        System.out.println("lista1:\n" + lista.toString());
		System.out.println("lista2:\n" + lista_02.toString());
		System.out.println("Quantidade de nós lista1:\n" + lista.getQuantNos());
		System.out.println("Quantidade de nós lista2:\n" + lista_02.getQuantNos());

    }
    
}
