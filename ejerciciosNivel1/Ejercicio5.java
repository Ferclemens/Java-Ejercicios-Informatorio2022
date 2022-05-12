import java.util.Scanner;

//Se desea una aplicación que solicite 2 números enteros y realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingrese dos números para mult. por sumas sucesivas: ");
        Scanner scaner = new Scanner(System.in);
        int numMult = scaner.nextInt();
        int numCant = scaner.nextInt();
        int init = 0;
        for (int n = 1; n <= numCant; n++){
            init += numMult;
            System.out.print("+" + numMult);
        }
        System.out.println();
        System.out.println("El resultado es: " + init);
        scaner.close();
    }
}
