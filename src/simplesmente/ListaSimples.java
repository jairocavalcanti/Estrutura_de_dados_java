package simplesmente;

import dados.Item;

public class ListaSimples {
	private No prim;
	private No ult;
	private int quantNos;
	
	//construtor da classe
	public ListaSimples(){
		this.prim = null;
		this.ult = null;
		this.quantNos = 0;
	}
	public int getQuantNos(){
		return this.quantNos;
	}
	public No getPrim(){
		return this.prim;
	}
	public No getUlt(){
		return this.ult;
	}
	public void setQuantNos(int novoValor){
		this.quantNos = novoValor;
	}
	public void setPrim(No novoNo){
		this.prim = novoNo;
	}
	public void setUlt(No novoNo){
		this.ult = novoNo;
	}
	public boolean eVazia (){
		return (this.prim == null);
	}
	
	//insere um novo n� no final da lista ou se a lista estiver vazia, insere o primeiro n� na lista
	public void inserirUltimo (Item elem){
		No novoNo = new No (elem);
		if (this.eVazia()){
			this.prim = novoNo;
		} else {
			this.ult.setProx(novoNo);
		}
		this.ult = novoNo;
		this.quantNos++;
	}
	
	//retorna o endere�o do n� que est� contendo o valor a ser procurado.
	public No pesquisarNo (int chave){
		No atual = this.prim;
		while ((atual != null) && (atual.getInfo().getChave() != chave)){
			atual = atual.getProx();
		}	
		return atual;
	}
	
	//remove um determinado n� em qualquer posi��o na lista.
	public boolean removerNo_1 (int chave) {
		No atual = this.prim;
		No ant = null;
		if (eVazia()){
			return false;
		} else {
			while ((atual != null)&&(atual.getInfo().getChave()!= chave)){
				ant = atual;
				atual = atual.getProx();
			}
			if (atual == null){
				return false;
			}
			else{
				if (atual == this.prim){
					if (this.prim == this.ult){
						this.ult = null;
					}
					this.prim = this.prim.getProx();
				} else {
					if (atual == this.ult){
						this.ult = ant;
					}
					ant.setProx(atual.getProx());
				}
				this.quantNos--;
				return true;
			}
		}
	}
	
	//outra forma de escrever o m�todo para remover determinado N�
	public boolean removerNo_2(int x){
		if (this.eVazia()){
			return false;
		}else{
			if (this.prim.getInfo().getChave()==x){
				if (this.prim.getProx()==null){//se for �nico n� da lista
					this.ult = null;
				}
				//remover o primeiro n� da lista
				this.prim = this.prim.getProx();
			}else{
				No atual = this.prim;
				while ((atual.getProx()!=null)&&
						(atual.getProx().getInfo().getChave()!=x)){
					atual = atual.getProx();
				}
				if (atual.getProx()==null){//n�o achou o valor na lista
					return false;
				}else{
					if (atual.getProx()==this.ult){//se for o �ltimo n�
						atual.setProx(null);
						this.ult = atual;
					}else{	//remove o n� no meio da lista
						atual.setProx(atual.getProx().getProx());
					}
				}
			}
			this.quantNos--;
			return true;

		}
	}
	
	//mostra todo o conte�do da lista
	public String toString(){
		String msg = "";
		No atual = this.prim;
		while (atual != null){
			msg += atual.getInfo().getChave()+"\n";
			atual = atual.getProx();
		}
		return msg;
	}

	public int calcularSoma(){
		// inicializa a variavel que irá somar os valores
		int soma = 0;
		
		if(this.eVazia()){
			return 0;
		}else{
			No atual = this.prim;
			while(atual != null){
				soma += atual.getInfo().getChave();
				atual = atual.getProx();
			}
		    return soma;
		}
	}

	public double calcularmedia(){
		double soma = 0;
		if (this.eVazia()){
			return 0;
		}else{
			No atual = this.prim;
			while(atual != null){
				soma += atual.getInfo().getChave();
				atual = atual.getProx();
			}
		    return soma/this.quantNos;
		}
	}

	public void imprimirNumerosPares() {
		if (this.eVazia()) {
			System.out.println("A lista está vazia.");
		} else {
			No atual = this.prim;
			while (atual != null) {
				if (atual.getInfo().getChave() % 2 == 0) {
					System.out.println("Número par: " + atual.getInfo().getChave());
				}
				atual = atual.getProx();
			}
		}
	}
	
	public boolean saoIdenticas(ListaSimples L1, ListaSimples L2) {
		// Verificando se as duas listas têm o mesmo número de nós
		if (L1.getQuantNos() != L2.getQuantNos()) {
			return false;
		} else {
			// Inicializando os nós atuais para percorrer as duas listas
			No atualLista1 = L1.getPrim();
			No atualLista2 = L2.getPrim();
			
			// Percorrendo ambas as listas ao mesmo tempo
			while (atualLista1 != null && atualLista2 != null) {
				// Verificando se os elementos dos nós atuais são diferentes
				if (atualLista1.getInfo().getChave() != atualLista2.getInfo().getChave()) {
					return false; // Se forem diferentes, as listas não são idênticas
				}
				// Movendo para o próximo nó em ambas as listas
				atualLista1 = atualLista1.getProx();
				atualLista2 = atualLista2.getProx();
			}
			// Se ambas as listas foram completamente percorridas sem encontrar diferenças, elas são idênticas
			// Retornando true indicando que as listas são idênticas
			return true;
		}
	}
	
	public boolean procurarValor(int valor) {
		if (this.eVazia()) {
			System.out.println("A lista está vazia.");
			return false;
		} else {
			No atual = this.prim;
	
			while (atual != null) {
				if (atual.getInfo().getChave() == valor) {
					atual.getInfo().setChave(50);
					System.out.println("Valor " + valor + " substituído por 50 na lista.");
					return true; // Retorna true se o valor foi encontrado e alterado
				}
				atual = atual.getProx();
			}
	
			System.out.println("Valor não encontrado na lista.");
			return false; // Retorna false se o valor não foi encontrado na lista
		}
	}

	public int procurarOuInserir(int valor) {
		if (this.eVazia()) { // Se a lista está vazia, insere o valor no final da lista
			this.inserirUltimo(new Item(valor));
			return 1; // Retorna a quantidade de vezes que o valor aparece na lista (que neste caso é 1, pois acabou de ser inserido)
		} else {
			int quantidade = 0;
			No atual = this.prim;
	
			while (atual != null) {
				if (atual.getInfo().getChave() == valor) {
					quantidade++; // Incrementa a quantidade sempre que encontra o valor na lista
				}
				atual = atual.getProx();
			}
	
			if (quantidade == 0) { // Se o valor não foi encontrado na lista, insere no final da lista
				this.inserirUltimo(new Item(valor));
				return 1; // Retorna 1, pois o valor foi inserido uma vez
			} else {
				return quantidade; // Retorna a quantidade de vezes que o valor aparece na lista
			}
		}
	}

	public void adicionar_5(){
		if(this.eVazia()){
			return;
		}else{
			No atual = this.prim;
			while(atual != null){
				if(atual.getProx() == null){
					atual.getInfo().setChave(5);
					break;
				}
				atual = atual.getProx();
			}
		}
	}
	
	public void adicionar_8(){
		if(this.eVazia()){
			return;
		}else{
			No atual = this.prim;
			while(atual != null){
				if(atual.getInfo().getChave() == 3){
					No novoNo = new No(new Item(8));
					novoNo.setProx(this.prim);
					this.prim = novoNo;
				    break;
				}
            atual = atual.getProx();
			}
		}
		
	}
	
	public void somaPar(){
		if(this.eVazia()){
			return;
		}else{
			No atual = this.prim;
			int soma = 0;
			while(atual != null){
				if(atual.getInfo().getChave() % 2 == 0){
					soma += atual.getInfo().getChave();
				}
			atual = atual.getProx();
			}
	    System.out.println("Soma -- " + soma);
		No novoNo = new No(new Item(soma));
		this.ult.setProx(novoNo);
		this.ult = novoNo;
	    }    
	}

	
}