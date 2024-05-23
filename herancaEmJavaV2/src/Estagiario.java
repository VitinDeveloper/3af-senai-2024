public class Estagiario extends Aluno {
    private String area;

    public Estagiario(String nome, int id, String senha, String curso, String area) {
        super(nome, id, senha, curso);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
