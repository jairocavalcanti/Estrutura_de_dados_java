package duplamente;

import dados.Item;

public class Questao11 {
    public static void main(String[] args) {
      ListaDupla listadupla = new ListaDupla();

      listadupla.inserirUltimo(new Item(0));
      listadupla.inserirUltimo(new Item(10));
      listadupla.inserirUltimo(new Item(20));
      listadupla.inserirUltimo(new Item(30));
      listadupla.inserirUltimo(new Item(40));
      listadupla.inserirUltimo(new Item(10));

      System.out.println("Lista original: ");
      System.out.println(listadupla.toString() + "\n");
      
      System.out.println("Lista alterada pelo método: ");
      listadupla.retirar_repetidos();
      System.out.println(listadupla.toString());
    }

}
