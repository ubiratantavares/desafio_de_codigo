package codigo3;

import java.util.Scanner;

public class VerificacaoQuedaConexao {

    public static String verificarQuedaConexao(String[] velocidades) {
      int quantidade = velocidades.length;
      for (int i = 0; i < quantidade; i++) {
        int velocidade = Integer.parseInt(velocidades[i]);
        if (velocidade == 0) return "Queda de Conexao";
      }
      return "Sem Quedas";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}
