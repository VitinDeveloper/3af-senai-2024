public class Funcionario extends Pessoa {
    private String cargo;
    private String avisarQueNaoTemAula;

    public Funcionario(String nome, int id, String senha, String cargo, String avisarQueNaoTemAula) {
        super(nome, id, senha);
        this.cargo = cargo;
        this.avisarQueNaoTemAula = avisarQueNaoTemAula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAvisarQueNaoTemAula() {
        return avisarQueNaoTemAula;
    }

    public void setAvisarQueNaoTemAula(String avisarQueNaoTemAula) {
        this.avisarQueNaoTemAula = avisarQueNaoTemAula;
    }
}
