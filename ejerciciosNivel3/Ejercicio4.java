import java.util.List;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.LongStream;

//Se dispone de una lista de Integer, de la cual queremos obtener otra lista aplicando la operación de factorial pero no se desean valores repetidos.
// return [1, 2, 24]

public class Ejercicio4 {

  public static void main(String[] args) {
    List<Integer> numeros = List.of(1, 2, 3, 4, 4, 4);
    // creamos un hashset
    Set<Integer> numSinRepetir = new HashSet<>(numeros);

    List<Long> factorial = numSinRepetir.stream().map(Ejercicio4::factorial).collect(Collectors.toList());
    System.out.println(factorial);
  }
  //funcion para realizar el factorial utilizando LongStream y reduce()
  private static long factorial(int n) {
    return LongStream.rangeClosed(1, n).reduce(1, (long x, long y) -> x * y);
  }
}
