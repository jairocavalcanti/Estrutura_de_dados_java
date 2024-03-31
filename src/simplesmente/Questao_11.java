package simplesmente;

import java.util.Scanner;
import dados.Item;

public class Questao_11 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       ListaSimples lis = new ListaSimples();

       lis.inserirUltimo(new Item(10));
       lis.inserirUltimo(new Item(20));
       lis.inserirUltimo(new Item(30));
       lis.inserirUltimo(new Item(40));

       System.out.println("Insira um valor qualquer");
       int valor = scanner.nextInt();

       lis.procurarValor(valor);

       System.out.println(lis.toString());
       scanner.close();
    }
    
}
