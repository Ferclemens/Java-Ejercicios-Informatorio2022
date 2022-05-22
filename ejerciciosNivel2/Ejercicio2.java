import java.util.ArrayList;
import java.util.Scanner;

/*
Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio de la lista
 y otro al final. Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma
 (antes y después de agregar a en la primera y última posición).
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese 5 números para armar la lista: ");
        
        while (numeros.size() < 5){
            Integer numero = scan.nextInt();
            numeros.add(numero);
        }
        
        ArrayList<Integer> numeros2 = (ArrayList<Integer>) numeros.clone();

        System.out.print("Ingrese número de inicio de la segunda lista: ");
        Integer numInicio = scan.nextInt();
        numeros2.add(0,numInicio);

        System.out.print("Ingrese número de final de la segunda lista: ");
        Integer numFinal = scan.nextInt();
        numeros2.add(numFinal);

        scan.close();

        int contador = 0;
        for (int i = 0; i < numeros.size(); i++) {
            contador += 1;
            String salida1 = String.format("%sº elemento - %s", contador ,numeros.get(i));
            System.out.println(salida1);
        }
        System.out.println("Tamaño de la primera lista " + numeros.size()+ " elementos.");

        int contador2 = 0;
        for (int i = 0; i < numeros2.size(); i++) {
            contador2 += 1;
            String salida2 = String.format("%sº elemento - %s", contador2 ,numeros2.get(i));
            System.out.println(salida2);
        }
        System.out.println("Tamaño de la segunda lista " + numeros2.size()+ " elementos.");
        
    }
}