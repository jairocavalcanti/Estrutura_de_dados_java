package simplesmente;

import dados.Item;

public class Teste_3 {
    public static void main(String[] args) {
    
        ListaSimples lis = new ListaSimples();

        lis.inserirUltimo(new Item(2));
        lis.inserirUltimo(new Item(4));
        lis.inserirUltimo(new Item(8));

        System.out.println();
        
        System.out.println(lis.toString());        
        lis.somaPar_e_inserir_em_ultimo();
        System.out.println(lis.toString());

    }
    
}
