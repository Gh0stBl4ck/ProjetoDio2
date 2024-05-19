import java.util.Scanner;

public class TERMINAL  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite numero da conta!");
        String numeroconta = scanner.nextLine();

        System.out.println("Digite seu nome!");
        String nomeCliente = scanner.nextLine();

        Double saldo = 237.48;

        String mensagem = "Olá " + nomeCliente + " obrigado por criar conta em nosso banco, sua agência é " + numeroconta + " , conta " + numeroAgencia + " e seu saldo R$ " + String.format("%.2f", saldo ) + " Disponivel para saque. ";
        System.out.println(mensagem);
        

        scanner.close();
    }
}
