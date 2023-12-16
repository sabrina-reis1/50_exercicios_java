import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = leia.nextDouble();

        double volume = calcularVolume(raio);

        System.out.printf("O volume da esfera no valor de: %.2f", volume);

        leia.close();
    }

    static double calcularVolume(double raio) {
        double pi = Math.PI;
        return (4.0 / 3.0) * pi * Math.pow(raio, 3);
    }
}
