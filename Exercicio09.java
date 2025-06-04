package lista14;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < 3; j++) {
            int temp = matriz[0][j];
            matriz[0][j] = matriz[2][j];
            matriz[2][j] = temp;
        }

        System.out.println("Matriz após troca:");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
