package lista19;

public class Main {
    public static void main(String[] args) {
        Calendario calendario = new Calendario(2024);

        calendario.adicionarFeriado(1, 1);
        calendario.adicionarFeriado(4, 21);
        calendario.adicionarFeriado(9, 7);

        calendario.exibirCalendarioMes(4);

        int mes = 4, dia = 21;
        if (calendario.verificarFeriado(mes, dia)) {
            System.out.println("O dia " + dia + "/" + mes + " é feriado.");
        } else {
            System.out.println("O dia " + dia + "/" + mes + " não é feriado.");
        }

        Data data1 = new Data(2024, 1, 1);
        Data data2 = new Data(2024, 4, 21);
        long diasDeDiferenca = data1.diferencaEmDias(data2);
        System.out.println("A diferença entre " + data1 + " e " + data2 + " é de " + diasDeDiferenca + " dias.");
    }
}
