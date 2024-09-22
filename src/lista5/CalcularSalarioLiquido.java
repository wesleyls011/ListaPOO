package lista5;

public class CalcularSalarioLiquido {
    private ImpostosEBeneficios impostosEBeneficios;

    public CalcularSalarioLiquido(){
        this.impostosEBeneficios = new ImpostosEBeneficios();
    }

    public double calcularSalarioLiquido(Funcionario funcionario){
        double salarioBruto = funcionario.getSalarioBruto();
        double imposto = impostosEBeneficios.calcularImposto(salarioBruto);
        double beneficios = impostosEBeneficios.calcularBeneficio(salarioBruto);
        return salarioBruto - imposto + beneficios;
    }
}
