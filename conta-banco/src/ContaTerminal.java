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

        System.out.println("Digite o seu nome:");
        String cliente = scanner.next();

        System.out.println("Digite o numero da conta:");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá" + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é" + agencia + "," + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}