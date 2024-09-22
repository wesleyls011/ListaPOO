package lista17;

public class Main {
    public static void main(String[] args) {
        RedeSocial redeSocial = new RedeSocial();

        Usuario alice = new Usuario("Alice");
        Usuario bob = new Usuario("Bob");
        Usuario carla = new Usuario("Carla");

        redeSocial.adicionarUsuario(alice);
        redeSocial.adicionarUsuario(bob);
        redeSocial.adicionarUsuario(carla);

        redeSocial.exibirUsuarios();

        alice.adicionarAmigo(bob);
        bob.adicionarAmigo(carla);

        Post postAlice = new Post("Vai corinthians!");
        alice.publicar(postAlice);

        Post postBob = new Post("Coringão amassa");
        bob.publicar(postBob);

        alice.comentar(postBob, "Te amo Rodrigo Garro!");
        bob.comentar(postAlice, "Te amo Romero!");

        System.out.println("Comentarios no post de Bob:");
        for (Comentario comentario : postBob.getComentarios()) {
            System.out.println(comentario);
        }
    }
}
