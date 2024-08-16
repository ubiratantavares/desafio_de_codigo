package codigo2;

import java.util.Scanner;

public class Main {

    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        for (String servico : servicosContratados) {
          switch (servico.trim().toLowerCase()) {
            case "movel":
              movelContratado = true;
              break;
            case "banda larga":
              bandaLargaContratada = true;
              break;
            case "tv":
              tvContratada = true;
              break;
          }
        }
        
        String resultado = "Combo ";
        resultado += (movelContratado && bandaLargaContratada && tvContratada) ? "Completo" : "Incompleto";
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}
