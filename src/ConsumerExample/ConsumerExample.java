package ConsumerExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Criacao de lista de numeros inteiros

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o consumer com expressao lambda para imprimir numeros pares

        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);

            }
        };

        //Usar o consumer parar imprimir numeros pares no stream

        numeros.forEach(n -> {
                    if (n % 2 == 0) {
                        System.out.println(n);
                    }
                }
        );
    }


}
