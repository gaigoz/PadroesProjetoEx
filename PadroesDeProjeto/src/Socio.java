
public class Socio extends Cliente {

	private String numeroSocio;

	public Socio(String nome, String cpf, int idade, String genero,String numeroSocio) {
		super(nome, cpf, idade, genero);
		this.numeroSocio = numeroSocio;
		
	}

	public String getNumeroSocio() {
		return numeroSocio;
	}
	
	
}
