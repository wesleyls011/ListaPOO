package lista14;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarContato(new Contato("João Silva", "1234-5678"));
        agenda.adicionarContato(new Contato("Maria Oliveira", "9876-5432"));

        agenda.listarContatos();

        Contato contatoBuscado = agenda.buscarPorNome("João Silva");
        System.out.println("Contato buscado: " + contatoBuscado);

        agenda.editarContato("João Silva", "João S.", "1111-2222");

        agenda.removerContato("Maria Oliveira");

        agenda.listarContatos();
    }
}
