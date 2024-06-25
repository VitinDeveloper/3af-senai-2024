import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SistemaImobiliaria sistema = new SistemaImobiliaria();

        sistema.adicionarImovelParaAluguel(new ImovelDeAluguel("Rua dos dino, 123", "100m²", 3, 1, "Casa", "Padrão", 1500, true));
        sistema.adicionarImovelParaAluguel(new ImovelDeAluguel("Rua dos baiano, 456", "120m²", 2, 2, "Apartamento", "Padrão", 1200, true));
        sistema.adicionarImovelParaVenda(new ImovelDeVenda("Rua dos maganga, 456", "150m²", 4, 3, "Apartamento", "Luxo", 300000));
        sistema.adicionarImovelParaVenda(new ImovelDeVenda("Rua dos irineu, 789", "200m²", 5, 4, "Casa", "Padrão", 250000));
        sistema.menuPrincipal();
    }
}

class SistemaImobiliaria {

    private List<ImovelDeAluguel> imoveisParaAlugar;
    private List<ImovelDeVenda> imoveisParaVender;
    private List<ImovelDeAluguel> imoveisAlugados;
    private List<ImovelDeVenda> imoveisComprados;
    private Scanner scanner;

    public SistemaImobiliaria() {
        imoveisParaAlugar = new ArrayList<>();
        imoveisParaVender = new ArrayList<>();
        imoveisAlugados = new ArrayList<>();
        imoveisComprados = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void adicionarImovelParaAluguel(ImovelDeAluguel imovel) {
        imoveisParaAlugar.add(imovel);
    }

    public void adicionarImovelParaVenda(ImovelDeVenda imovel) {
        imoveisParaVender.add(imovel);
    }

    public void menuPrincipal() {
        int opcao;
        do {
            System.out.println("===== Menu Principal =====");
            System.out.println("1. Alugar um imóvel");
            System.out.println("2. Comprar um imóvel");
            System.out.println("3. Mostrar imóveis alugados");
            System.out.println("4. Mostrar imóveis comprados");
            System.out.println("5. Sair");
            System.out.println("===========================");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    listarImoveisParaAluguel();
                    alugarImovel();
                    break;
                case 2:
                    listarImoveisParaVenda();
                    comprarImovel();
                    break;
                case 3:
                    mostrarImoveisAlugados();
                    break;
                case 4:
                    mostrarImoveisComprados();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    private void listarImoveisParaAluguel() {
        System.out.println("===== Imóveis para Alugar =====");
        for (ImovelDeAluguel imovel : imoveisParaAlugar) {
            if (imovel.isDisponibilidade()) {
                System.out.println("ID: " + imovel.getId() + " - Endereço: " + imovel.getEndereco());
            }
        }
    }

    private void listarImoveisParaVenda() {
        System.out.println("===== Imóveis para Venda =====");
        for (ImovelDeVenda imovel : imoveisParaVender) {
            System.out.println("ID: " + imovel.getId() + " - Endereço: " + imovel.getEndereco() + " - Preço: " + imovel.getPreco());
        }
    }

    private void alugarImovel() {
        System.out.print("Digite o ID do imóvel que deseja alugar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (ImovelDeAluguel imovel : imoveisParaAlugar) {
            if (imovel.getId() == id && imovel.isDisponibilidade()) {
                imovel.alugar(false);
                imoveisAlugados.add(imovel);
                System.out.println("Imóvel alugado com sucesso!");
                return;
            }
        }
        System.out.println("Imóvel não disponível ou não encontrado.");
    }

    private void comprarImovel() {
        System.out.print("Digite o ID do imóvel que deseja comprar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (ImovelDeVenda imovel : imoveisParaVender) {
            if (imovel.getId() == id) {
                imoveisParaVender.remove(imovel);
                imoveisComprados.add(imovel);
                System.out.println("Imóvel comprado com sucesso!");
                return;
            }
        }
        System.out.println("Imóvel não encontrado.");
    }

    private void mostrarImoveisAlugados() {
        System.out.println("===== Imóveis Alugados =====");
        if (imoveisAlugados.isEmpty()) {
            System.out.println("Nenhum imóvel alugado no momento.");
        } else {
            for (ImovelDeAluguel imovel : imoveisAlugados) {
                System.out.println("ID: " + imovel.getId() + " - Endereço: " + imovel.getEndereco());
            }
        }
    }

    private void mostrarImoveisComprados() {
        System.out.println("===== Imóveis Comprados =====");
        if (imoveisComprados.isEmpty()) {
            System.out.println("Nenhum imóvel comprado no momento.");
        } else {
            for (ImovelDeVenda imovel : imoveisComprados) {
                System.out.println("ID: " + imovel.getId() + " - Endereço: " + imovel.getEndereco() + " - Preço: " + imovel.getPreco());
            }
        }
    }
}