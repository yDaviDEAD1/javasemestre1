package lista01.exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //SCANNER
        Scanner leia = new Scanner(System.in);
        int num1;
        int num2;
        int soma;

        System.out.println("Digite o primeiro numero ");
        num1 = leia.nextInt();


        System.out.println("Digite o segundo numero ");
        num2 = leia.nextInt();

        //SOMA DOS DOIS NÚMEROS
        soma = num1+num2;

        //RESULTADO DA SOMA
        System.out.println("O resultado da soma foi " + soma);



    }
}
