package br.com.modelo;
import br.com.modelo.Dados;

public class Banco {
    // Criando atributos
    private Dados dados;
    private double saldoEmergencia = 0;
    private double valor;
    private double novoSaldo;

    // Criando o construtor
    public Banco(Dados dados){
        this.dados = dados;
    }

    //Criando os métodos

    // Métodos para exibir os dados da classe dados
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

    // Método para mostrar as opções disponíveis
    public void opcoes(){
        System.out.println("""
                1 - Sacar
                2 - Transferir
                3 - Depositar
                4 - Guardar na reserva de emergência
                5 - Retirar da reserva de emergência
                0 - Sair
                """);
    }

    // Método para verificar saldo
    private boolean verificaSaldo(double valor) {
        novoSaldo = dados.getSaldo() - valor;
        if (novoSaldo < 0){
            return false;
        } else {
            dados.setSaldo(novoSaldo);
            return true;
        }
    }
    // Método para sacar algo da conta
    public void sacar(double valor){
        if(verificaSaldo(valor)){
            System.out.println("""
                    \nRetire seu dinheiro da boca do caixa.
                    Seu saldo é de %.2f\n
                    """.formatted( dados.getSaldo()));
        }else{
            System.out.println("\nVocê está tentando sacar mais do que tem em saldo.\n");
        }
    }
    public void transferir(double valor){
        if (verificaSaldo(valor)){
            System.out.println("""
                    \nTransferência efetuada com sucesso.
                    Seu saldo é de %.2f\n
                    """.formatted( dados.getSaldo()));
        }else{
            System.out.println("\nVocê está tentando transferir mais do que tem em saldo.\n");
        }
    }
    public void depositar(double valor){
        novoSaldo = dados.getSaldo() + valor;
        System.out.println("""
                Você depositou %.2f, seu novo saldo é de %.2f\n
                """.formatted(valor,dados.setSaldo(novoSaldo)));

    }
    public double guardaDinheiroReserva(double valor){
        saldoEmergencia += valor;
        return saldoEmergencia;
    }
    public double retiraDinheiroReserva(double valor){
        if(saldoEmergencia - valor < 0 ){
            System.out.println("\nEstá retirando mais do que tem guardado\n");
            return saldoEmergencia;
        }else{
            saldoEmergencia -= valor;
            return saldoEmergencia;
        }
    }

    }
