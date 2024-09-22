package lista8;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla");

        carro.exibirVelocidade();

        carro.acelerar(50);
        carro.acelerar(30);

        carro.frear(20);
        carro.frear(100); // Testando o limite

        carro.exibirVelocidade();
    }
}
