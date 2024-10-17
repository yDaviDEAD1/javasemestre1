package lista01.exercicio26;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        int numeroN;
        int numeroP= 0;
        int numeroU= 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero para o intervalo ");
        numeroN = entrada.nextInt();


        for (int i = 1; i <=numeroN; i++ ){
            System.out.println(numeroP + " ");

            int proximo = numeroP + numeroU;
            numeroP = numeroU;
            numeroU = proximo;
        }
    }

}
