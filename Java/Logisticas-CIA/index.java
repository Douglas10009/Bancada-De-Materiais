import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------");

        System.out.println("--> Seja bem vindo a Logistica e CIA :)");

        int opcao = 0;
        while (opcao != 6) {

            System.out.println("Escolha uma opção -");
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
                    int contador = 0; // Para saber se é a primeira vez que o usuário entra no menu

                    if (contador == 0) {
                        // Runtime.getRuntime().exec("cls"); //Tentativa de limpar a tela
                        clearScreen();
                        System.out.println("-- Sistema de logistica --");
                        System.out.println("Escolha uma opção -");
                        System.out.println("1 - Cadastrar fornecedor");
                        System.out.println("2 - Voltar");
                        System.out.print("Digite o número da sua opção: ");
                        opcao_log = sc.nextInt();

                        switch (opcao_log) {
                            case 1:
                                System.out.println("Digite o nome do fornecedor: ");
                                String nome = sc.nextLine();
                                System.out.println("Digite o endereço do fornecedor: ");
                                String endereco = sc.nextLine();
                                System.out.println("Digite o CNPJ do fornecedor: ");
                                String cnpj = sc.nextLine();
                                System.out.println("Digite o telefone do fornecedor: ");
                                int telefone = sc.nextInt();

                                System.out.println("O nome: " + nome);
                                System.out.println("Endereço: " + endereco);
                                System.out.println("CNPJ: " + cnpj);
                                System.out.println("Telefone: " + telefone);
                                break;

                            default:
                                break;
                        }
                        clearScreen(); //Função de limpar a tela
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
                    System.out.println("Opção inválida, tente novamente. ");
                    break;
            }
        }
        sc.close();

    }

    public static void clearScreen() {
        char esc = 27;
        String clear = esc + "[2J"; // codigo ansi para limpar a tela
        System.out.print(clear);
    }
}

/*
 * System.out.println("Escolha uma opção -");
 * System.out.println("1 - ");
 * System.out.println("2 -");
 * System.out.print("Digite o número da sua opção: ");
 * opcao_ = sc.nextInt();
 */