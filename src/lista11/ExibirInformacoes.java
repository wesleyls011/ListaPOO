package lista11;

public class ExibirInformacoes {
    private AnosBissextos anosBissextos;

    public ExibirInformacoes(AnosBissextos anosBissextos) {
        this.anosBissextos = anosBissextos;
    }

    public void exibirInformacoes(Pessoa pessoa) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Profissão: " + pessoa.getProfissao());

        int anosBissextosVividos = anosBissextos.calcularAnosBissextos(pessoa.getAnoNascimento(), pessoa.getIdade());
        System.out.println("Anos bissextos vividos: " + anosBissextosVividos);
    }
}
