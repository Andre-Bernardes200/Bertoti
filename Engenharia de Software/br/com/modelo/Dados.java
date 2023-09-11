package br.com.modelo;
import java.util.Scanner;
import br.com.modelo.Cliente;

public class Dados {
    Scanner input = new Scanner(System.in);
    Cliente cliente = new Cliente();

    // Criando atributos
    private String nome;
    private int agencia;
    private int conta;
    private double saldo;

    // Criando o construtor
    public Dados () {
        this.nome = nome;
    }

    // Criando o método
    public void entradaDados(){
        nome = cliente.criaNome();
        agencia = cliente.criaAgencia();
        conta = cliente.criaConta();
        saldo = cliente.temSaldo();
    }

    public String getNome(){
        return nome;
    }
    public String setNome(String nome){
        return this.nome = nome;
    }
    public int getAgencia(){
        return agencia;
    }
    public int getConta(){
        return conta;
    }
    public double getSaldo(){
        return saldo;
    }
    public double setSaldo(double novoSaldo){ return saldo = novoSaldo;}

}
