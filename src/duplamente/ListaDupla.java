package duplamente;

import dados.Item;

public class ListaDupla {

    private NoDupla prim;
    private NoDupla ult;
    private int quantNos;

    public ListaDupla() {
        this.prim = null;
        this.ult = null;
        this.quantNos = 0;
    }

    public int getQuantNos() {
        return this.quantNos;
    }

    public NoDupla getPrim() {
        return this.prim;
    }

    public NoDupla getUlt() {
        return this.ult;
    }

    public void setQuantNos(int valorNovo) {
        this.quantNos = valorNovo;
    }

    public void setPrim(NoDupla novoNo) {
        this.prim = novoNo;
    }

    public void setUlt(NoDupla novoNo) {
        this.ult = novoNo;
    }

    public boolean eVazia() {
        return (this.prim == null);
    }

    // insere um novo nó no final da lista ou se a lista estiver vazia, insere
    // o primeiro nó na lista
    public void inserirUltimo(Item elem) {
        NoDupla novoNo = new NoDupla(elem);
        if (this.eVazia())
            this.prim = novoNo;
        else {
            novoNo.setAnt(this.ult);
            this.ult.setProx(novoNo);
        }
        this.ult = novoNo;
        this.quantNos++;
    }

    // retorna o endereço do nó que está contendo o valor a ser procurado.
    public NoDupla pesquisarNo(int chave) {
        NoDupla atual = this.prim;
        while ((atual != null) && (atual.getInfo().getChave() != chave))
            atual = atual.getProx();
        return atual;
    }

    // remove um determinado nó em qualquer posição na lista.
    public boolean removerNo(int chave) {
        NoDupla atual = this.prim;
        while ((atual != null) && (atual.getInfo().getChave() != chave)) {
            atual = atual.getProx();
        }
        if (atual == null)
            return false;
        else if (atual == this.prim) {
            this.prim = prim.getProx();
            if (this.prim == null) // se a lista tem somente um nó
                this.ult = null;
            else
                this.prim.setAnt(null);
        } else if (atual == this.ult) {
            this.ult = this.ult.getAnt();
            this.ult.setProx(null);
        } else {
            atual.getProx().setAnt(atual.getAnt());
            atual.getAnt().setProx(atual.getProx());
        }
        this.quantNos--;
        return true;
    }

    public String toString() {
        String msg = "";
        NoDupla atual = this.prim;
        while (atual != null) {
            msg += atual.getInfo().getChave() + "\n";
            atual = atual.getProx();
        }
        return msg;
    }

    // atividade 04 - questão 06
    public void concatenarListas(ListaDupla lista2) {
        lista2.prim.setAnt(this.ult);
        this.ult.setProx(lista2.prim);
        this.ult = lista2.ult;
        lista2.prim = null;
        lista2.ult = null;
        this.quantNos += lista2.quantNos;
        lista2.quantNos = 0;
    }

    // Outra forma de concatenar listas
    public void concatenarListas_02(ListaDupla lista2) {

        if (lista2.prim != null) {

            if (this.ult != null) {
                this.ult.setProx(lista2.prim);
            } else {
                this.prim = lista2.prim;
            }

            this.ult = lista2.ult;
            this.quantNos += lista2.quantNos;

            lista2.prim = null;
            lista2.ult = null;
            lista2.quantNos = 0;
        } else {
            System.out.println("Lista 2 está vazia! ");
        }
    }

    // atividade 04 - questão 07
    public ListaDupla partirLista() {
        ListaDupla lista2 = new ListaDupla();

        NoDupla atual = this.prim;

        for (int i = 1; i < this.quantNos / 2; i++) {
            atual = atual.getProx();
        }
        lista2.prim = atual.getProx();
        lista2.ult = this.ult;
        this.ult = atual;
        lista2.prim.setAnt(null);
        this.ult.setProx(null);

        lista2.quantNos = this.quantNos - this.quantNos / 2;
        this.quantNos = this.quantNos / 2;
        return lista2;
    }

    // metodo para obter maior elemento da lista
    public int maiorElemento() {
        if (prim == null) {
            return -1;
        }
        int maior = prim.getInfo().getChave();
        NoDupla atual = prim.getProx();

        while (atual != null) {
            if (atual.getInfo().getChave() > maior) {
                maior = atual.getInfo().getChave();
            }
            atual = atual.getProx();
        }
        return maior;
    }

    // metodo para obter media aritmética com valores da lista
    public int mediaaritmetica() {
        if (this.prim == null) {
            return -1;
        }
        NoDupla atual = prim.getProx();
        int soma = 0;
        int soma_2 = 0;

        while (atual != null) {
            soma += atual.getInfo().getChave();
            atual = atual.getProx();
            soma_2++;
        }
        int media = soma / soma_2;
        return media;
    }

    // meotodo para remover valores iguais a zero
    public void retirar_0(){
        int cont = 0;
        if(this.prim == null){
            System.out.println("A lista está vazia");
        }
        NoDupla atual = prim.getProx();
        while(atual != null){
            if(atual.getInfo().getChave() == 0){
                removerNo(atual.getInfo().getChave());
                cont++;      
            }
            atual = atual.getProx();
        }
        System.out.println("Quantidade de zeros removidos  - #" + cont);
    }

    // escreva um método que retira os valores repetidos de uma lista duplamente encadeada
    public void retirar_repetidos(){
        
    }

}
