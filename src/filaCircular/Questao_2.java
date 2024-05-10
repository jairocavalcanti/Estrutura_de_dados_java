package filaCircular;

import dados.Item;

/*
  Escreva uma função que retorne a soma dos elementos de uma fila circular. 
  A fila contém dados e ao final deverá ficar vazia. Os elementos são do tipo inteiro 
*/

public class Questao_2 {
    public static void main(String[] args) {
        FilaCircular fila = new FilaCircular(4);

        fila.enfileirar(new Item(10));
        fila.enfileirar(new Item(15));
        fila.enfileirar(new Item(20));
        fila.enfileirar(new Item(25));

        System.out.println("Fila: " + fila.toString());

        System.out.println("Soma dos elementos da fila: " + fila.somarFila());
    }

}
