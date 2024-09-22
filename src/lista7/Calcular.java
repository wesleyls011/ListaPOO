package lista7;

public class Calcular {
    public double calcularArea(Triangulo triangulo){
        double lado1 = triangulo.getLado1();
        double lado2 = triangulo.getLado2();
        double lado3 = triangulo.getLado3();

        double semiPerimetro = (lado1 + lado2 + lado3) / 2;

        return Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));

    }
}
