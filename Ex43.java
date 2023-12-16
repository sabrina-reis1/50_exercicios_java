import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = leia.nextInt();

        if (ehQuadradoPerfeito(numero)) {
            System.out.printf("O %d é um quadrado perfeito.", numero);
        } else {
            System.out.printf("O %d nao é um quadrado perfeito.", numero);
        }
        
        leia.close();
    }

    static boolean ehQuadradoPerfeito(int numero){
        if (numero < 0){
            return false;
        }

        int raizQuadrada = (int) Math.sqrt(numero);
        return raizQuadrada * raizQuadrada == numero;
    }
}
