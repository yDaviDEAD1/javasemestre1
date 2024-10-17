package lista01.exercicio38;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        int [][] matriz = new int [4][4];
        int somaDiag = 0;
        Scanner leia = new Scanner(System.in);

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.println("Digite os numeros desejados ");
                matriz[i][j] = leia.nextInt();

            }
        }

        for(int i = 0; i < matriz.length; i++){
            somaDiag += matriz[i][i];
        }

        System.out.println("Ah soma da diagonal eh " + somaDiag);

    }
}
