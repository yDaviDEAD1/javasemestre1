import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        int numBase;
        int numExpo;
        int resultado = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base: ");
        numBase = sc.nextInt();
        System.out.print("Digite o expoente: ");
        numExpo = sc.nextInt();

        if (numExpo == 0) {
            resultado = 1;
        } else {
            for (int i = 1; i <= numExpo; i++) {
                resultado *= numBase;
            }
        }

        // Exibe o resultado
        System.out.println("Resultado: " + resultado);
    }
}
