import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Se dispone de una colección de Empleados, de cada empleado se conoce:
Nombre y Apellido
DNI
horasTrabajadas
valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado. 
*/

public class Ejercicio6 {

    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Fernando Clemens", 34794429, 8, 400);
        Empleado emp2 = new Empleado("Roman Riquelme", 46874526, 6, 400);
        Empleado emp3 = new Empleado("Alf Melmac", 28774164, 8, 600);

        Set<Empleado> equipo = new HashSet<>();
        equipo.add(emp1);
        equipo.add(emp2);
        equipo.add(emp3);
        
        Map detalleEquipo = new HashMap<>();
        equipo.forEach(emp -> {detalleEquipo.put(emp.dni, emp.Sueldo());});

        System.out.println(detalleEquipo);
        
    }
}

    class Empleado {
        String nomYAp;
        int dni;
        int hsTrab;
        int valorHora;
        
        public Empleado(String nomYAp, int dni, int hsTrab, int valorHora) {
            this.nomYAp = nomYAp;
            this.dni = dni;
            this.hsTrab = hsTrab;
            this.valorHora = valorHora;
        }

        public int Sueldo() {
            return(hsTrab * valorHora);
        }

    }


