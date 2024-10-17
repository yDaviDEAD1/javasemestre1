package lista01.exercicio11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        int num1;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número ");
        num1 = leia.nextInt();
        if(num1 %2 == 0){
            System.out.println("Ele eh par");
        }
        else {
            System.out.println("Ele eh impar");
        }
    }
}
