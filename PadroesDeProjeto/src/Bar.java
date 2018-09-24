import java.util.ArrayList;

public class Bar {

	ArrayList<Cliente> listaClientes;

	public Bar() {

		listaClientes = new ArrayList<>();

	}

	// pesquisa por CPF
	public boolean pesquisaPorCpf(String cpf) {
		for (Cliente c : listaClientes) {
			if (c.getCpf().equals(cpf)) {
				return true;
			}
		}
		return false;
	}
	// quantidade de pessoas
	public int nroPessoas() {
		return listaClientes.size();
	}
		
	// distribui��o por genero(percentual de clientes masculino e feminino) *DEVOLVE PORCENTAGEM MASCULINA*
	public double porcentagemSexo() {
		int aux = 0;
		for (Cliente c : listaClientes) {
			if(c.getGenero().equals('M')) {
				aux++;
			}
		}
		
		return (aux*listaClientes.size())/100;
	}
	
	// status de s�cio (quantos s�o s�cios, e quantos n�o s�o).
	
	public int qntSocios() {
		int socio =0;
		for (Cliente c : listaClientes) {
			if(c instanceof Socio) {
				socio++;
			}	
		}
		return socio;
	}
	
	// metodo que registra a saida do bar "Ao sair, o cliente deve informar seu CPF, para registrar sua sa�da."
	public void saiuDoBar(String CPF) {
		for (Cliente c : listaClientes) {
			if(c.getCpf().equals(CPF)) {
				c.saiBar();
			}
		}
	}
}
