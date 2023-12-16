import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Frase: ");
        String frase = leia.nextLine();
        String fraseReversa = new StringBuilder(frase).reverse().toString();

        System.out.println(fraseReversa);
        
        leia.close();
    }
}
