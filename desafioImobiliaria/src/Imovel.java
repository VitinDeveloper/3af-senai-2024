public class Imovel {
    private String endereco;
    private String area;
    private int numeroQuartos;
    private int id;
    private String tipo;
    private String padrao;

    public Imovel(String endereco, String area, int numeroQuartos, int id, String tipo, String padrao) {
        this.endereco = endereco;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.id = id;
        this.tipo = tipo;
        this.padrao = padrao;
    }

    public void reformar(String area, int numeroQuartos, String padrao) {
        setArea(area);
        setNumeroQuartos(numeroQuartos);
        setPadrao(padrao);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPadrao() {
        return padrao;
    }

    public void setPadrao(String padrao) {
        this.padrao = padrao;
    }
}