import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = leia.nextLine();

        String fraseInvertida = inverterOrdemPalavras(frase);

        System.out.print("Frase invertida: ");
        System.out.print(fraseInvertida);

        leia.close();
    }

    static String inverterOrdemPalavras(String frase) {
        String[] palavras = frase.split("\\s+");

        StringBuilder fraseInvertida = new StringBuilder();

        for (int i = palavras.length - 1; i >= 0; i--) {
            fraseInvertida.append(palavras[i]).append(" ");
        }

        return fraseInvertida.toString().trim();
    }
}
