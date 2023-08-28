import java.util.Scanner;
import br.com.modelo.Banco;
import br.com.modelo.Dados;

public class ExercicioDesafio {
    public static void main(String[] args){

        Dados dados = new Dados("André Luiz Bernardes de Oliveira","123456","202564",2500);
        Banco usuario = new Banco(dados);

        usuario.exibirDados();

    }


}
