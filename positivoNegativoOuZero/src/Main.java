import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.print("Número: ");
        float numero = numeros.nextFloat();

        if(numero > 0){
            System.out.print("Positivo");
        }else if(numero < 0){
            System.out.print("Negativo");
        }else{
            System.out.print("Zero");
        }

    }
}