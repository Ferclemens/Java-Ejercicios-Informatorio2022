import java.util.ArrayList;

/*
Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga de horas semanal de un empleado. Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.
*/


public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> horas = new ArrayList<Integer>();
        horas.add(6);
        horas.add(7);
        horas.add(8);
        horas.add(4);
        horas.add(5);
        System.out.println("Horas trabajadas por dia: ");
        System.out.println(horas);

        
        ArrayList<Integer> valorHora = new ArrayList<Integer>();
        valorHora.add(350);
        valorHora.add(345);
        valorHora.add(550);
        valorHora.add(600);
        valorHora.add(320);
        System.out.println("Valor a pagar por hora: ");
        System.out.println(valorHora);

        ArrayList<Integer> suma = new ArrayList<Integer>();

        int total = 0;
        for (int i = 0; i < horas.size(); i++){    
            int sumatoria = horas.get(i) * valorHora.get(i);
                suma.add(sumatoria);
                total += sumatoria;
            }
            System.out.println("Totales a pagar por dia: ");
            System.out.println(suma);
            System.out.print("Total a pagar en la semana: $");
            System.out.println(total);

    }
}
