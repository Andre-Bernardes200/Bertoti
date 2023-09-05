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

//    // Criando o construtor
//    public Dados (String nome,String agencia, String conta, double saldo){
//        this.nome = nome;
//        this.agencia = agencia;
//        this.conta = conta;
//        this.saldo = saldo;
//    }

    // Criando o método
    public void entradaDados(){
        nome = cliente.setNome();
        agencia = cliente.criaAgencia();
        conta = cliente.criaConta();
        saldo = cliente.temSaldo();
    }

    public String getNome(){
        return nome;
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
