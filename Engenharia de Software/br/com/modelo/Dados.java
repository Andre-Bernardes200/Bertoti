package br.com.modelo;
import java.util.Scanner;

public class Dados {
    Scanner input = new Scanner(System.in);

    // Criando atributos
    private String nome;
    private String agencia;
    private String conta;
    private double saldo;

    // Criando o construtor
    public Dados (String nome,String agencia, String conta, double saldo){
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    // Criando o método
    public String getNome(){
        return this.nome;
    }
    public String getAgencia(){
        return this.agencia;
    }
    public String getConta(){
        return this.conta;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public double setSaldo(double saldo){ return this.saldo = saldo;}

}
