import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int tamanho = leia.nextInt();

        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < array.length; i++){
            System.out.printf("Elemento: %d: ", (i + 1));
            array[i] = leia.nextInt();
        }

        calcularQuadrado(array);

        System.out.println("Array com quadrados dos elementos:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + " ");
        }

        leia.close();
    }

    static void calcularQuadrado(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] * array[i];
        }
    }
}
