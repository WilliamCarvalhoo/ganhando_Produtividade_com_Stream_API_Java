package Supplier;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class SupplierExample {
    public static void main(String[] args) {
        // Usar o supplier com expressao lambda para fornecer uma saudacao personalizada
        Supplier<String> saudacao = () -> " Olá seja bem vindo (a)!";

        // Usar o supplier para obter uma lista com 5 expressoes
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());

        listaSaudacoes.forEach( s -> System.out.println(s));

    }
}
