import java.util.ArrayList;
import java.util.Collections;

/*
Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa (solo los valores, no figuras). 
Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList
y volver a imprimir.
*/

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> cartas = new ArrayList<String>();
        //distribuimos los valores de las cartas en los 4 tipos (13 valores por cada tipo)
        for (int i = 0; i <= 52; i++){
            if (i<=13){
                String corazon = "C"+i;
                String diamante = "D"+i;
                String pica = "P"+i;
                String trebol = "T"+i;

                cartas.add(corazon);
                cartas.add(diamante);
                cartas.add(pica);
                cartas.add(trebol);
            }
        }
        //imprimimos la baraja (ordenada por defecto)
        System.out.println("Baraja ordenada");
        System.out.println(cartas);
        
        //imprimimos en orden inverso utilizando .reverse()
        System.out.println("Baraja orden inverso");
        Collections.reverse(cartas);
        System.out.println(cartas);
        
        //mezclamos los valores del array con .shuffle() e imprimimos
        System.out.println("Baraja mezclada al azar");
        Collections.shuffle(cartas);
        System.out.println(cartas);
    }
}
