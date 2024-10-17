package lista01.exercicio19;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        double valorProd;
        double valorDesc;
        double valorPerc;
        double calcDesc;
        double valorFinal;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        valorProd = leia.nextDouble();
        System.out.println("Digite o percentual de desconto ");
        valorDesc = leia.nextDouble();
        valorDesc = valorDesc / 100;
        calcDesc = valorProd * valorDesc;
        valorFinal = valorProd - calcDesc  ;
        System.out.println("O valor do produto com o desconto eh " + valorFinal);

    }
}
