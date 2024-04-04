import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner anos = new Scanner(System.in);
        System.out.print("Ano: ");
        float ano = anos.nextFloat();

        if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            System.out.print("O Ano é bissexto");
        }else{
            System.out.print("O ano não é bissexto");
        }

    }
}