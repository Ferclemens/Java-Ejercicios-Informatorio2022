import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Se posee una Lista con objetos de clase Alumno con los atributos: apellido, nombre y fechaDeNacimiento (con tipos: String, String y LocalDate). Se desea generar un Map<String, Integer> donde la clave de Map será el apellido concatenado con el nombre (con separador de espacio en blanco) y el value la edad del alumno.
//La lista de entrada debe estar cargada con varios alumnos (al menos 5) para subir el ejemplo y demostrar su funcionamiento.
//En ejemplo se muestra solo con 1 Alumno a modo de abreviar
//En el ejemplo también se usa LocalDate.now().minusYears(30), en el ejercicio a presentar se deberá usar otra tecnica de construcción para la fecha (no usar .now(). Pueden ver métodos .parse(), etc)

//input: List<Alumno> alumnos = List.of(new Alumno("Homero", "Simpson", LocalDate.now().minusYears(30)));
//output: {"Simpson Homero"=30}


public class Ejercicio5 {
    public static void main(String[] args) {
        //creamos la lista de alumnos con la que vamos a trabajar 
        List<Alumno> listaDeAlumnos = List.of(
            new Alumno("Fernando", "Clemens", LocalDate.parse("1989-12-16")),
            new Alumno("Daiana", "Gomez", LocalDate.parse("1995-08-02")),
            new Alumno("Ruben", "Jara", LocalDate.parse("1990-01-25")),
            new Alumno("Julian", "Peralta", LocalDate.parse("1998-06-30")),
            new Alumno("Mara", "Riquelme", LocalDate.parse("1996-07-27"))
        );
        //creamos un map con nombre completo de alumnos como key y su edad como value
        Map<String,Integer> detalleAlumnos = listaDeAlumnos.stream()
            .collect(Collectors.toMap(Alumno::nombreCompletoJunto, Alumno::getEdad));
        
        System.out.println(detalleAlumnos);
    }

}
//clase Alumno con los datos solicitados y sus metodos Get
class Alumno {
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;
    
    public Alumno(String nombre, String apellido, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    //funcion para juntar los atributos nombre y apellido
    public String nombreCompletoJunto() {
        return String.format("\"%s %s\"", apellido, nombre);
    }
    //obtenemos la edad del alumno utilizando clase Period y su metodo getYears()
    public Integer getEdad() {
        return Period.between(fechaDeNacimiento, LocalDate.now()).getYears();
    }

}
