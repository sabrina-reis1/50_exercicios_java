import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um frase: ");
        String frase = leia.nextLine();

        int caracteres = contarCaracter(frase);

        System.out.printf("O numero de caracteres na frase é de: %d", caracteres);

        leia.close();
    }

    static int contarCaracter(String frase) {
        return frase.length();
    }
}
