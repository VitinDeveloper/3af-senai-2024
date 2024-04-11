import javax.swing.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

//        String nome, nomeUsuario;
//        nome = JOptionPane.showInputDialog("Nome: ");
//        nomeUsuario = JOptionPane.showInputDialog("nomeUsuario: ");
//        if(nome.equals(nomeUsuario)){
//            System.out.println("Iguais");
//        }else{
//            System.out.println("Diferentes");
//        }

//  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//        int[] idades = new int[5];
//
//        for(int i=0; i<5; i++){
//            idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a " + (i+1) + "a idade:"));
//        }
//
//        String texto = "";
//        for(int idade : idades){
////            texto += "Idade: " + idade + ";\n";
//            System.out.print("Idade: " + idade + ";\n");
//        }
////        JOptionPane.showMessageDialog(null, texto);
////        System.out.println(texto);

//  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//        String[] mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
//        int[] fim = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//        for(int i=0; i<mes.length; i++){
//            System.out.println("O mês de " + mes[i] + " tem " + fim[i] + " dias");
//        }

//  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//        int[] idades = {14,12,25,44,11,8};
//        Arrays.sort(idades);
//        for (int n : idades){
//            System.out.print(n + " ");
//        }
//        System.out.println("");
//        int i = Integer.parseInt(JOptionPane.showInputDialog("n:"));
//        int pos = Arrays.binarySearch(idades,i);
//        System.out.println("Valor na encontrado na posição: "+pos);

//  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        ArrayList<String> dinos = new ArrayList<String>();

        dinos.add("Angaturama");
        dinos.add("Uberabatitan");
        dinos.add("Irritator");
        dinos.add("Oxalaia Quilombensis");

        System.out.println("Arraylist original: " + dinos);

        String dino = dinos.get(1);
        System.out.println("Dino selecionado: " + dino);

        dinos.set(1, "Santanarraptor");
        System.out.println("Modificado: " + dinos);

        dinos.remove(2);
        System.out.println("Removeu o 2: " + dinos);

        int tamanho = dinos.size();
        System.out.println("Tamanho: " + tamanho);

        System.out.println("--= Percorrendo com for =--");
        for (int i= 0; i<dinos.size(); i++){
            System.out.println("Dino: " + dinos.get(i));
        }

        System.out.println("--= Percorrendo com 'forEach' =--");
        for (String d : dinos){
            System.out.println("Dino: " + d);
        }

        Collections.sort(dinos);
        System.out.println("Organizado: " + dinos);

        int indice = dinos.indexOf("Santanarraptor");
        System.out.println("indexOf: " + indice);

    }
}