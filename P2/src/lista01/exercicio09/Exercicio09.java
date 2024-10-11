package lista01.exercicio09;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int quociente;
        int restoDiv;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro número ");
        numero1 = leia.nextInt();

        System.out.println("Digite o segundo número ");
        numero2 = leia.nextInt();

        quociente = numero1 / numero2;
        restoDiv = numero1 % numero2;
        System.out.println("O quociente eh " + quociente);
        System.out.println("O resto eh " + restoDiv);;
    }
}
