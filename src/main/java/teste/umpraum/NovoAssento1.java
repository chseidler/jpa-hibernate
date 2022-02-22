package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoAssento1 {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento("1A");
		Cliente cliente = new Cliente("Christian", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
		.incluir(assento)
		.incluir(cliente)
		.fecharT()
		.fechar();
	}
}
