import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.printf("Digite um numero para calcular o vetorial: ");
        int numeroFatorial = leia.nextInt();

        int resultado = calculandoVetorial(numeroFatorial);
        System.out.printf("O fatorial de %d é: %d", numeroFatorial, resultado);
        leia.close();

    }

    static int calculandoVetorial(int x){
        if(x == 0 || x == 1){
            return 1;
        } else {
            return x * calculandoVetorial(x - 1);
        }
    }
}
