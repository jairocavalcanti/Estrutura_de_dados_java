package filaCircular;

import dados.Item;

/* */

public class Questao_1 {
    public static void main(String[] args) {
        FilaCircular fila = new FilaCircular(4);

        fila.enfileirar(new Item(-5));
        fila.enfileirar(new Item(6));
        fila.enfileirar(new Item(-10));
        fila.enfileirar(new Item(8));

        System.out.println(fila.toString());

        System.out.println(fila.retirarnegativos());     

    }
    
}
