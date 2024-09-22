package lista6;

public class Produto {
    private String nome;
    private double preco;
    private double qtd;

    public Produto(String nome, double preco, double qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getQtd(){
        return qtd;
    }

    public void setQtd(double qtd){
        this.qtd = qtd;
    }
}
