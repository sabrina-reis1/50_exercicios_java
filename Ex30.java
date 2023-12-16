import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = leia.nextLine();

        String tirandoEspacos = removerEspacos(frase);

        System.out.println("Frase sem espacos: " + tirandoEspacos);

        leia.close();
    }

    static String removerEspacos(String frase){
        return frase.replaceAll("\\s", "");
    }
}
