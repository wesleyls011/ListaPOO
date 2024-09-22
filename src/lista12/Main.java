package lista12;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = banco.cadastrarCliente("João Silva", "123.456.789-00");
        Cliente cliente2 = banco.cadastrarCliente("Maria Oliveira", "987.654.321-00");

        ContaBancaria conta1 = banco.abrirConta(cliente1, "001");
        ContaBancaria conta2 = banco.abrirConta(cliente2, "002");

        OperacoesBancarias operacoes = new OperacoesBancarias();

        operacoes.depositar(conta1, 1000);
        operacoes.depositar(conta2, 500);

        operacoes.sacar(conta1, 300);

        operacoes.transferir(conta1, conta2, 200);

        System.out.println("Saldo final da conta 001: R$ " + conta1.getSaldo());
        System.out.println("Saldo final da conta 002: R$ " + conta2.getSaldo());
    }
}
