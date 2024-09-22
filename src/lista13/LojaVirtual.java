package lista13;

import java.util.HashMap;
import java.util.Map;

public class LojaVirtual {
    private Map<String, Produto> produtos;

    public LojaVirtual() {
        produtos = new HashMap<>();
    }

    public void cadastrarProduto(String nome, double preco) {
        Produto produto = new Produto(nome, preco);
        produtos.put(nome, produto);
        System.out.println("Produto " + nome + " cadastrado com sucesso.");
    }

    public Produto buscarProduto(String nome) {
        return produtos.get(nome);
    }

    public CarrinhoDeCompras criarCarrinho() {
        return new CarrinhoDeCompras();
    }
}
