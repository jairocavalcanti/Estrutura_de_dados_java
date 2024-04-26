package dados;

public class Item {
	// aqui podem ser declarados outros atributos conforme sua necessidade.
	private int chave;

	// atributos criados para resolução da questão 12
	private String nome;
	private Double altura;

	private char caracter;

	// Construtor de objetos da classe Item
	public Item(int valor) {
		this.chave = valor;
	}

	// construtor criado para resolução da questao 12
	public Item(String nome, Double altura) {
		this.nome = nome;
		this.altura = altura;
	}

	public Item(char caracter) {
		this.caracter = caracter;
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

}
