import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal
 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite o numero da agencia:");
        String agencia = scanner.next();

         scanner.nextLine();
        System.out.println("Digite o seu nome:");
        String cliente = scanner.nextLine();

        System.out.println("Digite o numero da conta:");
        Double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", sua conta é a: " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}