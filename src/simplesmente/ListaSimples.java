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
		// verifica se a lista está vazia
		if(this.eVazia()){
			return 0;
		}else{
			// se nao estiver, inicializamos o primeiro nó da lista
			No atual = this.prim;
			// enquanto este nó estiver nulo a soma seria feita
			while(atual != null){
				soma += atual.getInfo().getChave();
				atual = atual.getProx();
			}
		// retornando valores somados     
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

}
