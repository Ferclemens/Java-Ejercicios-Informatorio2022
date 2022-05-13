import java.util.Scanner;

//Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().

public class Ejercicio7 {
    public static void main(String[] args) {
       System.out.println("Ingrese palabra a Capitalizar: ");
       Scanner scaner = new Scanner(System.in);
       String palabra = scaner.nextLine();
       char lista[] = palabra.toCharArray();
       for (char l : lista ){   
        System.out.print((char)(l-32));
       }
       scaner.close();
    }
}
