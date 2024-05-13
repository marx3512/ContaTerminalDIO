import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da conta: ");
        int numero = Integer.valueOf(scanner.nextLine());
        System.out.println("Por favor, digite o numero da agencia: ");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo da conta: ");
        float saldo = Float.valueOf(scanner.nextLine());   

        scanner.close();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, seu agencia e " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja ersta disponivel para saque");

    }
}