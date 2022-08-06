import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        clearScreen(); //Limpar a tela
        System.out.println("--------------------------------------");

        System.out.println("----> Seja bem vindo a Logistica e CIA :)");

        int opcao = 0;
        ArrayList<Fornecedores> list_forn = new ArrayList<Fornecedores>();
        // ArrayList<String> aulas = new ArrayList<>();

        while (opcao != 6) {

            System.out.println("\n-- Menu Principal --");
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
                        clearScreen(); // Limpar a tela

                        System.out.println("-- Sistema de logistica --");
                        System.out.println("> Fornecedores ");
                        System.out.println("Escolha uma opção -");
                        System.out.println("1 - Cadastrar fornecedor");
                        System.out.println("2 - Excluir fornecedores");
                        System.out.println("3 - Voltar");
                        System.out.print("Digite o número da sua opção: ");
                        opcao_log = sc.nextInt();

                        boolean cad_Fornecedor = false;
                        switch (opcao_log) {
                            case 1:
                                clearScreen(); // Limpar tela
                                System.out.println("\n-- Sistema de logistica --");
                                System.out.println("--> Cadastrando o fornecedor");

                                System.out.print("Digite o nome do fornecedor: ");
                                String nome = sc.next();
                                // sc.next(); //Para tirar espaço vazio do buffer
                                System.out.print("Digite o endereço do fornecedor: ");
                                String endereco = sc.next();
                                System.out.print("Digite o CNPJ do fornecedor: ");
                                int cnpj = sc.nextInt();
                                System.out.print("Digite o telefone do fornecedor: ");
                                int telefone = sc.nextInt();
                                System.out.print("Digite o código do fornecedor: ");
                                int cod_fornecedor = sc.nextInt();
                                Fornecedores c = new Fornecedores(nome, cnpj, endereco, telefone, cod_fornecedor);
                                list_forn.add(c);
                                cad_Fornecedor = true;

                                // Adicionar agora o poder exluir fornecedor ou add mais

                                System.out.println("\nO nome: " + nome); // Debug
                                System.out.println("Endereço: " + endereco); // Debug
                                System.out.println("CNPJ: " + cnpj); // Debug
                                System.out.println("Telefone: " + telefone); // Debug
                                System.out.println("Código do fornecedor: " + cod_fornecedor); //Debug
                                System.out.println(" "); // Degub
                                break;

                            case 2:
                                if (cad_Fornecedor == true) {
                                    System.out.println("\n-- Sistema de logistica --");
                                    System.out.println("--> Excluindo o fornecedor");

                                    System.out.println("1 - CPF");
                                    System.out.println("2 - CNPJ");
                                    System.out.println("3 - Código do cliente");

                                    System.out.print(
                                            "Escolha dentre as alternativas para selecionar o método de exclusão: ");
                                    int excluir_opc = sc.nextInt();

                                    switch (excluir_opc) {
                                        case 1://CPF
                                            for (int i = 0; i < 10; i++) { // Mudar isso ak
                                                System.out.println("");// Aq vai mostrar os cpf para excluir o fornecedor
                                            }
                                            break;

                                        case 2://CNPJ
                                            for (int i = 0; i < 10; i++) { //Mudar isso ak
                                                System.out.println("");//Aq vai mostrar o cnpj para excluir o fornecedor
                                            }
                                            break;
                                        
                                        case 3:
                                            for (int i = 0; i < 10; i++) { //Mudar isso ak
                                                System.out.println("");//Aq vai mostrar o codigo para excluir o fornecedor
                                            }
                                            break;
                                        default:
                                            break;
                                    }

                                } else {
                                    System.out.println("\n----------> Não há fornecedores cadastrados, cadastre um forncecedor"); //ALERT
                                }
                                break;

                            default:
                                break;
                        }
                        // clearScreen(); //Função de limpar a tela
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