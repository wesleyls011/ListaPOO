package lista16;

public class Main {
    public static void main(String[] args) {
        JogoCartas jogo = new JogoCartas();
        jogo.embaralhar();

        Jogador jogador1 = new Jogador("Alice");
        Jogador jogador2 = new Jogador("Bob");
        jogo.adicionarJogador(jogador1);
        jogo.adicionarJogador(jogador2);

        jogo.distribuirCartas(7);

        jogo.exibirCartasJogador(jogador1);
        jogo.exibirCartasJogador(jogador2);

        if (!jogador1.getCartas().isEmpty()) {
            jogo.jogarCarta(jogador1, jogador1.getCartas().get(0));
        }
    }
}

