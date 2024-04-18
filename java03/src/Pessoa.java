public class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(String n, int i){
        this.nome = n;
        this.idade = i;
    }

//    public void dizerOla(){
//        System.out.println("Olá");
//    }
}
