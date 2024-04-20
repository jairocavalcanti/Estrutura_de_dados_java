package simplesmente;

import dados.Item;

public class Questao_9 {
    public static void main(String[] args) {
        ListaSimples lis = new ListaSimples();

        lis.inserirUltimo(new Item(10));
        lis.inserirUltimo(new Item(20));
        lis.inserirUltimo(new Item(30));
        lis.inserirUltimo(new Item(40));

        System.out.println("Números Pares:");
        lis.imprimirNumerosPares();
    }

}
