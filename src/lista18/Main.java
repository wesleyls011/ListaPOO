package lista18;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Game of Thrones", "George R. R. Martin");
        Livro livro2 = new Livro("Vinte Mil Léguas Submarinas", "Júlio Verne");
        Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");

        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarLivro(livro2);
        biblioteca.cadastrarLivro(livro3);

        biblioteca.listarLivros();

        biblioteca.emprestarLivro("Vinte Mil Léguas Submarinas");
        biblioteca.emprestarLivro("Júlio Verne");

        biblioteca.verificarDisponibilidade("Vinte Mil Léguas Submarinas");
        biblioteca.verificarDisponibilidade("Júlio Verne");

        biblioteca.devolverLivro("Vinte Mil Léguas Submarinas");

        biblioteca.verificarDisponibilidade("Vinte Mil Léguas Submarinas");

        biblioteca.listarLivros();
    }
}

