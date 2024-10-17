package lista01.exercicio14;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        int numUser;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        numUser = leia.nextInt();
        if(numUser < 0 ){
            System.out.println("Esse numero eh negativo");
        } else if(numUser > 0){
            System.out.println("Esse numero eh positivo");
        } else {
            System.out.println("Esse eh igual a zero");
        }

    }
}
