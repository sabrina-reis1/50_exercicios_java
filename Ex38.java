package exerciciosLista50Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Quantos números você deseja inserir? ");
        int quantidadeNumeros = leia.nextInt();

        List<Integer> numeros = new ArrayList<>();

        System.out.print("Digite os números: ");

        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros.add(leia.nextInt());
        }

        int moda = encontrarModa(numeros);

        if (moda != Integer.MIN_VALUE) {
            System.out.printf("A moda dos números é: %d", moda);
        } else {
            System.out.print("Não há moda. Todos os números tem a mesma frequência.");
        }
        
        leia.close();
    }

    public static int encontrarModa(List<Integer> numeros) {
        Map<Integer, Integer> frequencia = new HashMap<>();

        for (int numero : numeros) {
            frequencia.put(numero, frequencia.getOrDefault(numero, 0) + 1);
        }

        int moda = Integer.MIN_VALUE;
        int maxFrequencia = 0;

        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            int numero = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFrequencia) {
                maxFrequencia = freq;
                moda = numero;
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            int freq = entry.getValue();
            if (freq == maxFrequencia && entry.getKey() != moda) {
                return Integer.MIN_VALUE;
            }
        }

        return moda;
    }
}
