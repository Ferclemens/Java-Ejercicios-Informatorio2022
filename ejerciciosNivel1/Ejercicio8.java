import java.util.Scanner;

//Crear una aplicación que solicite de entrada los datos de una persona en este orden:
//Nombre y Apellido
//Edad
//Dirección
//Ciudad
//Luego imprimirá el siguiente mensaje:
//{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}


public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese Nombre y Apellido: ");
        String nomYAp = scaner.nextLine();
        System.out.println("Ingrese Edad: ");
        String edad = scaner.nextLine();
        System.out.println("Ingrese Dirección: ");
        String direccion = scaner.nextLine();
        System.out.println("Ingrese Ciudad: ");
        String ciudad = scaner.nextLine();
        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nomYAp);
        scaner.close();
    }
}
