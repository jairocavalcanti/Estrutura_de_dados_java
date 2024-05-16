package pilha;

import dados.Item;

/*
  Faça um método que retire os valores maiores que 10 da pilha por contiguidade (obedecendo sua propriedade) 
*/

public class Questao_2 {
    public static void main(String[] args) {
       PilhaContig pilha = new PilhaContig(4);

       pilha.empilhar(new Item(20));
       pilha.empilhar(new Item(10));
       pilha.empilhar(new Item(30));
       pilha.empilhar(new Item(40));

       pilha.retirar_maiores_de_10();
 
    }

}
