package br.com.modelo;
import br.com.modelo.Dados;

public class Banco {
    // Criando atributos
    private Dados dados;
    private double saldoEmergencia = 0;

    // Criando o construtor
    public Banco(Dados dados){
        this.dados = dados;
    }

    //Criando os métodos
    public void exibirDados(){
        System.out.println("""
                
                ****************************************************
                Nome do cliente: %s
                Agência: %s
                Conta: %s
                Saldo: %.2f
                Saldo Emergência: %.2f
                ****************************************************
                """.formatted(dados.getNome(),dados.getAgencia(),dados.getConta(),dados.getSaldo(),saldoEmergencia));
    }



}
