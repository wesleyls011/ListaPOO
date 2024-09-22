package lista15;

import java.util.ArrayList;
import java.util.List;

public class MaquinaDeVendas {
    private List<Produto> produtos;
    private double saldoInserido;

    public MaquinaDeVendas() {
        this.produtos = new ArrayList<>();
        this.saldoInserido = 0.0;
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto " + produto.getNome() + " cadastrado com sucesso.");
    }

    public void exibirEstoque() {
        System.out.println("Estoque disponível:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void selecionarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                if (produto.getQuantidade() > 0) {
                    System.out.println("Produto selecionado: " + produto.getNome());
                    return;
                } else {
                    System.out.println("Produto " + produto.getNome() + " está fora de estoque.");
                    return;
                }
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void inserirDinheiro(double valor) {
        saldoInserido += valor;
        System.out.println("Valor inserido: R$ " + valor);
    }

    public void comprar(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                if (produto.getQuantidade() > 0) {
                    if (saldoInserido >= produto.getPreco()) {
                        saldoInserido -= produto.getPreco();
                        produto.decrementarQuantidade();
                        System.out.println("Compra realizada com sucesso: " + produto.getNome());
                        System.out.println("Troco: R$ " + saldoInserido);
                        saldoInserido = 0;
                        return;
                    } else {
                        System.out.println("Saldo insuficiente para comprar " + produto.getNome());
                        return;
                    }
                } else {
                    System.out.println("Produto " + produto.getNome() + " está fora de estoque.");
                    return;
                }
            }
        }
        System.out.println("Produto não encontrado.");
    }
}
