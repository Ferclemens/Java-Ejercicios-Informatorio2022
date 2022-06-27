
import java.util.List;
import java.util.stream.Collectors;

/*
 Se dispone de una lista de Strings, de la cual saber la cantidad de valores que comiencen con la letra B (tanto mayúscula como minúscula, en ese caso decimos que será ignoreCase).
 input 
 List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac",);
 output
 3
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        System.out.println(palabras);
        //funcion que filtra la lista de strings segun los nombres que empiecen con B o b.
        List<String> numNombres = palabras.stream()
            .filter(name -> name.startsWith("b") || name.startsWith("B"))
            .collect(Collectors.toList());
            System.out.println(numNombres.size());
        }
}