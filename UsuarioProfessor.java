public class UsuarioProfessor extends Usuario{
    private String departamento;
    private int anoAdmissao;

    public UsuarioProfessor(String nome, String id, String departamento, int anoAdmissao){
        super(nome, id);
        this.departamento = departamento;
        this.anoAdmissao = anoAdmissao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getAnoAdmissao() {
        return anoAdmissao;
    }

    public void setAnoAdmissao(int anoAdmissao) {
        this.anoAdmissao = anoAdmissao;
    }

    @Override
    public String toString() {
        return "Usuario (Professor): [ Nome:"  + nome + '\'' +
                "ID:"  + id + '\'' +
                "Departamento: " + departamento + '\'' +
                "Ano de admissao: " + anoAdmissao + " ]";
    }
}
