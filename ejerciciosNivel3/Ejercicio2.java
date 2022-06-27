import java.util.List;
import java.util.stream.Collectors;




/*Dada una lista que contiene números enteros, se deberá generar otra lista que contendrá el resultado de aplicar la operación de potencia a 2.
 inputs
 List<Integer> palabras = List.of(1, 2, 3, 4, 5);

 outputs
 [1, 4, 9, 16, 25]

 */

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        System.out.println(numeros);
        List<Integer> potenciaNumeros = potencia(numeros);
        System.out.println(potenciaNumeros);
    }
    //funcion que mapea la lista y multiplica cada elemento con el mismo.
    public static List<Integer> potencia(List<Integer> lista) {
        return lista.stream()
            .map(element -> element * element)
            .collect(Collectors.toList());
    }
}
