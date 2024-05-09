public class Main {

    public static void main(String[] args) {

        // Criando objetos Leão e Elefante
        Leao leao = new Leao("Simba", 5, "Savana Africana", true);
        Elefante elefante = new Elefante("Jumbo", 10, "Floresta Amazônica", true);

        // Acessando atributos e métodos
        System.out.println("------ Leão ------");
        System.out.println("Nome: " + leao.getNome());
        System.out.println("Idade: " + leao.getIdade());
        System.out.println("Habitat: " + leao.getHabitat());
        System.out.println("Mane: " + leao.isMane());
        leao.comer();
        leao.dormir();
        leao.rugir();

        System.out.println("\n------ Elefante ------");
        System.out.println("Nome: " + elefante.getNome());
        System.out.println("Idade: " + elefante.getIdade());
        System.out.println("Habitat: " + elefante.getHabitat());
        System.out.println("Tromba: " + elefante.isTromba());
        elefante.comer();
        elefante.dormir();
        elefante.barulhoDeTrombeta();
    }
}
