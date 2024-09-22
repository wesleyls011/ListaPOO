package lista13;

public class Desconto {
    public double aplicarDesconto(double valorTotal, double percentualDesconto) {
        return valorTotal - (valorTotal * (percentualDesconto / 100));
    }
}
