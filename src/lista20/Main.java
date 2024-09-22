package lista20;

public class Main {
    public static void main(String[] args) {
        JogoAdivinhacao jogo = new JogoAdivinhacao();
        Jogador jogador = new Jogador(jogo);
        jogador.iniciarJogo();
    }
}
