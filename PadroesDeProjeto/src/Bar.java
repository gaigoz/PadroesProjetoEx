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
	
	// distribuição por genero(percentual de clientes masculino e feminino)
	// status de sócio (quantos são sócios, e quantos não são).
}
