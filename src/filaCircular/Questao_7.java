package filaCircular;

import dados.Item;
import duplamente.ListaDupla;

/*
 
7) Foram realizadas inscrições para a maratona de programação. Estas inscrições foram armazenadas em uma Fila Circular. 
O problema é que um conjunto de alunos não podem mais participar do evento. 
Implemente um método que retire da Fila todas as ocorrências destes alunos e insira em uma Lista Duplamente encadeada. Considerações:
   
   - A Fila não está vazia e a Lista será retornada pelo método; 
   - As duas estruturas têm o mesmo tipo de dados;
   - Se o valor do campo chave for “true”, o aluno será removido da fila e inserido no final da Lista Duplamente Encadeada. 

   A Fila pode ter um, vários ou nenhum aluno com chave igual à “true”;
Os alunos com campos chaves iguais à “false” deverão permanecer na fila na mesma ordem em que entraram.

*/

public class Questao_7 {
    public static void main(String[] args) {
        FilaCircular fila = new FilaCircular(4);
        ListaDupla listadupla = new ListaDupla();

        fila.enfileirar(new Item(true));
        fila.enfileirar(new Item(false));
        fila.enfileirar(new Item(true));
        fila.enfileirar(new Item(false));
        
        System.out.println("fila: " + fila.toString());

        System.out.println(fila.removeralgo(listadupla));
    
        System.out.println("Fila atualizada: " + fila.toString());
        /* 
        System.out.printf("Lista dupla:\n" + listadupla.toString());
       
        System.out.println("fila: " + fila.toString());
        */
    }

}
