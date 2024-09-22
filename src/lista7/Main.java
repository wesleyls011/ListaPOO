package lista7;

import lista6.Verificar;

public class Main {
    public static void main(String[] args){

        Triangulo triangulo = new Triangulo(2,2,3);

        VerificarValido validador = new VerificarValido();
        if (validador.verificarSeValido(triangulo)){
            System.out.println("O triangulo é valido!");

        Calcular areaCalculadora = new Calcular();
        double area = areaCalculadora.calcularArea(triangulo);
        System.out.println("A area do triangulo e: " +area);
        } else {
            System.out.println("Nao e um triangulo valido!");

        }

    }
}
