import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaSimples contaA = new ContaSimples("A");
        ContaSimples contaB = new ContaSimples("B");
        ContaSimples contaC = new ContaSimples("C");

        System.out.print("Digite um valor para a conta A: ");
        double valorDepositoA = scanner.nextDouble();
        contaA.depositar(valorDepositoA);

        System.out.print("Digite um valor para a conta B: ");
        double valorDepositoB = scanner.nextDouble();
        contaB.depositar(valorDepositoB);

        System.out.print("Digite um valor para a conta C: ");
        double valorDepositoC = scanner.nextDouble();
        contaC.depositar(valorDepositoC);

        System.out.print("Digite um valor para transferir de A pra B: ");
        double valorTransferenciaAB = scanner.nextDouble();
        contaA.transferir(contaB, valorTransferenciaAB);

        System.out.print("Digite um valor para transferir de B pra C: ");
        double valorTransferenciaBC = scanner.nextDouble();
        contaB.transferir(contaC, valorTransferenciaBC);

        System.out.print("Digite um valor para transferir de C para A: ");
        double valorTransferenciaCA = scanner.nextDouble();
        contaC.transferir(contaA, valorTransferenciaCA);

        System.out.println("Extrato da conta A:\n" + contaA.getExtrato());
        System.out.println("Extrato da conta B:\n" + contaB.getExtrato());
        System.out.println("Extrato da conta C:\n" + contaC.getExtrato());

        scanner.close();
    }
}
