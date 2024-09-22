package lista6;

public class ValorTotal {
    public double valorTotalEstoque(Produto produto){
        return produto.getQtd() * produto.getPreco();
    }

}
