public class Biblioteca {
    private Livro[] livros;
    private int indiceLivros;

    public Biblioteca(){
        this.livros = new Livro[10];
        this.indiceLivros = 0;
    }

    public Biblioteca(Livro[] livros, int indiceLivros){
        this.livros = new Livro[10];
        this.indiceLivros = 0;
    }

    public void registrarLivro(Livro livro){
        if(indiceLivros < livros.length){
            livros[indiceLivros] = livro;
            indiceLivros++;
        } else {
            System.out.println("A biblioteca está cheia.");
        }
    }

    public Livro buscarLivro(String isbn) {
        for (int i = 0; i < indiceLivros; i++) {
            if (livros[i].getIsbn().equals(isbn)) {
                return livros[i];
            }
        }
        return null;
    }
    public boolean devolverLivro(String isbn){
        for (int i = 0; i < indiceLivros; i++){
            if(livros[i].getIsbn().equals(isbn) && livros[i].isEmprestado()){
                livros[i].devolver();
                System.out.println("Livro devolvido.");
                return true;
            }
        }
        System.out.println("Livro nao disponivel ou nao emprestado.");
        return false;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public int getIndiceLivros() {
        return indiceLivros;
    }

    public void setIndiceLivros(int indiceLivros) {
        this.indiceLivros = indiceLivros;
    }

}
