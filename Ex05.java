public class Ex05 {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};

        int maior = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] > maior){
                maior = array[i];
            }
        }

        System.out.printf("O maior elemento do array: %d", maior);
    }
}
