package lista01.exercicio16;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        int ano;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o ano que queira saber se eh ou nao bissexto ");
        ano = leia.nextInt();

        if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("O ano eh bissexto");
        }
        else{
            System.out.println("O ano nao eh bissexto");
        }
    }
}
