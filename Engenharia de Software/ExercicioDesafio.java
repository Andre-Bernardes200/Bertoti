import java.util.Scanner;
import br.com.modelo.Banco;
import br.com.modelo.Dados;
import java.util.Scanner;

public class ExercicioDesafio {
    public static void main(String[] args){

        Dados dados = new Dados("André Luiz Bernardes de Oliveira","123456","202564",2500);
        Banco usuario = new Banco(dados);
        Scanner input = new Scanner(System.in);
        double valor;

        usuario.exibirDados();
        usuario.opcoes();

        System.out.print("Escolha uma opção: ");
        int escolha = input.nextInt();
        System.out.println("");

        while (escolha != 0){
            switch (escolha){
                case 1:
                    System.out.print("Qual valor deseja sacar: ");
                    valor = input.nextDouble();
                    usuario.sacar(valor);
                    break;
                case 2:
                    System.out.print("Qual valor deseja transferir: ");
                    valor = input.nextDouble();
                    usuario.transferir(valor);
                    break;
                case 3:
                    System.out.print("Qual valor deseja depositar: ");
                    valor = input.nextDouble();
                    usuario.depositar(valor);
                    break;
                case 4:
                    System.out.print("Qual valor deseja guardar em sua reserva: ");
                    valor = input.nextDouble();
                    usuario.guardaDinheiroReserva(valor);
                    break;
                case 5:
                    System.out.print("Qual valor deseja retirar de sua reserva: ");
                    valor = input.nextDouble();
                    usuario.retiraDinheiroReserva(valor);
                    break;
            }
        }


    }


}
