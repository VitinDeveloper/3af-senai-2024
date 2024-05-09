public abstract class Animal {

    private String nome;
    private int idade;
    private String habitat;

    public Animal(String nome, int idade, String habitat) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public abstract void emitirSom();

    public void comer() {
        System.out.println(this.getNome() + " está comendo.");
    }

    public void dormir() {
        System.out.println(this.getNome() + " está dormindo.");
    }
}

class Leao extends Animal {

    private boolean mane; // Juba

    public Leao(String nome, int idade, String habitat, boolean mane) {
        super(nome, idade, habitat);
        this.mane = mane;
    }

    public boolean isMane() {
        return mane;
    }

    public void setMane(boolean mane) {
        this.mane = mane;
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " rugiu!");
    }

    public void rugir() {
        emitirSom(); // Chamada ao método abstrato da superclasse
    }
}

class Elefante extends Animal {

    private boolean tromba;

    public Elefante(String nome, int idade, String habitat, boolean tromba) {
        super(nome, idade, habitat);
        this.tromba = tromba;
    }

    public boolean isTromba() {
        return tromba;
    }

    public void setTromba(boolean tromba) {
        this.tromba = tromba;
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " soltou um barulho de trombeta!");
    }

    public void barulhoDeTrombeta() {
        emitirSom(); // Chamada ao método abstrato da superclasse
    }
}
