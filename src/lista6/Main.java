package lista6;

public class Main {
    public static void main(String[] args){

        Produto produto = new Produto("Consolo", 77,33);

        ValorTotal valor = new ValorTotal();
        double valortotal = valor.valorTotalEstoque(produto);

        Verificar estoque = new Verificar();
        boolean disponivel = estoque.verificarDisp(produto);


        System.out.println("Produto: " +produto.getNome());
        System.out.println("Preco: " +produto.getPreco());
        System.out.println("Quantidade em estoque: " +produto.getQtd());
        System.out.println("Valor total em estoque: " +valortotal);
        System.out.println("Disponibilidade: " +(disponivel ? "Sim" : "Nao"));

    }
}
