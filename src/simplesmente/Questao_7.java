package simplesmente;

import dados.Item;

public class Questao_7 {
  public static void main(String[] args) {
    ListaSimples lis = new ListaSimples();

    lis.inserirUltimo(new Item(10));
    lis.inserirUltimo(new Item(10));
    lis.inserirUltimo(new Item(10));
    lis.inserirUltimo(new Item(10));

    System.out.println("Lista criada: \n " + lis.toString());

    int soma = lis.calcularSoma();

    if (soma == 0) {
      System.out.println("A lista está vazia!");
    } else {
      System.out.println("A soma é: " + soma);
    }
  }
}
