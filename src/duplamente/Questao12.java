package duplamente;

import dados.Item;

/* 
 Implemente um método para mostrar os nomes dos
 atletas com altura maior que 2 metros.
*/ 

public class Questao12 {

    public static void main(String[] args) {
        ListaDupla listadupla = new ListaDupla();

        listadupla.inserirUltimo(new Item("Mario", 1.80));
        listadupla.inserirUltimo(new Item("Bruno", 2.10));
        listadupla.inserirUltimo(new Item("Tadeu", 2.01));
        listadupla.inserirUltimo(new Item("Luiz", 1.95));
        listadupla.inserirUltimo(new Item("João", 2.05));

        System.out.println("Nomes dos atletas com mais de 2 metros de altura: ");
        listadupla.mostrar_nomes();
        
    }

}
