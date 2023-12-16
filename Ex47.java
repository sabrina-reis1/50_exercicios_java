import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex47 {
    public static void main(String[] args) {
        Integer[] array = {1, 1, 2, 3, 44, 44, 3};

        Set<Integer> conjunto = new LinkedHashSet<>(Arrays.asList(array));
        Integer[] semDuplicados = conjunto.toArray(new Integer[0]);

        System.out.printf("Array original: %s%n", Arrays.toString(array));
        System.out.printf("Array sem duplicados: %s",  Arrays.toString(semDuplicados));

    }
}
