package lista01.exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        float tempC;
        float tempF;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celcius ");
        tempC = leia.nextFloat();
        tempF = (tempC * 9/5) + 32;

        System.out.println("A temperatura convertida é: " + tempF);

    }

}
