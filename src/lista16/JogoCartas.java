package lista16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JogoCartas {
    private List<Carta> baralho;
    private List<Jogador> jogadores;

    public JogoCartas() {
        this.baralho = new ArrayList<>();
        this.jogadores = new ArrayList<>();
        inicializarBaralho();
    }

    private void inicializarBaralho() {
        String[] cores = {"Vermelho", "Azul", "Verde", "Amarelo"};
        String[] valores = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Skip", "Reverse", "Draw 2"};

        for (String cor : cores) {
            for (String valor : valores) {
                baralho.add(new Carta(cor, valor));
                if (!valor.equals("0")) {
                    baralho.add(new Carta(cor, valor));
                }
            }
        }

        baralho.add(new Carta("Especial", "Wild"));
        baralho.add(new Carta("Especial", "Wild Draw 4"));
    }

    public void embaralhar() {
        Collections.shuffle(baralho);
        System.out.println("Baralho embaralhado.");
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
        System.out.println("Jogador " + jogador.getNome() + " adicionado.");
    }

    public void distribuirCartas(int quantidade) {
        for (Jogador jogador : jogadores) {
            for (int i = 0; i < quantidade; i++) {
                if (!baralho.isEmpty()) {
                    jogador.adicionarCarta(baralho.remove(0));
                }
            }
        }
        System.out.println(quantidade + " cartas distribuídas para cada jogador.");
    }

    public void exibirCartasJogador(Jogador jogador) {
        System.out.println("Cartas do jogador " + jogador.getNome() + ": " + jogador.getCartas());
    }

    public void jogarCarta(Jogador jogador, Carta carta) {
        if (jogador.getCartas().contains(carta)) {
            jogador.removerCarta(carta);
            System.out.println(jogador.getNome() + " jogou a carta: " + carta);
        } else {
            System.out.println(jogador.getNome() + " não possui essa carta.");
        }
    }
}
