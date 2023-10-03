import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nomeDoClinte = "Victor de Alneida";
        String tipoConta = "Corrente";
        double saldo = 100;
        int comandoOperacao = 0;

        System.out.println("*************");
        System.out.println("Dados iniciais do Cliente");
        System.out.println("Nome: " + nomeDoClinte);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo Inicial: " + saldo);
        System.out.println("*************");
        System.out.println();


        while (comandoOperacao != 4) {
            System.out.println("Operações");
            System.out.println();
            System.out.println("1 - Consultar Saldos");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Tranferir Valor");
            System.out.println("4 - Sair");
            System.out.println();

            System.out.println("Digite a opção desejada: ");
            comandoOperacao = leitor.nextInt();

            if(comandoOperacao == 4){
                System.out.println("Finalizando Operações!");
                break;
            }

            if(comandoOperacao > 4){
                System.out.println("Comando invalido");
                System.out.println();
            }
            if (comandoOperacao == 1){
                System.out.println("Seu saldo é: " + saldo);
                System.out.println();
            }
            if (comandoOperacao == 2){
                System.out.println("Digite valor a receber: ");
                double recebeValor = leitor.nextDouble();
                saldo = recebeValor + saldo;
                System.out.println("Seu novo saldo é: " + saldo);
                System.out.println();
            }
            if(comandoOperacao == 3){
                System.out.println("Digite valor de transferencia: ");
                double recebeValor = leitor.nextDouble();
                if(saldo < recebeValor){
                    System.out.println("Saldo insuficiente, seu saldo é de: " + saldo);
                    System.out.println();
                }else {
                    saldo = saldo - recebeValor;
                    System.out.println("Transferencia realizada com sucesso, seu no saldo é de: " + saldo);
                    System.out.println();
                }
            }

        }

    }
}