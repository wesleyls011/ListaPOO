package lista3;

public class retangulo {

    public static double largura;
    public static double altura;

    public retangulo (double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura){
        this.largura = largura;
    }

    public double getAltura(){
        return altura;
    }
    public void setAltura(){
        this.altura = altura;
    }

    public static double calcularArea(){
        return largura * altura;
    }

    public static double calcularPerimetro(){
        return largura + altura + largura + altura;
    }

    public static void exibirInformacoes(){
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
}
