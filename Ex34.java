import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero decimal: ");
        int numeroDecimal = leia.nextInt();

        String binario = converterParaBinario(numeroDecimal);

        System.out.printf("O numero binario corresponde a: %s", binario);

        leia.close();
    }

    static String converterParaBinario(int numeroDecimal) {
        if (numeroDecimal == 0){
            return "0";
        }

        StringBuilder resultado = new StringBuilder();

        while (numeroDecimal > 0) {
            int resto = numeroDecimal % 2;
            resultado.insert(0, resto);
            numeroDecimal /= 2;
        }

        return resultado.toString();
    }
}
