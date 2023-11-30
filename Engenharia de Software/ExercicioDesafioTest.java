import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.modelo.Banco;

import br.com.modelo.Dados;

import br.com.modelo.Cliente;

import br.com.modelo.ExercicioParaTestar;

class ExercicioDesafioTest {

	@Test
	void test1() {
		
		Dados dado = new Dados();
		Cliente cliente = new Cliente();
		Banco metodo = new Banco(dado);
		
		double saldo = dado.setSaldo(1200);
		
		saldo = saldo - 200;
		
		assertEquals(saldo, 1000 );
		
	}
	
	@Test
	void test2() {
		
		Dados dado = new Dados();
		Cliente cliente = new Cliente();
		Banco metodo = new Banco(dado);
		
		String nome = dado.getNome();
		assertEquals(nome,null);
		
	}
	
	@Test
	void test3() {
		
		int num1 = 10;
		
		assertEquals(num1,10);
	}
	
	@Test
	void test4() {
		Dados dado = new Dados();
		Banco metodo = new Banco(dado);
		
		double valor = metodo.guardaDinheiroReserva(200);
		
		assertEquals(valor,200);
		
	}
	
	@Test
	void test5() {
		Dados dado = new Dados();
		Banco metodo = new Banco(dado);
		
		double valor = metodo.guardaDinheiroReserva(200);
		double retira = metodo.retiraDinheiroReserva(200);
		
		assertEquals(retira,1);
		
	}
		
}
