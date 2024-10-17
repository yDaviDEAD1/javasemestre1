package lista01.exercicio36;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];
        int soma = 0;
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++){
                System.out.println("Digite o numero desejado ");
                matriz[i][j] = entrada.nextInt();
                soma += matriz[i][j];
            }
        }

        System.out.println("A soma eh " + soma);


    }
}
