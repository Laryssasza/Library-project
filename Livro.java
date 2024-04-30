public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private String isbn;
    private boolean emprestado;


    public Livro(String titulo, String autor,String genero, String isbn, boolean emprestado){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.isbn = isbn;
        this.emprestado = false;
    }

    public void emprestar(){
        this.emprestado = true;
    }

    public void devolver(){
        this.emprestado = false;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString(){
        return "Livro [ Titulo: " + titulo + '\'' +
                "Autor: " + autor + '\'' +
                "Genero: " + genero + '\'' +
                "ISBN: " + isbn + " ]";
    }
}
