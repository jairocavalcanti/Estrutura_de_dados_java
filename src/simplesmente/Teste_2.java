package simplesmente;

import dados.Item;

public class Teste_2 {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();

        lista.inserirUltimo(new Item(3));
        lista.inserirUltimo(new Item(7));
        lista.inserirUltimo(new Item(1));
        lista.inserirUltimo(new Item(4));

        lista.adicionar_primeiro_numero();
        System.out.println();
        System.out.printf(lista.toString());

    }

}
