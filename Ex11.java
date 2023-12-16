import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Temperatura em Celsius: ");

        double temperaturaCelsius = leia.nextDouble();

        double temperaturaFahrenheint = (temperaturaCelsius * 9 / 5) + 32;

        System.out.printf("A temperatura em Fahrenheint é: %.2fF", temperaturaFahrenheint);

        leia.close();
    }
}
