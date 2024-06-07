import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da Agência !");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite a Agência !");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente !");
        String nome = scanner.nextLine();

        System.out.println("Por favor, escolha quanto quer depositar para criar a conta !");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", nome, agencia, numero, saldo);
    }
}
