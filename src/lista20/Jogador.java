package lista20;

import java.util.Scanner;

public class Jogador {
    private JogoAdivinhacao jogo;

    public Jogador(JogoAdivinhacao jogo) {
        this.jogo = jogo;
    }

    public void iniciarJogo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (true) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();

            if (palpite < 1 || palpite > 100) {
                System.out.println("Por favor, digite um número entre 1 e 100.");
                continue;
            }

            String resultado = jogo.verificarPalpite(palpite);
            System.out.println(resultado);

            if (resultado.startsWith("Parabéns")) {
                break;
            }
        }

        scanner.close();
    }
}
