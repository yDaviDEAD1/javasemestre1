package lista01.exercicio08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        double baseXesque;
        double alturaXesque;
        double calculoXesque;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a base desejada ");
        baseXesque = leia.nextDouble();
        System.out.println("Digite a altura desejada ");
        alturaXesque = leia.nextDouble();
        calculoXesque = baseXesque * alturaXesque;

        System.out.println("O resultado eh: " + calculoXesque);
    }
}
