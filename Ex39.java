package exerciciosLista50Java;

import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = leia.nextLine();

        int numeroPalavras = contarPalavras(frase);

        System.out.printf("O número de palavras na frase é: %d", numeroPalavras);
        
        leia.close();
    }
    

    static int contarPalavras(String frase) {
        if (frase == null || frase.isEmpty()){
            return 0;
        }

        String[] palavras = frase.split("\\s+");
        return palavras.length;
    }
}
