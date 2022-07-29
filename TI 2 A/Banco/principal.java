import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Conta conta2 = new Conta();
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------" + " Bem vindo ao banco Bilateral " + "----------------");

        System.out.println("Informe seu tipo de conta: ");
        System.out.println("0 - para conta corrente");
        System.out.println("1 - para conta polpança");
        System.out.print("Digite seu tipo: ");
        int tipo = sc.nextInt();
        conta.setTipo(tipo);

        System.out.println("Sua conta é do tipo: " + conta.getTipo());

        System.out.print("Informe seu saldo inicial: ");
        conta.setSaldo(sc.nextDouble());

        System.out.println("Seu saldo é " + conta.getSaldo());

        System.out.println("Informe seu depósito: ");
        conta.depositar(sc.nextDouble());

        System.out.println("Seu saldo é " + conta.getSaldo());

        
        System.out.print("Informe o valor a ser transferido: ");
        double valor = sc.nextDouble();

        conta.transferir(valor, conta2);

        System.out.println("Seu saldo da conta 1 é de " + conta.getTipo());
        System.out.println("Seu saldo da conta 2 é de " + conta2.getTipo());


        System.out.print("Informe o valor do saque: ");
        conta.sacar(sc.nextDouble());

        System.out.println("Seu saldo é " + conta.getSaldo());

        
        sc.close();




    }
}
