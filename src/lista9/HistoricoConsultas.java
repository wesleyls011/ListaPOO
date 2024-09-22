package lista9;

import java.util.ArrayList;
import java.util.List;

public class HistoricoConsultas {
    private List<String> consultas;

    public HistoricoConsultas(){
        this.consultas = new ArrayList<>();
    }

    public void adicionarConsulta(String consulta){
        consultas.add(consulta);
    }

    public void exibirConsultas(){
        if (consultas.isEmpty()){
            System.out.println("Nenhuma consulta registrada.");
        } else {
            System.out.println("Historico de Consultas: ");
            for (String consulta : consultas){
                System.out.println(consulta);
            }
        }
    }

}

