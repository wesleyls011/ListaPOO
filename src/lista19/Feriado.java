package lista19;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Feriado {
    private Set<LocalDate> feriados;

    public Feriado() {
        feriados = new HashSet<>();
    }

    public void adicionarFeriado(int ano, int mes, int dia) {
        feriados.add(LocalDate.of(ano, mes, dia));
    }

    public boolean ehFeriado(Data data) {
        return feriados.contains(data.getData());
    }
}
