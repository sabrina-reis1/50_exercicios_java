import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex50 {
    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>(Arrays.asList(10, 9, 8));

        List<Set<Integer>> subconjuntos = gerarSubconjuntos(conjunto);
        for (Set<Integer> subconjunto : subconjuntos) {
            System.out.printf("%s%n", subconjunto);
        }
    }

    public static List<Set<Integer>> gerarSubconjuntos(Set<Integer> conjunto) {
        List<Set<Integer>> subconjuntos = new ArrayList<>();
        subconjuntos.add(new HashSet<>());

        for (int elemento : conjunto) {
            List<Set<Integer>> novosSubconjuntos = new ArrayList<>();
            for (Set<Integer> subconjunto : subconjuntos) {
                Set<Integer> novo = new HashSet<>(subconjunto);
                novo.add(elemento);
                novosSubconjuntos.add(novo);
            }
            subconjuntos.addAll(novosSubconjuntos);
        }

        return subconjuntos;
    }
}
