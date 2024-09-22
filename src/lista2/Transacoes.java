package lista2;

public class Transacoes {

    public void depositar(ContaBancaria conta, double valor) {
        if (valor > 0) {
            double novoSaldo = conta.getSaldo() + valor;
            conta.atualizarSaldo(novoSaldo);
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(ContaBancaria conta, double valor) {
        if (valor > 0 && valor <= conta.getSaldo()) {
            double novoSaldo = conta.getSaldo() - valor;
            conta.atualizarSaldo(novoSaldo);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }


}
