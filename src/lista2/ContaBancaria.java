package lista2;

public class ContaBancaria {
    private String numConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(String numConta, String nomeTitular, double saldo){
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void atualizarSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }
}
