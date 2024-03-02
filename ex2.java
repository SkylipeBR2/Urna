import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] temp = new int[1][30];
        int soma = 0;
        float media = 0;

        for (int l = 0; l < 1; l++){
            for (int c = 0; c < 30; c++){
                System.out.printf("Digite a temperatura do dia[%d]: ", c);
                temp[l][c] = input.nextInt();
            }
        }

        for (int l = 0; l < 1; l++){
            for (int c = 0; c < 30; c++){
                soma += temp[l][c];
            }
        }
        media = soma/30;
        System.out.println("A média é " + media);
    }
}
