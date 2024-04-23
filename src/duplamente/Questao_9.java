package duplamente;

import dados.Item;

/*
 Implemente um método que calcule a média aritmética dos valores armazenados em uma
 lista duplamente encadeada, não se sabe o estado da lista.
*/

public class Questao_9 {
    public static void main(String[] args) {
        ListaDupla listadupla = new ListaDupla();

        listadupla.inserirUltimo(new Item(10));
        listadupla.inserirUltimo(new Item(20));
        listadupla.inserirUltimo(new Item(30));
        listadupla.inserirUltimo(new Item(40));
        listadupla.inserirUltimo(new Item(50));

        System.out.println("Média aritmética dos elementos da lista: " 
        + listadupla.mediaaritmetica());
    }

}
