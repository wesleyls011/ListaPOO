package lista19;

import java.time.LocalDate;

public class Data {
    private LocalDate data;

    public Data(int ano, int mes, int dia) {
        this.data = LocalDate.of(ano, mes, dia);
    }

    public LocalDate getData() {
        return data;
    }

    public int getAno() {
        return data.getYear();
    }

    public int getMes() {
        return data.getMonthValue();
    }

    public int getDia() {
        return data.getDayOfMonth();
    }

    public long diferencaEmDias(Data outraData) {
        return Math.abs(this.data.toEpochDay() - outraData.getData().toEpochDay());
    }

    @Override
    public String toString() {
        return data.toString();
    }
}

