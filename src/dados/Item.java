package dados;

public class Item {
	// aqui podem ser declarados outros atributos conforme sua necessidade.
	private int chave;

	// atributos criados para resolução da questão 12 - Duplamente
	private String nome;
	private Double altura;

	// atributo criado para resolução da questão 14 - Duplamente
	private char caracter;

	// atributo criado para resolução da questão 7 - Fila Circular
	private boolean decisao;

	// Construtor de objetos da classe Item
	public Item(int valor) {
		this.chave = valor;
	}

	// construtor criado para resolução da questao 12 - Duplamente
	public Item(String nome, Double altura) {
		this.nome = nome;
		this.altura = altura;
	}

	// construtor criado para resolução da questão 14 - Duplamente
	public Item(char caracter) {
		this.caracter = caracter;
	}

	// construtor criado para resolução da questão 7 - Fila Circular
	public Item(boolean decisao) {
		this.decisao = decisao;
	}

	// Modifica o valor do atributo chave
	public void setChave(int chave) {
		this.chave = chave;
	}

	// Faz a leitura do valor do atributo chave
	public int getChave() {
		return this.chave;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public char getCaracter() {
		return caracter;
	}

	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}

	public boolean getDecisao() {
		return decisao;
	}

	public void setDecisao(boolean decisao) {
		this.decisao = decisao;
	}

}
