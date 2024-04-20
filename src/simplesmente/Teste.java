package simplesmente;

import dados.Item;

public class Teste {
    public static void main(String[] args) {

        ListaSimples lis = new ListaSimples();

        lis.inserirUltimo(new Item(4));
        lis.inserirUltimo(new Item(4));
        lis.inserirUltimo(new Item(4));

        System.out.println();
        lis.substituir_ultimo_numero(10);
        System.out.printf(lis.toString());

    }

}
