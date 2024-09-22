package lista10;

public class Emprestimo {

    public boolean emprestarLivro(Livro livro){
        if (!livro.isEmprestado()){
            livro.emprestar();
            System.out.println("O livro " +livro.getTitulo() + " foi emprestado");
            return true;
        } else {
            System.out.println("O livro " +livro.getTitulo() + " ja esta emprestado");
            return false;
        }
    }

    public boolean devolverLivro(Livro livro){
        if (!livro.isEmprestado()){
            livro.devolver();
            System.out.println("O livro " +livro.getTitulo() + " foi devolvido");
            return true;
        } else {
            System.out.println("O livro " +livro.getTitulo() + " ainda nao foi devolvido");
            return false;
        }
    }

    public boolean verificarDisponibilidade(Livro livro) {
        if (!livro.isEmprestado()) {
            System.out.println("O livro " + livro.getTitulo() + " esta disponivel");
            return true;
        } else {
            System.out.println("O livro " +livro.getTitulo() + " nao esta disponivel");
            return false;
        }
    }
}
