import java.util.Scanner;
import java.util.ArrayList;
/*
Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego
imprimir por pantalla el ranking
Input (Entrada):
Bariloche
Córdoba
Resistencia
Output (Salida):
#1 - Bariloche
#2 - Córdoba
#3 - Resistencia
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<String>();
        
        //inicio Scanner
        Scanner scan = new Scanner(System.in);
       
        System.out.print("ingrese ciudades favoritas (para salir ingrese x): ");
        
        String ciudad = scan.nextLine();
        
        //bucle while para añadir ciudades al arrayList con la condición de cierre (tipear "x") 
        while ( !ciudad.equals("x") ){           
            ciudades.add(ciudad);
            ciudad = scan.nextLine();
        }
        //cierro Scanner
        scan.close();

        // bucle for para imprimir las ciudades guardadas en el ArrayList en el ranking
        int ranking = 0;
        for (String i : ciudades) {
            ranking +=1;
            String salida = String.format("#%s - %s", ranking , i);
            System.out.println(salida);
        }
    }
}