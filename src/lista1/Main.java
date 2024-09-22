package lista1;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5.0);

        double area = circulo.calcularArea();
        double perimetro = circulo.calcularPerimetro();

        System.out.println("Área do círculo: " + area);
        System.out.println("Perímetro do círculo: " + perimetro);
    }
}
