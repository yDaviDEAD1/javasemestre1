package lista01.exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        double horaXesquedele;
        double convMinuto;
        double convSegundo;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a hora para a conversão ");
        horaXesquedele = leia.nextDouble();

        convMinuto = horaXesquedele * 60;
        convSegundo = horaXesquedele * 3600;

        System.out.println("O equivalemente em minutos é: " + convMinuto);
        System.out.println("O equivalente em segundos é: " + convSegundo);

    }
}
