package exerciciosLista50Java;

import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanhoArray = leia.nextInt();

        int[] arr = new int[tamanhoArray];

        System.out.print("Digite os números: ");

        for (int i = 0; i < tamanhoArray; i++){
            arr[i] = leia.nextInt();
        }

        int segundoMaior = segundoMaior(arr);

        if (segundoMaior != Integer.MIN_VALUE) {
            System.out.printf("O segundo maior número é: %d", segundoMaior);
        } else {
            System.out.println("Não tem um segundo maior número.");
        }
        
        leia.close();
    }

    static int segundoMaior(int[] arr) {
        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maior){
                segundoMaior = maior;
                maior = arr[i];
            } else if (arr[i] > segundoMaior && arr[i] != maior) {
                segundoMaior = arr[i];
            }
        }

        return segundoMaior;
    }
}
