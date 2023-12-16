import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = leia.nextLine();

        System.out.print("Digite a palavra a ser contada: ");
        String palavra = leia.next();

        float numeroOcorrencias = contarOcorrencias(frase, palavra);

        System.out.printf("A palavra '%s' aparece %.2f vezes.", palavra, numeroOcorrencias);

        leia.close();
    }

    static float contarOcorrencias(String frase, String palavra) {

        String[] palavras = frase.split("\\s+");

        float contador = 0;

        for (String p : palavras) {
            p = p.replaceAll("[^a-zA-Z]", "");

            if (p.equalsIgnoreCase(palavra)) {
                contador++;
            }
        }

        return contador;
    }
}
