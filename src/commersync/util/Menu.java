package commersync.util;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void exibirMenu() {
        System.out.println("+=========================== Menu ===========================+");
        System.out.println("+ 1. Produtos                                                +");
        System.out.println("+ 2. Pedido de Compra                                        +");
        System.out.println("+ 3. Lista de Produtos Telefones                             +");
        System.out.println("+ 4. Cancelar Sua Conta Perfil                               +");
        System.out.println("+ 5. Cancelar Compra                                         +");
        System.out.println("+ 6. Sair                                                    +");
        System.out.println("+=========================================================== +");
        System.out.print("Escolha uma opção: ");


    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao;

        while (true) {
            exibirMenu();
            try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros! ");
                leia.nextLine();
                opcao = 0;
            }

            if (opcao == 7) {
                //System.out.println(Cores.TEXT_WHITE_BOLD + "\n!");
                System.out.println("Saindo do sistema. Até mais!");
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("Escolha Seu Produto");
                    break;
                case 2:
                    System.out.println("Realize seu Pedido de Compra");
                    break;
                case 3:
                    System.out.println("Lista de Telefones");
                    break;
                case 4:
                    System.out.println("Cancelar Conta");
                    break;
                case 5:
                    System.out.println("Cancelar Seu Pedido de Compra");
            }
        }
    }
}
