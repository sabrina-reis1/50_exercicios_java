import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o comprimento do primeiro cateto em cm: ");
        double cateto1 = leia.nextDouble();

        System.out.print("Digite o comprimento do segundo cateto em cm: ");
        double cateto2 = leia.nextDouble();

        double hipotenusa = calcularHipotenusa(cateto1, cateto2);

        System.out.printf("A hipotenusa do triangulo retangulo é: %.2f cm", hipotenusa);
        
        leia.close();
    }

    static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }
}
