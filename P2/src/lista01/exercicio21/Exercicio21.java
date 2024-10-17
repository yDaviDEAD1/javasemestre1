package lista01.exercicio21;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        int tabuada;
        int num;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o numero desejado para saber a tabuada: ");
        num = leia.nextInt();

        for (int i = 0; i<=10; i++){
            System.out.println(num * i);
        }
    }
}
