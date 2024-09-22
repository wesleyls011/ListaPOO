package lista10;

public class VerificarDisp {

    public boolean verificarDisponibilidade(Livro livro) {
        if (!livro.isEmprestado()) {
            System.out.println("O livro " + livro.getTitulo() + "esta disponivel");
            return true;
        } else {
            System.out.println("O livro " +livro.getTitulo() + "nao esta disponivel");
            return false;
        }
    }
}
