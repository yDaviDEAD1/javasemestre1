package lista01.exercicio15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        int lado1;
        int lado2;
        int lado3;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triangulo: ");
        lado1 = leia.nextInt();
        System.out.println("Digite o segundo lado do triangulo: ");
        lado2 = leia.nextInt();
        System.out.println("Digite o terceiro lado do triangulo: ");
        lado3 = leia.nextInt();

        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("O triangulo eh equilatero");
        } else if(lado1 != lado2 && lado2 != lado3){
            System.out.println("O triangulo eh escaleno");
        } else{
            System.out.println("O triangulo eh isosceles ");
        }
    }
}
