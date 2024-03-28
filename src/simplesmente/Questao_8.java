package simplesmente;

import dados.Item;

public class Questao_8 {
    public static void main(String[] args) {
      ListaSimples lis = new ListaSimples();

      lis.inserirUltimo(new Item(5));
      lis.inserirUltimo(new Item(5));
      lis.inserirUltimo(new Item(2));
      lis.inserirUltimo(new Item(5));
    
      System.out.println("Lista criada: \n" + lis.toString());

      Double media = lis.calcularmedia();
      if(media == 0){
        System.out.println("A lista esta vazia");
      }else{
        System.out.println("A media é: " + media);
      }
    }
    
}
