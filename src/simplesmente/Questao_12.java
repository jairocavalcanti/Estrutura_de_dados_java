package simplesmente;

import dados.Item;

public class Questao_12 {
    public static void main(String[] args) {
        ListaSimples lis = new ListaSimples();

        lis.inserirUltimo(new Item(12));
        lis.inserirUltimo(new Item(15));
        lis.inserirUltimo(new Item(14));
        lis.inserirUltimo(new Item(15));

        System.out.println(lis.procurarOuInserir(15));
        System.out.println("--------------------------");
        System.out.println(lis.toString());
    }

}
