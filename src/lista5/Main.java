package lista5;

public class Main {
    public static void main(String[] args){

        Funcionario funcionario = new Funcionario("wesley", 1600, "escravo");
        CalcularSalarioLiquido calculadora = new CalcularSalarioLiquido();
        double salarioLiquido = calculadora.calcularSalarioLiquido(funcionario);

        System.out.println("Nome: " +funcionario.getNome());
        System.out.println("Salario bruto: " +funcionario.getSalarioBruto());
        System.out.println("Cargo: " +funcionario.getCargo());
        System.out.println("Salario Liquido: " +salarioLiquido);

    }
}
