import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero para calcular a raiz quadrada: ");

        while (!leia.hasNextDouble()){
            System.out.println("Por favor, digite um número válido.");
            leia.next();
        }

        double numero = leia.nextDouble();

        double raizQuadrada = calcularRaiz(numero);

        System.out.printf("A raiz quadrada de %.2f é: %.2f", numero, raizQuadrada);

        leia.close();
    }

    static double calcularRaiz(double numero) {
        return Math.sqrt(numero);
    }
}
