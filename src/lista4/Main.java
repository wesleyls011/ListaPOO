package lista4;

import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Double> notas = List.of(8.5,7.0,6.5);
        Aluno aluno = new Aluno("wesley", "1107", notas);

        aluno.exibirInformacoes();
    }
}
