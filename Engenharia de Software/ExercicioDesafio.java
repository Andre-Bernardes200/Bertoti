import java.util.Scanner;
import br.com.modelo.Banco;
import br.com.modelo.Dados;

public class ExercicioDesafio {
    public static void main(String[] args){

        Dados dados = new Dados();
        Banco usuario = new Banco(dados);
        Scanner input = new Scanner(System.in);
        Runtime runtime = Runtime.getRuntime();
        double valor;
        int escolha = 1;
        String nome;

        dados.entradaDados();

        while (escolha != 0){
            usuario.exibirDados();
            usuario.opcoes();
            System.out.print("Escolha uma opção: ");
            escolha = input.nextInt();
            nome = input.nextLine();

            if(escolha == 1) {
                System.out.print("Qual valor deseja sacar: ");
                valor = input.nextDouble();
                usuario.sacar(valor);
            }else if(escolha == 2){
                System.out.print("Qual valor deseja transferir: ");
                valor = input.nextDouble();
                usuario.transferir(valor);
            }else if(escolha == 3) {
                System.out.print("Qual valor deseja depositar: ");
                valor = input.nextDouble();
                usuario.depositar(valor);
            }else if(escolha == 4) {
                System.out.print("Qual valor deseja guardar em sua reserva: ");
                valor = input.nextDouble();
                usuario.guardaDinheiroReserva(valor);
            }else if (escolha == 5){
                System.out.print("Qual valor deseja retirar de sua reserva: ");
                valor = input.nextDouble();
                usuario.retiraDinheiroReserva(valor);
            } else if (escolha == 6){
                System.out.print("\nDigite seu novo nome: ");
                nome = input.nextLine();
                dados.setNome(nome);
            }else if (escolha == 0){
               break;
            }else{
                System.out.println("\nOpção inválida, tente novamente\n");
            }
        }
        System.out.println("\nObrigado por utilizar o nosso sistema!!");
    }


}
