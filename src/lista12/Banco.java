package lista12;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Cliente> clientes = new HashMap<>();
    private Map<String, ContaBancaria> contas = new HashMap<>();

    public Cliente cadastrarCliente(String nome, String cpf) {
        Cliente cliente = new Cliente(nome, cpf);
        clientes.put(cpf, cliente);
        System.out.println("Cliente " + nome + " cadastrado com sucesso.");
        return cliente;
    }

    public ContaBancaria abrirConta(Cliente cliente, String numeroConta) {
        ContaBancaria conta = new ContaBancaria(numeroConta, cliente);
        contas.put(numeroConta, conta);
        System.out.println("Conta " + numeroConta + " aberta com sucesso para " + cliente.getNome());
        return conta;
    }

    public ContaBancaria buscarConta(String numeroConta) {
        return contas.get(numeroConta);
    }

    public Cliente buscarCliente(String cpf) {
        return clientes.get(cpf);
    }
}
