package lista01.exercicio17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro numero ");
        num1 = leia.nextInt();
        System.out.println("Digite o segundo numero ");
        num2 = leia.nextInt();
        System.out.println("Digite o terceiro numero ");
        num3 = leia.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println(+ num1 +" eh o maior numero");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println( num2 +" eh o maior numero");
        }
        else if(num3 > num1 && num3 > num2){
            System.out.println( num3 +" eh o maior numero");
        }
        else{
            System.out.println("Os numero sao iguais");
        }
    }
}
