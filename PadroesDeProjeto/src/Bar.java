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
	
	// distribui��o por genero(percentual de clientes masculino e feminino)
	
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
}
