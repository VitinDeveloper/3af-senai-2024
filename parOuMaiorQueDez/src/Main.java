import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.print("Número: ");
        float numero = numeros.nextFloat();

        if(numero % 2 == 0 && numero > 10){

            System.out.print("O número é par e maior que 10.");
        }else{
            System.out.print("O número não é par ou não é maior que 10.");
        }

    }
}