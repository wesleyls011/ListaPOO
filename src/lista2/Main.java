package lista2;

public class Main {
    public static void main (String[] args){

        ContaBancaria conta = new ContaBancaria("12345", "João Silva", 1000.00);
        Transacoes transacao = new Transacoes();

        transacao.depositar(conta, 200);
        transacao.sacar(conta, 150);

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}
