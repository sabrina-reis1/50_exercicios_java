import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        float numUm = leia.nextFloat();

        System.out.print("Digite o segundo numero: ");
        float numDois = leia.nextFloat();

        float MMC = calcularMMC(numUm, numDois);

        System.out.printf("O MMC de %.2f e %.2f é: %.2f", numUm, numDois, MMC);

        leia.close();
    }

    static float calcularMMC(float a, float b) {
        float mdc = calcularMDC(a, b);
        
        if (mdc != 0) {
            return Math.abs(a * b) / mdc;
        } else {
            return 0;
        }
    }

    static float calcularMDC(float a, float b) {
        while (b != 0) {
            float temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
