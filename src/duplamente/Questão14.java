package duplamente;

import dados.Item;

public class Questão14 {
    public static void main(String[] args) {
        ListaDupla listadupla = new ListaDupla();

        listadupla.inserirUltimo(new Item('a'));
        listadupla.inserirUltimo(new Item('r'));
        listadupla.inserirUltimo(new Item('a'));
        listadupla.inserirUltimo(new Item('r'));
        listadupla.inserirUltimo(new Item('a'));

        System.out.println(listadupla.palindroma());
    }

}
