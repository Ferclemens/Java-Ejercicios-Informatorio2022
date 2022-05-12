import java.util.Scanner;


//Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números.

public class Ejercicio2 {
    public static void main(String [] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("A continuación, ingrese dos números: ");
        int pn =  scaner.nextInt();
        int sn = scaner.nextInt();
        System.out.println("suma: " + pn + " + " + sn + " = "+ (pn+sn));
        System.out.println("resta: " + pn + " - " + sn + " = "+ (pn-sn));
        System.out.println("multiplicacion: " + pn + " * " + sn + " = "+ (pn*sn));
        System.out.println("division: " + pn + " / " + sn + " = "+ (pn/sn));
        System.out.println("modulo: " + pn + " % " + sn + " = "+ (pn%sn));
        scaner.close();
    }
}
