package lista01.exercicio23;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        int numInput;
        int f = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero fatorial desejado ");
        numInput = sc.nextInt();
        for(int i = 1; i<=numInput; i++){
            f *= i;
            System.out.println(f);
        }
    }
}
