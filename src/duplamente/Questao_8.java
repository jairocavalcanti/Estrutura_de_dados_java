package duplamente;

import dados.Item;

public class Questao_8 {
    public static void main(String[] args) {
       ListaDupla listaDupla = new ListaDupla();

       listaDupla.inserirUltimo(new Item(10));
       listaDupla.inserirUltimo(new Item(20));
       listaDupla.inserirUltimo(new Item(30));
       listaDupla.inserirUltimo(new Item(40));
       listaDupla.inserirUltimo(new Item(50));
    
       System.out.println("Maior elemento presente na lista dupla: " 
       + listaDupla.maiorElemento());
    
    }

}
