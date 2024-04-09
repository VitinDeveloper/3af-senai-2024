import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner triangulos = new Scanner(System.in);
        System.out.print("Digite o comprimento do primeiro lado: ");
        float triangulo1 = triangulos.nextFloat();
        System.out.print("Digite o comprimento do segundo lado: ");
        float triangulo2 = triangulos.nextFloat();
        System.out.print("Digite o comprimento do terceiro lado: ");
        float triangulo3 = triangulos.nextFloat();

        if(triangulo1 == triangulo2 && triangulo2 == triangulo3){
            System.out.print("O triângulo é equilátero.");
        }else if(triangulo1 != triangulo2 && triangulo2 != triangulo3 && triangulo1 != triangulo3){
            System.out.print("O triângulo é escaleno.");
        }else{
            System.out.print("O triângulo é isósceles.");
        }
    }
}