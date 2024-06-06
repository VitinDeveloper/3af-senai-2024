import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Imovel> imoveis = new ArrayList<>();

        ImovelDeAluguel imovelDeAluguel = new ImovelDeAluguel("Rua dos baiano", "10m", 2, 10, "Apartamento", "Classe media", 1600, true);
        imoveis.add(imovelDeAluguel);

        ImovelDeVenda imovelDeVenda = new ImovelDeVenda("Rua das goiaba", "35m", 3, 157, "Casa", "Luxo", 350.000);
        imoveis.add(imovelDeVenda);

    }
}