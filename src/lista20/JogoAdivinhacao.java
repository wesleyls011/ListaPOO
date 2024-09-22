package lista20;

import java.util.Random;

public class JogoAdivinhacao {
    private int numeroSecreto;

    public JogoAdivinhacao() {
        this.numeroSecreto = gerarNumeroAleatorio();
    }

    private int gerarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public String verificarPalpite(int palpite) {
        if (palpite < numeroSecreto) {
            return "O número é maior.";
        } else if (palpite > numeroSecreto) {
            return "O número é menor.";
        } else {
            return "Parabéns! Você adivinhou o número " + numeroSecreto + "!";
        }
    }
}
