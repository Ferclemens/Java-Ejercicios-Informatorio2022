import java.util.Scanner;

//Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.


public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese texto: ");
        String texto = scaner.nextLine();
        System.out.println("Ingrese letra a contar: ");
        char letra = scaner.next().charAt(0);

        char lista[] = texto.toCharArray();
        
        int contador = 0;
        for(int i = 0; i < texto.length(); i++){
            if (lista[i] == letra){
            contador++;
            }   
        }
        System.out.println("Cantidad de veces que aparece " + letra + " en el texto es: "+ contador);
        scaner.close();
    }
}
