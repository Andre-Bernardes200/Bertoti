import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import br.com.modelo.Banco;

import br.com.modelo.Dados;

import br.com.modelo.Cliente;

class ExercicioDesafioTest {

	@Test
	void test() {
		
		Dados dado = new Dados();
		Cliente cliente = new Cliente();
		Banco metodo = new Banco(dado);
		
		double saldo = dado.setSaldo(1200);
		String clienteNome = cliente.criaNome();
		
		saldo = saldo - 200;
		
		assertEquals(saldo, 1000 );
		assertEquals(clienteNome,"André Luiz");
		
	}

}
