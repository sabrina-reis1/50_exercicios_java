import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o raio do circulo: ");
        while (!leia.hasNextDouble()){
            System.out.println("Digite um valor de um numero vslido.");
            leia.next();
        }

        double raio = leia.nextDouble();

        double area = calcularAreaCirculo(raio);

        System.out.printf("A area do circulo com raio %.2f é: %.2f", raio, area);

        leia.close();
    }

    static double calcularAreaCirculo(double raio){
        return Math.PI * Math.pow(raio, 2);
    }
}
