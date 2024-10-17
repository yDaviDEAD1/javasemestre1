package lista01.exercicio29;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        int numPerfeito;
        int soma = 0;
        boolean valida = true;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número para verificarmos se ele eh perfeito ");
        numPerfeito = leia.nextInt();
        for (int i = 1; i <= numPerfeito; i++) {
            if (numPerfeito % i == 0) {
                soma += i;
            }
    }
        if (soma == numPerfeito) {
            System.out.println("eh perfeito");
        } else {
            System.out.println("nao eh perfeito");
        }
    }
}
