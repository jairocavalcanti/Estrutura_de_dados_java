package dados;

public class Item {
	// aqui podem ser declarados outros atributos conforme sua necessidade.
	private int chave;
	private String nome;
	private Double altura;
	
	//Construtor de objetos da classe Item
	public Item(int valor) {
		this.chave = valor;
	}
	
	public Item(String nome, Double altura) {
		this.nome = nome;
		this.altura = altura;
	}

	//Modifica o valor do atributo chave
	public void setChave (int chave){
		this.chave = chave;
	}
	//Faz a leitura do valor do atributo chave
	public int getChave (){
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

}
