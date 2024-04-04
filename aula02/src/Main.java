import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Nome: ");
//        String nome = teclado.nextLine();
//        System.out.print("Nota: ");
//        float nota = teclado.nextFloat();
//
//        System.out.printf("A Nota do aluno %s foi %.1f", nome, nota);

//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Nome: ");
//        String nome = teclado.nextLine();
//
//        System.out.print("Nota: ");
//        float nota1 = teclado.nextFloat();
//
//        System.out.print("Nota: ");
//        float nota2 = teclado.nextFloat();
//
//        System.out.print("Nota: ");
//        float nota3 = teclado.nextFloat();
//
//        float media = ((nota1 + nota2 + nota3) / 3);
//
//        System.out.printf("A Media do aluno %s foi %.1f\n", nome, media);
//
//        if(media >= 7){
//            System.out.println("Passou");
//        }else{
//            System.out.println("Não foi dessa vez");
//        }

        JOptionPane.showMessageDialog(null, "Olá mundo");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        System.out.println(idade);

    }
}