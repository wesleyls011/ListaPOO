package lista17;

import java.util.ArrayList;
import java.util.List;

public class RedeSocial {
    private List<Usuario> usuarios;

    public RedeSocial() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário " + usuario.getNome() + " adicionado à rede social.");
    }

    public Usuario buscarUsuario(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        System.out.println("Usuário não encontrado.");
        return null;
    }

    public void exibirUsuarios() {
        System.out.println("Usuários na rede social:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
