public class Ex49 {
    public static void main(String[] args) {
        int[] array = {2, 3, 42, 3, 2};
        int tamanhoIntervalo = 2;

        for (int i = 0; i <= array.length - tamanhoIntervalo; i++) {
            int soma = 0;
            for (int j = i; j < i + tamanhoIntervalo; j++) {
                soma += array[j];
            }
            double media = (double) soma / tamanhoIntervalo;
            System.out.printf("Media movel do intervalo %d - %d: %.2f%n", (i + 1), (i + tamanhoIntervalo), media);
        }
    }
}
