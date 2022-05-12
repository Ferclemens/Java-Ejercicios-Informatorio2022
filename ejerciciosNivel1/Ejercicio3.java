import java.util.Scanner;


//Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números (incrementos de 1) de la siguiente forma:
//Entrada: 5
//imprime:
//1
//12
//123
//1234
//12345


public class Ejercicio3 {
    public static void main(String [] args){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese un número para hacer la escalera: ");
        int numero =  scaner.nextInt();
        for (int x = 1; x <= numero; x++ ){
            System.out.println();
            for (int y = 1; y <= x; y ++){
                System.out.print(y);
            }
        }
        scaner.close();
    }
}
