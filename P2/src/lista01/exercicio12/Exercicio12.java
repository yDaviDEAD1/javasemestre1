package lista01.exercicio12;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner leia = new Scanner (System.in);

        System.out.println("Digite o primeiro número ");
        num1 = leia.nextInt();
        System.out.println("Digite o segundo número ");
        num2 = leia.nextInt();

        if (num1 > num2){
            System.out.println("O numero maior eh o " + num1);
        }
        else{
            System.out.println("O numero maior eh o " + num2);
        }
    }
}
