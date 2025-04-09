import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        //TODO:Conhecer e importar a clase Scanner
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String nome;
        String agencia;
        int numeroConta;
        double saldo;

        // nome
        while (true) { 
            System.out.println("Por favor, digite seu nome!");
            nome = sc.nextLine();
            if (nome.matches("^[\\p{L} ]+$")) break;
            else System.out.println("Nome inválido! Use apenas letras e espaços.");

        }

        // agencia
        while (true) {
            System.out.println("Por favor, digite o número da agência (formato 1234-5):");
            agencia = sc.nextLine();
            if (agencia.matches("\\d{3,5}-\\d{2,3}")) break;
            else System.out.println("Agência inválida! Use o formato 1234-5.");
        }

        // conta
        while (true) {
            System.out.println("Por favor, digite o número da sua conta:");
            String contaInput = sc.nextLine();
            if (contaInput.matches("\\d+")) {
                numeroConta = Integer.parseInt(contaInput);
                break;
            } else {
                System.out.println("Número da conta inválido! Digite apenas números.");
            }
        }

        // saldo
        while (true) {
            System.out.println("Qual é o valor a depositar? Use ponto como separador decimal (ex: 1500.50):");
            if (sc.hasNextDouble()) {
                saldo = sc.nextDouble();
                break;
            } else {
                System.out.println("Valor inválido! Use ponto, não vírgula.");
                sc.next(); // descarta a entrada incorreta
            }
        }

        sc.close();

        //Exibir a mensagem final da conta criada
        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numeroConta +" e seu saldo "+ saldo + " já está disponível para saque.");

    }
}
