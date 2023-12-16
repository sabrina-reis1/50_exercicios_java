package exerciciosLista50Java;

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = leia.nextInt();

        if (AnoBissexto(ano)) {
            System.out.printf("O %d é um ano bissexto.", ano);
        } else {
            System.out.printf("O %d não é um ano bissexto.", ano);
        }
        
        leia.close();
    }

    static boolean AnoBissexto(int ano) {
        boolean bissexto = false;

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    bissexto = true;
                }
            } else {
                bissexto = true;
            }
        }

        return bissexto;
    }
}
