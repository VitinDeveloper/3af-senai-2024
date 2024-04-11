import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner alunos = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        float nota = alunos.nextFloat();
        System.out.print("Digite a frequência do aluno (%): ");
        float frequencia = alunos.nextFloat();

        if(nota >= 7 && frequencia > 75){
            System.out.print("Aluno aprovado");
        }else{
            System.out.print("Aluno reprovado");
        }

    }
}