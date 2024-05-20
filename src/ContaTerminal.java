import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner dadosIn = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o nome do titular: ");
        String nomeCliente = dadosIn.nextLine();

        System.out.println("Digite o numero da agência: ");
        String numeroAgencia = dadosIn.nextLine();

        System.out.println("Digite o numero da conta: ");
        int numeroConta = dadosIn.nextInt();

        System.out.println("Digite o saldo: ");
        double saldo = dadosIn.nextDouble();

        dadosIn.close();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, numeroAgencia, numeroConta, saldo);

        
    }
}
