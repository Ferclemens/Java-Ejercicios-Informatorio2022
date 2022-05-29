import java.util.ArrayList;
import java.util.List;

/*
import java.util.List;
import java.util.Scanner;
*/


/*
Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.

*/


public class Ejercicio4 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        
        /*  SI SE DESEA CARGAR A MANO
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nombre de alumno: ");
        while(lista.size() < 12){
            String Alumno = scan.nextLine();
            lista.add(Alumno);
        }
        System.out.println(lista);
        
        */

        lista.add("Laura");
        lista.add("Lourdes");
        lista.add("Dana");
        lista.add("Francisco");
        lista.add("Matias");
        lista.add("Ramon");
        lista.add("Jose");
        lista.add("Barbara");
        lista.add("Fernando");
        lista.add("julieta");
        lista.add("Damian");
        lista.add("Marcelo");

        //creamos los 3 cursos para distribuir los alumnos
        List<String> curso1 = new ArrayList<String>();
        List<String> curso2 = new ArrayList<String>();
        List<String> curso3 = new ArrayList<String>();

        //distribuimos los alumnos utilizando sublist()
        curso1 = (List<String>)lista.subList(0, 4);
        curso2 = (List<String>)lista.subList(4, 8);
        curso3 = (List<String>)lista.subList(8, 12);
    
        System.out.println("Curso Nº 1: " + curso1);
        System.out.println("Curso Nº 2: " + curso2);
        System.out.println("Curso Nº 3: " + curso3);


    }
}
