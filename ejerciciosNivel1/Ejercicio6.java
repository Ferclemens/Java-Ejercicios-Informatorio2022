import java.util.Scanner;

//Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia (sin uso de librerías).

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese número para op. de potencia: ");
        int numMult = scaner.nextInt();
        System.out.println("Ingrese potencia: ");
        int numCant = scaner.nextInt();
        int init = 1;
        for (int n = 1; n <= numCant; n++){
            init = init*numMult;
            System.out.print("*" + numMult);
        }
        System.out.println();
        System.out.println("El resultado es: " + init);
        scaner.close();
    }
}
