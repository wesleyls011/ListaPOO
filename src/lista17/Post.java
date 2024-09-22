package lista17;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private String mensagem;
    private List<Comentario> comentarios;

    public Post(String mensagem) {
        this.mensagem = mensagem;
        this.comentarios = new ArrayList<>();
    }

    public String getMensagem() {
        return mensagem;
    }

    public void adicionarComentario(Usuario usuario, String comentario) {
        comentarios.add(new Comentario(usuario, comentario));
        System.out.println(usuario.getNome() + " comentou: " + comentario);
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }
}

class Comentario {
    private Usuario usuario;
    private String mensagem;

    public Comentario(Usuario usuario, String mensagem) {
        this.usuario = usuario;
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return usuario.getNome() + ": " + mensagem;
    }
}
