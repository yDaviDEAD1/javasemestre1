package lista01.exercicio27;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        int numeroUser;
        int somaPar = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número para o intervalo ");
        numeroUser = entrada.nextInt();

        for(int i = 1; i<= numeroUser; i++){
            if (i % 2 == 0){
               somaPar += i;

            }
        }
        System.out.println(somaPar);
    }
}
