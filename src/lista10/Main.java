package lista10;

import lista6.Verificar;

public class Main {
    public static void main(String[] args){

        Livro livro = new Livro("A volta dos que nao foram", "Alek", 777);

        Emprestimo emprestimo = new Emprestimo();

        emprestimo.verificarDisponibilidade(livro);

        emprestimo.emprestarLivro(livro);

        emprestimo.devolverLivro(livro);

        emprestimo.verificarDisponibilidade(livro);

    }
}
