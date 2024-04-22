package duplamente;

import dados.Item;

/*
  Faça um método para concatenar duas listas duplamente encadeadas. A segunda lista ficará
  vazia. As listas não estão vazias.
*/

public class Questao_6 {
    public static void main(String[] args) {
       ListaDupla listadupla = new ListaDupla();
       ListaDupla listadupla_02 = new ListaDupla();

       listadupla.inserirUltimo(new Item(10));
       listadupla.inserirUltimo(new Item(20));
       listadupla.inserirUltimo(new Item(30));

       listadupla_02.inserirUltimo(new Item(40));
       listadupla_02.inserirUltimo(new Item(50));
       listadupla_02.inserirUltimo(new Item(60));
    
       listadupla.concatenarListas_02(listadupla_02);

       System.out.println("Listas concatenadas: \n" + listadupla.toString());
       System.out.println("Lista 2:" + listadupla_02.toString());

       
    }

}
