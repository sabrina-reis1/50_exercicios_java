import java.util.Random;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Random random = new Random();

        int numeroAleatorio = random.nextInt(20) + 1;

        Scanner leia = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo da adivinhacao");
        System.out.println("Tente adivinhar o numero entre 1 e 20.");

        int tentativas = 0;
        boolean acertou = false;

        while (!acertou){
            System.out.print("Digite sua tentativa: ");
            int tentativa = leia.nextInt();
            tentativas++;

            if(tentativa == numeroAleatorio){
                acertou = true;
            } else if (tentativa < numeroAleatorio) {
                System.out.println("Tente um numero maior.");
            } else {
                System.out.println("Tente um numero menor.");
            }
        }

        System.out.printf("Parabens! Voce acertou em %d tentavias", tentativas);

        leia.close();
    }
}
