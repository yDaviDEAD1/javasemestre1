package lista01.exercicio39;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        int matriz1 [][] = new int [2][2];
        int matriz2 [][] = new int [2][2];
        int matriz3 [][] = new int [2][2];
        Scanner leia = new Scanner(System.in);
        //Primeira matriz
        System.out.println("Digite os valores da primeira matriz");
        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j <matriz1[0].length; j++){
                matriz1[i][j] = leia.nextInt();
            }
        }
        //Segunda matriz
        System.out.println("Digite os valores da segunda matriz");
        for (int i = 0; i <matriz2.length; i++){
            for (int j = 0; j <matriz2[0].length; j++){
                matriz2[i][j] = leia.nextInt();
            }
        }
        //Multiplacaçao da matriz
        for (int i = 0; i < matriz3.length; i++){
            for (int j = 0; j < matriz3.length; j++){
                int resultado = 0;
                matriz3[i][j] = matriz1[i][j] * matriz2[i][j];
                resultado = matriz3[i][j];

                System.out.println("Resultado " + resultado);
            }

        }


    }
}
