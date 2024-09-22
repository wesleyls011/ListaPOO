package lista8;

public class Carro {
    private String marca;
    private String modelo;
    private double velocidadeAtual;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0.0;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
            System.out.println("Acelerando... Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("O incremento deve ser positivo.");
        }
    }

    public void frear(double decremento) {
        if (decremento > 0) {
            velocidadeAtual -= decremento;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
            System.out.println("Freiando... Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("O decremento deve ser positivo.");
        }
    }

    public void exibirVelocidade() {
        System.out.println("Velocidade atual do carro " + marca + " " + modelo + ": " + velocidadeAtual + " km/h");
    }
}
