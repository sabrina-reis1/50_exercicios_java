public class Ex48 {
    public static void main(String[] args) {
        String texto = "12";

        try {
            int numero = Integer.parseInt(texto);
            System.out.printf("O %s é um numero inteiro.", texto);
        } catch (NumberFormatException e) {
            System.out.printf("O %s nao é um numero inteiro.", texto);
        }
    }
}
