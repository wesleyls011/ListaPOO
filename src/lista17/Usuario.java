package lista17;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Usuario> amigos;
    private List<Post> posts;

    public Usuario(String nome) {
        this.nome = nome;
        this.amigos = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void adicionarAmigo(Usuario amigo) {
        amigos.add(amigo);
        System.out.println(amigo.getNome() + " agora é amigo de " + nome);
    }

    public void publicar(Post post) {
        posts.add(post);
        System.out.println(nome + " publicou: " + post.getMensagem());
    }

    public void comentar(Post post, String comentario) {
        post.adicionarComentario(this, comentario);
    }

    @Override
    public String toString() {
        return nome;
    }
}
