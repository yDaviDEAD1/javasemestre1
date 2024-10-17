package lista01.exercicio20;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        int idade;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();

        if(idade >= 16){
            System.out.println("Voce esta apta a votar");
        } else{
            System.out.println("Voce nao esta apta a votar");
        }
    }
}
