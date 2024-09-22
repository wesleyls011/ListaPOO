package lista19;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class Calendario {
    private int ano;
    private Feriado feriado;

    public Calendario(int ano) {
        this.ano = ano;
        this.feriado = new Feriado();
    }

    public void adicionarFeriado(int mes, int dia) {
        feriado.adicionarFeriado(ano, mes, dia);
    }

    public void exibirCalendarioMes(int mes) {
        YearMonth yearMonth = YearMonth.of(ano, mes);
        System.out.println("Calendário de " + yearMonth.getMonth() + " " + ano);
        System.out.println("Do  Se Te  Qu Qu  Se Sa");

        int diaDaSemana = yearMonth.atDay(1).getDayOfWeek().getValue() % 7;
        for (int i = 0; i < diaDaSemana; i++) {
            System.out.print("   ");
        }

        for (int dia = 1; dia <= yearMonth.lengthOfMonth(); dia++) {
            System.out.printf("%2d ", dia);
            if ((dia + diaDaSemana) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public boolean verificarFeriado(int mes, int dia) {
        return feriado.ehFeriado(new Data(ano, mes, dia));
    }
}
