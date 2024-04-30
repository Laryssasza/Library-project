import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Registrar livro");
            System.out.println("2. Emprestar livro");
            System.out.println("3. Devolver livro");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o título do livro:");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o autor do livro:");
                    String autor = scanner.nextLine();
                    System.out.println("Digite o gênero do livro:");
                    String genero = scanner.nextLine();
                    System.out.println("Digite o ISBN do livro:");
                    String isbn = scanner.nextLine();
                    Livro livro = new Livro(titulo, autor, genero, isbn, false);
                    biblioteca.registrarLivro(livro);
                    break;
                case 2:
                    System.out.println("Digite o ISBN do livro a ser emprestado: ");
                    String isbnEmprestimo = scanner.nextLine();
                    Livro livroParaEmprestar = biblioteca.buscarLivro(isbnEmprestimo);
                    if (livroParaEmprestar != null && !livroParaEmprestar.isEmprestado()) {
                        livroParaEmprestar.setEmprestado(true);
                        System.out.println("Livro emprestado.");
                    } else {
                        System.out.println("Livro não disponível para empréstimo.");
                    }
                    System.out.println("Digite o nome do usuário:");
                    String nomeUsuario = scanner.nextLine();
                    System.out.println("Digite o ID do usuário:");
                    String idUsuario = scanner.nextLine();
                    System.out.println("O usuário é aluno (S/N)?");
                    char aluno = scanner.next().charAt(0);
                    scanner.nextLine();
                    if (aluno == 'S' || aluno == 's') {
                        System.out.println("Digite o curso do aluno:");
                        String curso = scanner.nextLine();
                        System.out.println("Digite o ano de matrícula:");
                        int anoMatricula = scanner.nextInt();
                        System.out.println("Digite o período do aluno:");
                        int periodo = scanner.nextInt();
                        UsuarioAluno usuario = new UsuarioAluno(nomeUsuario, idUsuario, curso, anoMatricula, periodo);
                        Emprestimo emprestimo = new Emprestimo(usuario, biblioteca.getLivros(), "15/04/2024");
                    } else {
                        System.out.println("Digite o departamento do professor:");
                        String departamento = scanner.nextLine();
                        System.out.println("Digite o ano de admissão do professor:");
                        int anoAdmissao = scanner.nextInt();
                        UsuarioProfessor usuario = new UsuarioProfessor(nomeUsuario, idUsuario, departamento, anoAdmissao);
                        Emprestimo emprestimo = new Emprestimo(usuario, biblioteca.getLivros(),"12/04/2024");
                    }
                    break;

                case 3:
                    System.out.println("Digite o ISBN do livro a ser devolvido:");
                    String isbnDevolucao = scanner.nextLine();
                    Livro livroParaDevolver = biblioteca.buscarLivro(isbnDevolucao);
                    if (livroParaDevolver != null && livroParaDevolver.isEmprestado()) {
                        livroParaDevolver.setEmprestado(false);
                        System.out.println("Livro devolvido.");
                    } else {
                        System.out.println("Livro não disponível ou não emprestado.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 4);

    }
}