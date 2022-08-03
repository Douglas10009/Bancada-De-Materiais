import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------");

        System.out.println("--> Seja bem vindo a Logistica e CIA :)");

        int opcao = 0;
        while (opcao != 6) {

            System.out.println("Escolha uma opção:");
            System.out.println("1- Sistema de logistica");
            System.out.println("2 - Sistema de controle");
            System.out.println("3 - Sistema de atualização de dados");
            System.out.println("4 - Sistema de transação");
            System.out.println("5 - Relatório");
            System.out.println("6 - Sair");

            System.out.print("Digite o número da sua opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: // Logistica
                    int opcao_log = 0;
                    while (opcao_log != 0) {
                        System.out.println("Escolha uma opção: ");

                    }
                    // Cadastrar novos fornecedores
                    // Cadastrar Clientes
                    // Cadastrar Produtos
                    break;
                case 2:// Controle

                    break;
                case 3: // Atualização de dados

                    break;
                case 4: // Sistema de transação

                    break;
                case 5: // Relatório

                    break;
                case 6: // Saída

                    break;
                default:
                    break;
            }
        }
        sc.close();

    }
}
