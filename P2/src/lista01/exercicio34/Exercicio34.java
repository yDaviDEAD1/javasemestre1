package lista01.exercicio34;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        int [] numeros = new int[30];
        int par = 0;
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i]= leia.nextInt();
            if(numeros[i] % 2 == 0){
                par++;
            }
        }
        System.out.println("Total de numeros pares " + par);
    }
}
