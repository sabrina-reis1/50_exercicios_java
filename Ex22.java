import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor inicial do intervalo: ");
        int inicio = leia.nextInt();

        System.out.print("Digite o valor final do intervalo: ");
        int fim = leia.nextInt();

        System.out.printf("Numeros primos no intervalo de %d até %d: ", inicio, fim);
        numPrimosIntervalo(inicio, fim);

        leia.close();
    }

    static boolean isPrimo(int numero){
        if (numero <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }

    static void numPrimosIntervalo(int inicio, int fim){
        for (int i = inicio; i <= fim; i++){
            if (isPrimo(i)){
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}
