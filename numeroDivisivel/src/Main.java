import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float numero = numeros.nextFloat();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.print("O número é divisível por 3 e por 5.");
        } else {
            System.out.print("O número não é divisível por 3 e por 5 simultaneamente.");
        }

    }
}