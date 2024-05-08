package filaCircular;

import dados.Item;
import duplamente.ListaDupla;

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
