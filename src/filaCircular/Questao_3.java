package filaCircular;

import dados.Item;
import pilha.PilhaContig;

/*
   Implemente um método para transferir todos os elementos de uma Pilha por Contiguidade para uma Fila Circular. 
   O método retornará a Fila Circular preenchida com os elementos da Pilha. 
   Os elementos deverão ser inseridos na Fila de forma que o primeiro que entrou na Pilha será o primeiro a entrar na fila. 
   As duas estruturas contém um único campo inteiro
*/

public class Questao_3 {
    public static void main(String[] args) {
        PilhaContig pilha = new PilhaContig(4);
        FilaCircular fila = new FilaCircular(4);
       
        pilha.empilhar(new Item(1));
        pilha.empilhar(new Item(2));
        pilha.empilhar(new Item(3));
        pilha.empilhar(new Item(4));

        System.out.println("\nFila antes da transferência: " + fila.toString());

        fila.transferir(pilha , fila);

        System.out.println("Fila após a transferência: " + fila.toString());

    }

}
