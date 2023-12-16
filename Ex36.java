package exerciciosLista50Java;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = leia.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = leia.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.print("Digite os elementos da matriz:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = leia.nextInt();
            }
        }

        if (verificaMatrizDiagonal(matriz)) {
            System.out.print("A matriz é diagonal.");
        } else {
            System.out.print("A matriz não é diagonal.");
        }
        
        leia.close();
    }

    public static boolean verificaMatrizDiagonal(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
