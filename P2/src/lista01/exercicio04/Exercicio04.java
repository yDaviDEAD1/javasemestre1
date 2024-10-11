package lista01.exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double raio;
        double calculoArea;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o raio do circulo ");
        raio = leia.nextDouble();

        calculoArea = Math.PI*raio*raio;
        System.out.println("A área do circulo eh " + calculoArea);
    }
}
