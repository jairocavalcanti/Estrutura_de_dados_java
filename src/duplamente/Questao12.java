package duplamente;

import dados.Item;

public class Questao12 {

    public static void main(String[] args) {
        ListaDupla listadupla = new ListaDupla();

        listadupla.inserirUltimo(new Item("Jairo", 2.90));
        listadupla.inserirUltimo(new Item("Alexandre", 2.80));
        listadupla.inserirUltimo(new Item("Adrian", 1.80));
        listadupla.inserirUltimo(new Item("Marcos", 2.95));
        listadupla.inserirUltimo(new Item("Garcia", 1.70));

        System.out.println("Nomes dos atletas com mais de 2 metros de altura: ");
        listadupla.mostrar_nomes();
        
    }

}
