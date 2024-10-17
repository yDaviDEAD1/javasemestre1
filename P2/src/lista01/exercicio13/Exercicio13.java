package lista01.exercicio13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        double altura;
        double peso;
        double IMC;
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite a sua altura ");
        altura = leia.nextDouble();
        System.out.println("Digite o seu peso ");
        peso = leia.nextDouble();
        IMC = peso/(altura*altura);
        if(IMC >= 18.5 && IMC <= 24.90){
            System.out.println("Você esta com o peso normal");

        }else if (IMC < 18.5){
            System.out.println("Voce esta abaixo do peso");
        } else{
            System.out.println("Voce esta acima do peso");
        }

    }
}
