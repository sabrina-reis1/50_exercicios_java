public class Ex10 {
    public static void main(String[] args){
        int array[] = {2, 3, 42, 3, 2};
        int n = array.length;
        int x = 20;

        int resultado = pesquisaBinaria(array, 0, n - 1, x);

        if (resultado == - 1){
            System.out.println("Elemento nao esta presente no array.");
        } else {
            System.out.printf("Elemento encontrado no indice: %d", resultado);
        }

    }

    static int pesquisaBinaria(int array[], int left, int right, int x){
        if (right >= left){
            int mid = left + (right - left) / 2;

            if (array[mid] == x){
                return mid;
            }

            if (array[mid] > x){
                return pesquisaBinaria(array, left, mid - 1, x);
            }

            return pesquisaBinaria(array, mid + 1, right, x);
        }

        return - 1;
    }
}
