import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String quantidadeSalariosStr = JOptionPane.showInputDialog(null, "Quantos salários serão digitados?");
        int quantidadeSalarios = Integer.parseInt(quantidadeSalariosStr);

        double[] salarios = new double[quantidadeSalarios];

        for (int i = 0; i < quantidadeSalarios; i++) {
            String salarioStr = JOptionPane.showInputDialog(null, "Digite o" + (i + 1) + "º salário: ");
            salarios[i] = Double.parseDouble(salarioStr);
        }

        double maiorSalario = salarios[0];
        for (double salario : salarios) {
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
        }

        System.out.println("Maior salário: R$" + maiorSalario);

        for (int i = 0; i < quantidadeSalarios; i++) {
            if (salarios[i] < 2500) {
                salarios[i] *= 1.1; // Aumento de 10%
            }
        }

        double totalAntigo = 0;
        for (double salario : salarios) {
            totalAntigo += salario;
        }
        System.out.println("Total da folha de pagamento antiga: R$" + totalAntigo);

        double totalCorrigido = 0;
        for (double salario : salarios) {
            totalCorrigido += salario;
        }
        System.out.println("Total da folha de pagamento corrigida: R$" + totalCorrigido);

        scanner.close();

    }
}