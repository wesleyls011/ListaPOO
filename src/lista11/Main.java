package lista11;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana Silva", 28, "Engenheira");

        AnosBissextos anosBissextos = new AnosBissextos();

        ExibirInformacoes exibirInfo = new ExibirInformacoes(anosBissextos);

        exibirInfo.exibirInformacoes(pessoa);
    }
}

