public class ImovelDeVenda extends Imovel {
    private double preco;

    public ImovelDeVenda(String endereco, String area, int numeroQuartos, int id, String tipo, String padrao, double preco) {
        super(endereco, area, numeroQuartos, id, tipo, padrao);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
