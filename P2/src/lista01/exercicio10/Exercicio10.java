package lista01.exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        double valorDolar;
        double taxaCambio;
        double valorReal;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor desejado em dolar para ser convertida ");
        valorDolar = leia.nextDouble();
        System.out.println("Digite o valor da taxa de cambio ");
        taxaCambio = leia.nextDouble();
        valorReal = valorDolar * taxaCambio;

        System.out.println("O valor convertida em reais eh de R$ " + valorReal);

    }
}
