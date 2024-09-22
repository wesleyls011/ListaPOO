package lista14;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato " + contato.getNome() + " adicionado com sucesso.");
    }

    public void editarContato(String nome, String novoNome, String novoTelefone) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNome(novoNome);
                contato.setTelefone(novoTelefone);
                System.out.println("Contato " + nome + " editado com sucesso.");
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    public void removerContato(String nome) {
        contatos.removeIf(contato -> contato.getNome().equalsIgnoreCase(nome));
        System.out.println("Contato " + nome + " removido com sucesso.");
    }

    public Contato buscarPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        System.out.println("Contato não encontrado.");
        return null;
    }

    public Contato buscarPorTelefone(String telefone) {
        for (Contato contato : contatos) {
            if (contato.getTelefone().equals(telefone)) {
                return contato;
            }
        }
        System.out.println("Contato não encontrado.");
        return null;
    }

    public void listarContatos() {
        System.out.println("Contatos na agenda:");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}
