package lista01.exercicio18;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro numero ");
        num1 = leia.nextInt();
        System.out.println("Digite o segundo numero ");
        num2 = leia.nextInt();
        if (num1 % num2 == 0) {
            System.out.println("O primeiro numero eh multiplo do segundo");
        }
        else{
            System.out.println("O primeiro numero nao eh multiplo do segundo");
        }
    }
}
