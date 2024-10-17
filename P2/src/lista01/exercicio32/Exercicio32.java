package lista01.exercicio32;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {

        int[] vetor = new int[15];
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor");
        vetor[0] = leia.nextInt();


        int maiorValor = vetor[0];
        int menorValor = vetor[0];


        for (int i = 1; i < 15; i++) {
            System.out.println("Digite um valor: ");
            vetor[i] = leia.nextInt();
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];


            }
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];

            }

        }
        System.out.println(maiorValor);
        System.out.println(menorValor);
    }

}
