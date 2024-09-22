package lista13;

public class Main {
    public static void main(String[] args) {
        LojaVirtual loja = new LojaVirtual();

        loja.cadastrarProduto("Notebook", 2500.00);
        loja.cadastrarProduto("Smartphone", 1200.00);
        loja.cadastrarProduto("Tablet", 800.00);

        CarrinhoDeCompras carrinho = loja.criarCarrinho();

        carrinho.adicionarProduto(loja.buscarProduto("Notebook"));
        carrinho.adicionarProduto(loja.buscarProduto("Smartphone"));

        carrinho.listarProdutos();

        double total = carrinho.calcularTotal();
        System.out.println("Total: R$ " + total);

        Desconto desconto = new Desconto();
        double totalComDesconto = desconto.aplicarDesconto(total, 10);
        System.out.println("Total com desconto: R$ " + totalComDesconto);
    }
}
