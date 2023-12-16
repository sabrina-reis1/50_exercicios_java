import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o numero de linhas da matriz: ");
        int linhas = leia.nextInt();

        System.out.print("Digite o numero de colunas da matriz: ");
        int colunas = leia.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.print("Digite os elementos da matriz: ");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = leia.nextInt();
            }
        }

        if (mostrarMatrizEsparsa(matriz)) {
            System.out.print("A matriz é esparsa.");
        } else {
            System.out.print("A matriz nao é esparsa.");
        }
        
        leia.close();
    }

    public static boolean mostrarMatrizEsparsa(int[][] matriz) {
        int total = matriz.length * matriz[0].length;
        int naoZero = 0;

        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento != 0) {
                    naoZero++;
                }
            }
        }

        double percentoNaoZero = (double) naoZero / total;
        return percentoNaoZero < 0.5;
    }
}
