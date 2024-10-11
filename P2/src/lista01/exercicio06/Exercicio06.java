package lista01.exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        int horaTrab;
        double valorHora;
        double calculoSalario;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o total das horas trabalhadas ");
        horaTrab = leia.nextInt();
        System.out.println("Digite o valor da hora trabalhada ");
        valorHora = leia.nextDouble();
        calculoSalario = horaTrab * valorHora;

        System.out.println("O valor do seu salario eh de: " + calculoSalario);
    }
}
