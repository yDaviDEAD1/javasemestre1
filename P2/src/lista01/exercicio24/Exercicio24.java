package lista01.exercicio24;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        int numero;
        boolean valida = true;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        for (int i = 2; i < numero; i++){
            if(numero % i == 0){
                valida = false;
            }
        }
        if(valida == false){
            System.out.println("nao eh primo");
        }else{
            System.out.println("eh primo");
        }
    }
}
