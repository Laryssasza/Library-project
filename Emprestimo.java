public class Emprestimo {
    private Usuario usuario;
    private Livro[] livros;
    private String dataEmprestimo;

    public Emprestimo(Usuario usuario, Livro[] livros, String dataEmprestimo) {
        this.usuario = usuario;
        this.livros = livros;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    @Override
    public String toString() {
        String livrosEmprestados = "";
        for (Livro livro : livros) {
            livrosEmprestados += livro.toString() + "\\n";
        }
        return "Emprestimo [ Usuario: " + usuario + ", " +
                "Livros: " + livrosEmprestados +
                "Data de empréstimo: '" + dataEmprestimo + "' ]";
    }

}
