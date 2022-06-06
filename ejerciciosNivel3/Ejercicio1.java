/*
Dada una lista que contiene valores de tipo String, se deberá filtrar todos los valores que NO sean null o vacío ("").
Output: ["Hola", "Informatorio"]
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Ejercicio1 {

    public static void main(String[] args) {

        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        palabras.add("   ");

        List<String> listaLimpia = cleanList(palabras);
        System.out.println(listaLimpia);
    }

    public static List<String> cleanList(List<String> lista) {
        List<String> newList = lista.stream()
                .filter(Objects::nonNull)
                .filter(element -> !element.isEmpty())
                .filter(element -> !element.isBlank())
                .collect(Collectors.toList());
        return newList;
    }
}