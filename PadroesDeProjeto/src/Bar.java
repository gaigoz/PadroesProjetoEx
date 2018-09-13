import java.util.ArrayList;

public class Bar {

	ArrayList<Cliente> listaClientes;

	public Bar() {

		listaClientes = new ArrayList<>();

	}

	// pesquisa por CPF
	public Cliente pesquisaPorCpf(String cpf) {
		for (Cliente c : listaClientes) {
			if (c.getCpf().equals(cpf)) {
				return c;
			}
		}
		return null;
	}
	// quantidade de pessoas
	
	// distribui��o por genero(percentual de clientes masculino e feminino)
	// status de s�cio (quantos s�o s�cios, e quantos n�o s�o).
}
