package lista01.exercicio31;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
       int [] numeros = new int[10];
       int resultado = 0;
       boolean valida = true;
       Scanner sc = new Scanner(System.in);

       for (int i = 0; i < numeros.length; i++) {
           System.out.println("Digite o número desejado");
           numeros[i] = sc.nextInt();

           resultado += numeros[i];
       }
        System.out.println(resultado);

    }
}
