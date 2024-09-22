package lista7;

public class VerificarValido {
    public boolean verificarSeValido(Triangulo triangulo) {
        double lado1 = triangulo.getLado1();
        double lado2 = triangulo.getLado2();
        double lado3 = triangulo.getLado3();

        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
    }

