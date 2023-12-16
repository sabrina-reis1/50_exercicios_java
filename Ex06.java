public class Ex06 {
    public static void main(String[] args) {
        int[] array = {1, 2, 110, 241};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int num : array){
            System.out.printf("%d ", num);
        }
    }
}
