
import java.util.Scanner;

//Realizar un programa que calcule el factorial de un número:
//n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
//Sin hacer uso de librerías.

public class Ejercicio4 {
    public static void main(String [] args){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese un número para calcular el factorial: ");
        int numero =  scaner.nextInt();
        int factorial = 1;
        for (int x = 1; x <= numero; x++ ){
            factorial = factorial * x;
         }
        System.out.println("El factorial de " + numero + " es " + factorial); 
        scaner.close();
    }    
}
