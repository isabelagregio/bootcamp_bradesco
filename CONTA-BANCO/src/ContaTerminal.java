import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Digite seu número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // apos ler o inteiro precisa ler a quebra de linha

        System.out.print("Digite sua agência: ");
        String agencia = scanner.nextLine(); 

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); 

        System.out.print("Digite seu saldo: ");
        Double saldo = scanner.nextDouble(); 
        scanner.nextLine();

        // precisa usar o + para concatenar strings
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");        

        scanner.close(); // Fechando o Scanner no final do programa
    }
}
