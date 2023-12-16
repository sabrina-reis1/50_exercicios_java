import java.util.Arrays;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = leia.nextLine();
        System.out.print("Digite a segunda palavra: ");
        String palavra2 = leia.nextLine();

        boolean saoAnagramas = verificarAnagrama(palavra1, palavra2);

        if (saoAnagramas) {
            System.out.printf("%s e %s sao anagramas", palavra1, palavra2);
        } else {
            System.out.printf("%s e %s nao sao anagramas", palavra1, palavra2);
        }

        leia.close();
    }

    static boolean verificarAnagrama(String palavra1, String palavra2) {

        palavra1 = palavra1.replaceAll("\\s", "").toLowerCase();
        palavra2 = palavra2.replaceAll("\\s", "").toLowerCase();

        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        char[] arr1 = palavra1.toCharArray();
        char[] arr2 = palavra2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
