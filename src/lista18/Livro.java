package lista18;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        } else {
            System.out.println("O livro " + titulo + " já está emprestado.");
        }
    }

    public void devolver() {
        disponivel = true;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + (disponivel ? " (Disponível)" : " (Indisponível)");
    }
}

