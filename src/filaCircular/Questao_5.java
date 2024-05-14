package filaCircular;

import dados.Item;

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
