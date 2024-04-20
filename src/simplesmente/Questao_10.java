package simplesmente;

import dados.Item;

public class Questao_10 {
  public static void main(String[] args) {
    ListaSimples lis = new ListaSimples();
    ListaSimples lis_2 = new ListaSimples();

    lis.inserirUltimo(new Item(10));
    lis.inserirUltimo(new Item(10));
    lis.inserirUltimo(new Item(10));
    lis.inserirUltimo(new Item(10));

    lis_2.inserirUltimo(new Item(5));
    lis_2.inserirUltimo(new Item(10));
    lis_2.inserirUltimo(new Item(10));
    lis_2.inserirUltimo(new Item(10));

    if (lis.saoIdenticas(lis, lis_2)) {
      System.out.println("identicas");
    } else {
      System.out.println("Nao sao identicas");
    }

  }

}
