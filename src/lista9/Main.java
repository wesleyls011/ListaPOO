package lista9;

public class Main {
    public static void main(String[] args){

        Paciente paciente = new Paciente("Bele Belinha", 20);

        paciente.adicionarConsulta("Consulta - 33/33/3333");
        paciente.adicionarConsulta("Exame de sangue - 77/77/7777");
        paciente.adicionarConsulta("Retorno - 11/11/1111");

        paciente.exibirHistoricoConsultas();
    }
}
