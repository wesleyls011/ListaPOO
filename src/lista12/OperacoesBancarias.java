package lista12;

public class OperacoesBancarias {
    public void sacar(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void depositar(ContaBancaria conta, double valor) {
        conta.depositar(valor);
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
        if (origem.transferir(destino, valor)) {
            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}
