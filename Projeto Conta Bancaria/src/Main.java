import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nome = "Ana Carolina";
        String tipoConta = "Corrente";
        double saldo = 2050.50;
        int op = 0;
        double deposito = 0;
        double transferencia = 0;

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("\nDados iniciais do Cliente: ");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo Inicial: R$" + saldo);
        System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

        while (op != 4) {
            System.out.println("\nOperações");
            System.out.println("\n1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println("\nDigite a opção desejada: ");
            op = teclado.nextInt();


            if(op == 1){
                System.out.println("Saldo disponível: " + saldo);
            } else if (op == 2) {
                System.out.println("Informe o valor do depósito: R$");
                deposito = teclado.nextDouble();
                if (deposito < 1) {
                    System.out.println("Não foi possível realizar o depósito.\nValores aceito a partir de R$1.00 ");
                } else {
                    System.out.println("R$" + deposito + "depositado com sucesso");
                    saldo += deposito;
                }

            } else if (op == 3) {
                System.out.println("Informe o valor da transferência: R$");
                transferencia = teclado.nextDouble();
                if (transferencia < 1) {
                    System.out.println("Não foi possível realizar a transferência.\nValores aceito a partir de R$1.00");
                } else if (transferencia > saldo) {
                    System.out.println("Operação não realizada o valor ultrapassa o saldo disponível em conta.");
                    System.out.println("Saldo disponível: R$ " +saldo);
                } else {
                    System.out.println("R$" + transferencia + " transferido com sucesso.");
                    saldo -= transferencia;
                }

            } else if (op == 4) {
                System.out.println("Atendimento encerrado.");
                break;
            } else {
                System.out.println("\nOpção inválida!");
            }

        }


    }
}