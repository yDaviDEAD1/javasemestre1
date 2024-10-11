package lista01.exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        int idade;
        double convertDias;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        idade = leia.nextInt();
        convertDias = idade * 365.25;

        System.out.println("A sua idade em dias eh: " + convertDias);
    }
}
