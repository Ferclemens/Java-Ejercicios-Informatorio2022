import java.util.ArrayList;
import java.util.Scanner;

/*
Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 


*/

public class Ejercicio7 {

    public static void main(String[] args) {
        //abrimos y cerramos scanner para ingresar los valores de inicio y final del array
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero de incio: ");
        int numInicio = scan.nextInt();
        System.out.println("Ingrese numero final: ");
        int numFinal = scan.nextInt();
        scan.close();

        ArrayList<String> lista = new ArrayList<>();
        //logica si el numero es modulo de 2, 3 o ambos.
        for (int i = numInicio; i < numFinal; i++){
            if (i % 2 == 0 && i % 3 == 0){
                lista.add("FizzBuzz");
            } else if (i % 2 == 0){
                lista.add("Fizz");
            } else if (i % 3 == 0){
                lista.add("Buzz");
            } else {
                lista.add(String.valueOf(i));
            }
        }
        System.out.println(lista);
    }
}
