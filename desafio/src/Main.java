import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int numero, maior = -1;
        for(int i=0; i<10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º número: "));
            if(numero > maior ){
                maior = numero;
            }
        }
        System.out.println("O Maior número é: " + maior);
    }
}