package exerciciosLista50Java;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Quantas notas voc� deseja inserir? ");
        float quantidadeNotas = leia.nextFloat();

        double somaNotas = 0;
        double somaPesos = 0;

        for (float i = 1; i <= quantidadeNotas; i++) {
            System.out.printf("Digite a nota %.2f: ", i);
            double nota = leia.nextDouble();

            System.out.printf("Digite o peso da nota %.2f: ", i);
            double peso = leia.nextDouble();

            somaNotas += nota * peso;
            somaPesos += peso;
        }

        if (somaPesos > 0) {
            double mediaPonderada = somaNotas / somaPesos;
            System.out.printf("A m�dia ponderada �: %.2f", mediaPonderada);
        } else {
            System.out.print("N�o foi poss�vel calcular a m�dia ponderada.");
        }
        
        leia.close();
    }
}
