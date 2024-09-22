package lista15;

public class Main {
    public static void main(String[] args) {
        MaquinaDeVendas maquina = new MaquinaDeVendas();

        maquina.cadastrarProduto(new Produto("Cachorro Quente", 5.00, 10));
        maquina.cadastrarProduto(new Produto("Refrigerante", 4.00, 5));
        maquina.cadastrarProduto(new Produto("Batata Frita", 6.00, 7));

        maquina.exibirEstoque();

        maquina.selecionarProduto("Cachorro Quente");
        maquina.inserirDinheiro(10.00);
        maquina.comprar("Cachorro Quente");

        maquina.selecionarProduto("Refrigerante");
        maquina.inserirDinheiro(2.00);
        maquina.comprar("Refrigerante");

        maquina.inserirDinheiro(5.00);
        maquina.comprar("Refrigerante");

        maquina.exibirEstoque();
    }
}
