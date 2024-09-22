package lista11;

public class AnosBissextos {
    public int calcularAnosBissextos(int anoNascimento, int idade) {
        int anosBissextos = 0;
        int anoAtual = 2024;

        for (int ano = anoNascimento; ano <= anoAtual; ano++) {
            if (isBissexto(ano)) {
                anosBissextos++;
            }
        }
        return anosBissextos;
    }

    private boolean isBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
