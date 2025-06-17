import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        double Saldo = 2500.00;
        String nome = "Cesar Henrique";
        String tipoConta = "Corrente";

        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + Saldo);
        System.out.println("***********************\n");

        System.out.println("Operaçoes disponíveis:");
        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair\n");

        System.out.println("Digite a opção desejada:");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Consultando saldos...");
                System.out.println("Nome: " + nome);
                System.out.println("Tipo conta: " + tipoConta);
                System.out.println("Saldo: R$ " + Saldo);
                break;

            case 2:
                System.out.println("Digite o valor a receber:");
                double valorReceber = scanner.nextDouble();
                if (valorReceber > 0) {
                    Saldo += valorReceber;
                    System.out.println("Valor recebido com sucesso! Novo saldo: R$ " + Saldo);
                } else {
                    System.out.println("Valor inválido para receber.");
                }
                break;

            case 3:
                System.out.println("Digite o valor a transferir:");
                double valorTransferir = scanner.nextDouble();
                if (valorTransferir > 0 && valorTransferir <= Saldo) {
                    Saldo -= valorTransferir;
                    System.out.println("Valor transferido com sucesso! Novo saldo: R$ " + Saldo);
                } else if (valorTransferir > Saldo) {
                    System.out.println("Saldo insuficiente para realizar a transferência.");
                } else {
                    System.out.println("Valor inválido para transferência.");
                }
                break;

            case 4:
                System.out.println("Saindo do sistema. Obrigado por usar nossos serviços!");
                scanner.close();
                return;

            default:
                System.out.println("Opção inválida.");
        }
    }
}