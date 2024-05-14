package filaCircular;

import dados.Item;

/*
  Em um banco financeiro existem pessoas de todas as idades em uma fila de caixa para serem atendidas. 
  Retire desta fila as pessoas com idade maior e igual a 70 anos e as coloque em uma nova fila. 
  A fila original deve permanecer com as demais pessoas. Faça um método para alcançar este objetivo usando fila circular. 
  Considere que existe um atributo chamado idade para verificar a seleção e o tamanho máximo que a fila pode ter é de 100 posições.
*/

public class Questao_5 {
    
    public static void main(String[] args) {
       FilaCircular fila = new FilaCircular(8);
       FilaCircular fila_2 = new FilaCircular(8);

       fila.enfileirar(new Item(23));
       fila.enfileirar(new Item(77));
       fila.enfileirar(new Item(56));
       fila.enfileirar(new Item(45));
       fila.enfileirar(new Item(70));
       fila.enfileirar(new Item(72));
       fila.enfileirar(new Item(25));
       fila.enfileirar(new Item(30));

       System.out.println("Fila original: ");
       System.out.println(fila.toString());

       System.out.println("Valores maiores que 70 inseridos em nova fila: ");
       fila.fila_caixa(fila, fila_2);
       System.out.println(fila_2.toString());

       System.out.println("Fila original modificado: ");
       System.out.println(fila.toString());
    }

}
