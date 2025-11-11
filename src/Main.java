import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Bem-vindo ao Banco Simples ===");
        System.out.print("Digite o nome do titular da conta: ");
        String nome = input.nextLine();

        ContaBancaria conta = new ContaBancaria(nome, 0);
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver saldo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    double dep = input.nextDouble();
                    conta.depositar(dep);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double saque = input.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    conta.exibirSaldo();
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        input.close();
    }
}
