import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.modelo.Banco;

import br.com.modelo.Dados;

import br.com.modelo.Cliente;

import br.com.modelo.ExercicioParaTestar;

class ExercicioDesafioTest {

	@Test
	void test1() {
		
//		Dados dado = new Dados();
//		Cliente cliente = new Cliente();
//		Banco metodo = new Banco(dado);
//		
//		double saldo = dado.setSaldo(1200);
//		String clienteNome = cliente.criaNome();
//		
//		saldo = saldo - 200;
//		
//		assertEquals(saldo, 1000 );
//		assertEquals(clienteNome,"André Luiz");
		
		ExercicioParaTestar teste = new ExercicioParaTestar();
		
		assertEquals(teste.testandoCerto(-30000),teste.testandoErrado(-30000));
		
	}
	
		@Test
		void test2() {
		
		ExercicioParaTestar teste = new ExercicioParaTestar();
		
		assertEquals(teste.testandoCerto(-30000),teste.testandoErrado(-30000));
		
	}
}
