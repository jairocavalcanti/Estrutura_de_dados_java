package pilha;

import dados.Item;

/*
  Implemente um algoritmo que teste se duas pilhas são ou não iguais. 
  O algoritmo deve retornar 1 se as duas pilhas forem iguais, e 0 caso contrário. 
  Ao final da execução, as duas pilhas devem estar no mesmo estado em que estavam no início
*/

public class Questao_3 {
   
    public static void main(String[] args) {
       PilhaContig pilha = new PilhaContig(4);
       PilhaContig pilha_2 = new PilhaContig(4);

       pilha.empilhar(new Item(20));
       pilha.empilhar(new Item(10));
       pilha.empilhar(new Item(30));
       pilha.empilhar(new Item(40));
      
       pilha_2.empilhar(new Item(20));
       pilha_2.empilhar(new Item(10));
       pilha_2.empilhar(new Item(30));
       pilha_2.empilhar(new Item(40));

       System.out.println(pilha.pilhas_iguais(pilha, pilha_2));
    }

}
