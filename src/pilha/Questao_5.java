package pilha;

public class Questao_5 {
    public static void main(String[] args) {
      PilhaContigChar pilha = new PilhaContigChar(4);

      String palavra = "casa";
      String palavra_2 = "asac";

      System.out.println(pilha.palavra_inversa(palavra, palavra_2));
    
    }

}
