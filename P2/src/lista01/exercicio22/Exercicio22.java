package lista01.exercicio22;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        int numN;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero desejado ");
        numN = sc.nextInt();
        for (int i = 1; i <= numN; i++) {
            System.out.println(i);
        }
    }
}
