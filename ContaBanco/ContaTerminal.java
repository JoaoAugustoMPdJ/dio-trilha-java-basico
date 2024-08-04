package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nome;
        double saldo;

        Scanner ler = new Scanner(System.in);

        // Inicializando variáveis com valores fixos
        numero = 1021;
        agencia = "067-8";
        nome = "Mario Andrade";
        saldo = 237.48;

        // Solicitando entrada do usuário
        System.out.println("Por favor informe o número da agência:");
        String numAgencia = ler.nextLine();

        // Verificando se a agência informada é a mesma da variável 'agencia'
        if (numAgencia.equals(agencia)) {
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n", nome, numAgencia, numero, saldo);
        } else {
            System.out.println("Agência informada não corresponde.");
        }

        // Fechando o scanner
        ler.close();
    }
}
