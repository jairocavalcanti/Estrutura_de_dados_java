package filaCircular;

import dados.Item;
import duplamente.ListaDupla;
import pilha.PilhaContig;

public class FilaCircular {
	private Item[] info;
	private int frente;
	private int tras;
	private int tamanho;

	public FilaCircular(int qte) {// qte = tamanho do vetor
		this.frente = 0;
		this.tras = 0;
		this.tamanho = 0;
		this.info = new Item[qte];
	}

	public Item getInfo() {
		return this.info[this.frente];
	}

	public int getFrente() {
		return this.frente;
	}

	public int getTras() {
		return this.tras;
	}

	public int getTamanho() {
		return this.tamanho;
	}

	public boolean eVazia() {
		return (this.tamanho == 0);
	}

	public boolean eCheia() {
		return (this.tamanho == this.info.length);
	}

	public boolean enfileirar(Item elem) {
		if (this.eCheia())
			return false;
		else {
			this.info[this.tras] = elem;
			this.tras = (++this.tras % this.info.length);
			this.tamanho++;
			return true;
		}
	}

	public Item desenfileirar() {
		Item no;
		if (this.eVazia())
			return null;
		else {
			no = this.info[this.frente];
			this.frente = (++this.frente % this.info.length);
			this.tamanho--;
			return no;
		}
	}

	public String toString() { // imprimir o conteúdo da fila
		String msg = "";
		int aux = this.frente;
		for (int i = 1; i <= this.tamanho; i++) {
			msg += this.info[aux].getChave() + " ";
			aux = (++aux % this.info.length);
		}
		return msg;
	}

	// atividade 06 - questão 01
	public String retirarnegativos() {
		int cont = 0;
		int aux = this.frente;
		int tamanho = this.tamanho;
		for (int i = 0; i < tamanho; i++) {
			if (this.info[aux].getChave() <= 0) {
				this.desenfileirar();
				cont++;
			} else {
				System.out.println("Valor restante #" + i + " " + this.info[aux].getChave());
			}
			aux = (++aux % this.info.length);
		}
		return "Valores negativos retirados: " + cont + "\n";
	}

	// atividade 06 - questão 02
	public int somarFila() {
		int soma = 0;
		int aux = this.frente;
		for (int i = 0; i < this.tamanho; i++) {
			soma += this.info[aux].getChave();
			aux = (++aux % this.info.length);
		}
		return soma;
	}

	// atividade 06 - questão 03
	public void transferir(PilhaContig pilha, FilaCircular fila) {
		Item item;
		while (!pilha.eVazia()) {
			item = pilha.desempilhar();
			fila.enfileirar(item);
		}
	}

	// atividade 06 - questão 07
	public String removeralgo(ListaDupla lista) {
		int cont = 0;
		int cont2 = 0;
		int tamanhoOriginal = this.tamanho;
		for (int i = 0; i < tamanhoOriginal; i++) {
			Item item = this.desenfileirar();
			if (item.getDecisao() != false) {
				lista.inserirUltimo(item);
				cont++;
				System.out.println("Valor 'true' - #" + cont);
			} else {
				this.enfileirar(item);
				cont2++;
				System.out.println("Valor 'false' - #" + cont2);
			}
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Lista duplamente encadeada: ");
		return lista.toString();
	}

}
