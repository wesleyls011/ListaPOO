package lista4;

import java.util.List;

public class Aluno {
    private String nome;
    private String matricula;
    private List<Double> notas;

    public Aluno(String nome, String matricula, List<Double> notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNota(List<Double> notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public String verificarSituacao(double mediaMinima) {
        double media = calcularMedia();
        if (media >= mediaMinima) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

        public void exibirInformacoes(){
            System.out.println("Nome: " + nome);
            System.out.println("Matrícula: " + matricula);
            System.out.println("Média: " + calcularMedia());
            System.out.println("Situação: " + verificarSituacao(7.0));
        }
    }

