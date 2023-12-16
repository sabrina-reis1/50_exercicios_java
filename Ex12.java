public class Ex12 {
    public static void main(String[] args) {

        int[] arr = {1, 10, 333};

        int menorElemento = menorNumero(arr);

        System.out.printf("O menor numero é: %d", menorElemento);

    }

    static int menorNumero(int[] arr){

        if (arr.length == 0){
            System.out.println("O array está vazio.");
            return Integer.MIN_VALUE;
        }

        int menorNumero = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < menorNumero){
                menorNumero = arr[i];
            }
        }

        return menorNumero;
    }
}
