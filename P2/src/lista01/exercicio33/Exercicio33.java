package lista01.exercicio33;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int [20];
        int soma = 0;
        int media;


        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = entrada.nextInt();
            soma += numeros[i];
        }
        media = soma / numeros.length;

        System.out.println("A media eh " + media);
    }
}
