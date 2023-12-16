public class Ex09 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4};
        double media = CalculandoMedia(array);
        System.out.printf("A media dos numeros no array é: %.2f", media);
    }

    static double CalculandoMedia(int[] array){
        int soma = 0;
        for (int num : array){
            soma += num;
        }
        return (double) soma / array.length;
    }
}
