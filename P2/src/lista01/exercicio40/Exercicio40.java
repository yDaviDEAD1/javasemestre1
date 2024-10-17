package lista01.exercicio40;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        int vetor [] = new int[10];
        int temp;
        Scanner leia = new Scanner(System.in);

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um valor: ");
            vetor[i] = leia.nextInt();

        }

        for(int i = 0; i < vetor.length / 2; i++){
            temp = vetor[i];
            vetor[i] = vetor[vetor.length - i - 1];
            vetor[vetor.length - i - 1] = temp;
        }

        System.out.println("\nVetor apos a troca:");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");

        }
        System.out.println();
    }
}
