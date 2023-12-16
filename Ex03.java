import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um n�mero: ");
        int n = leia.nextInt();

        int contadorD = 0;

        for(int a = 1; a <= n; a++) {
            if(n % a == 0) {
                contadorD++;
            }
        }

        if(contadorD == 2){
            System.out.println("é numero primo");
        }else{
            System.out.println("Nao é numero primo");
        }
        
        leia.close();
    }
}
