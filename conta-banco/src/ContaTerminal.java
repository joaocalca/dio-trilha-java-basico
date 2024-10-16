import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        // Criando o objeto Scanner para receber os dados via terminal
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando os dados ao usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        
        // Consumindo a quebra de linha deixada pelo nextInt()
        scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();
        
        // Exibindo a mensagem final com a concatenação
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                            + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
        // Fechando o Scanner
        scanner.close();
    }
}