public class UsuarioAluno extends Usuario{
    private String curso;
    private int anoMatricula;
    private int periodo;

    public UsuarioAluno(String nome, String id, String curso, int anoMatricula, int periodo){
        super(nome, id);
        this.curso = curso;
        this.anoMatricula = anoMatricula;
        this.periodo = periodo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoMatricula() {
        return anoMatricula;
    }

    public void setAnoMatricula(int anoMatricula) {
        this.anoMatricula = anoMatricula;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Usuario (Aluno): [ Nome: " + nome + '\'' +
                "ID: " + id + '\'' +
                "Curso: " + curso + '\'' +
                "Ano da matricula: " + anoMatricula + '\'' +
                "Periodo: " + periodo + " ]";
    }
}
