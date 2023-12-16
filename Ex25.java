import java.util.Scanner;

public class Ex25 {
	   public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);
	        int[] array = {2, 3, 22, 21, 2;

	        System.out.print("Digite o valor a ser pesquisado: ");
	        int valor = leia.nextInt();

	        int posicao = pesquisaLinear(array, valor);

	        if (posicao != - 1){
	            System.out.printf("O valor '%d' foi encontrado na posicao %d", valor, posicao);
	        } else {
	            System.out.printf("O valor '%d' nao foi encontrado", valor);
	        }

	        leia.close();
	    }

	    static int pesquisaLinear(int[] arr, int valor){
	        for (int i = 0; i < arr.length; i++){
	            if (arr[i] == valor){
	                return i;
	            }
	        }
	        return - 1;
	    }
}
