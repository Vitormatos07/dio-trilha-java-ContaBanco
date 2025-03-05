import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.next();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeTitular + ", obrigado por abrir sua conta conosco! Sua agência é " + agencia
                + " e o número da sua conta é " + numeroConta + ". Seu saldo atual é de R$" + saldo);

    }
}
