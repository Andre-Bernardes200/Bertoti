package br.com.modelo;
import java.lang.Math;
import java.util.Scanner;

public class Cliente {
    Scanner input = new Scanner(System.in);

    // Criando os atributos
    private String nome;
    private int agencia;
    private int conta;
    private double saldo;
    private String opcao;

    // Criando métodos
    public String setNome(){
        System.out.print("\nEntre com o seu nome: ");
        nome = input.nextLine();
        return nome;
    }
    public int criaAgencia(){
        agencia = (int) (Math.abs(Math.random()) * 10000);
        return agencia;
    }
    public int criaConta(){
        conta = (int) (Math.abs(Math.random()) * 1000);
        return conta;
    }
    public double temSaldo(){
        System.out.print("Já quer fazer um depósito em sua conta (s/n): ");
        opcao = input.next();
        while(opcao.equals("s") && opcao.equals("n")){
            System.out.println("Opção inválida, tente novamente");
            System.out.print("Já quer fazer um depósito em sua conta (s/n): ");
            opcao = input.next();
        }
        if(opcao.equals("s")){
            System.out.print("Qual valor deseja colocar: ");
            saldo = input.nextDouble();
            return saldo;
        }else{
            return saldo = 0;
        }
        }
    }

