import javax.swing.*;

public class Main {
//    static void escrever(String t){
//        JOptionPane.showMessageDialog(null, t);
//    }
//
//    static float media(int a, int b){
//        float soma = (float) a+b;
//        return soma/2;
//    }

    public static void main(String[] args) {
//        escrever("Oi gente");
//        System.out.println(media(3, 8));
        Pessoa p = new Pessoa("Breno", 18);
//        p.setIdade(16);
//        p.idade = p.idade + 1;
//        p.setIdade(p.getIdade() + 1);
        System.out.println(p.getNome() + " tem " + p.getIdade() + " Anos");
//        p.dizerOla();
    }

}