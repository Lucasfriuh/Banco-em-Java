import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();
        
        System.out.println("Qual é a sua agência? ");
        String agencia = scanner.nextLine();
        
        System.out.println("Digite seu numero: ");
        String numero = scanner.next();
       
        System.out.println("Informe o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é a " + agencia + ", conta do número: " + numero + " e seu saldo é atual é de: " + saldo + "R$ e ja está disponível para saque.");

        

    }

}