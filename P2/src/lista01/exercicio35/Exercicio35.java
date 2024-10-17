package lista01.exercicio35;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        int [] vetor1 = new int [5];
        int [] vetor2 = new int [5];
        int [] vetor3 = new int [5];
        Scanner leia = new Scanner(System.in);

        for(int i = 0; i < vetor1.length; i++){
            System.out.println("Digite um valor para o primeiro vetor: ");
            vetor1[i] = leia.nextInt();

        }
        for(int i = 0; i < vetor2.length; i++){
            System.out.println("Digite um valor para o segundo vetor: ");
            vetor2[i] = leia.nextInt();
        }
        for(int i = 0; i < vetor3.length; i++){
            vetor3[i] = vetor1[i] * vetor2[i];

            System.out.println("Resultado: \n" + vetor3[i]);
        }





    }
}
