
public class Cliente {

	private String nome;
	private String cpf;
	private int idade;
	String genero;
	
	public Cliente(String nome, String cpf, int idade, String genero) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.genero = genero;
	}


	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getIdade() {
		return idade;
	}

	public String getGenero() {
		return genero;
	}
	
}
