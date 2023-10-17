public class ContaSimples {
    private String nome;
    private double saldo;

    public ContaSimples(String nome) {
        this.nome = nome;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Foi depositado um valor de R$" + valor + " na conta " + nome);
        } else {
            System.out.println("Deposito inválido");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Realizou um saque de " + valor + " na conta " + nome);
            return true;
        } else {
            System.out.println("Saque de R$" + valor + " foi negado " + nome);
            return false;
        }
    }

    public void transferir(ContaSimples outraConta, double valor) {
        if (sacar(valor)) {
            outraConta.depositar(valor);
            System.out.println("Transferiu " + valor + "reais da conta " + nome + " para a conta " + outraConta.nome);
        } else {
            System.out.println("A transferencia de " + valor + " foi negada da conta " + nome + " para a conta " + outraConta.nome);
        }
    }

    public String getExtrato() {
        return "Conta: " + nome + "\nSaldo: R$" + saldo;
    }
}
