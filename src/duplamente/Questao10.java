package duplamente;

import dados.Item;

/* 
 Escreva um método que retira os valores iguais a 0 (zero) em uma lista duplamente
 encadeada. Pode existir 1 ou mais valores iguais a 0. Caso não encontre nenhum valor igual a
 0 retorne uma mensagem 
*/

public class Questao10 {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        lista.inserirUltimo(new Item(50));
        lista.inserirUltimo(new Item(10));
        lista.inserirUltimo(new Item(0));
        lista.inserirUltimo(new Item(0));

        System.out.println("Lista original: ");
        System.out.println(lista.toString());
        lista.retirar_0();
        System.out.println("Lista alterada: ");
        System.out.println(lista.toString());
    }

}
