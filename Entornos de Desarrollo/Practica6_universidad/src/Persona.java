import java.util.Date;

public abstract class Persona {
    private String dni;
    private String nombre;
    private Date fechaNacimiento;

    // Relación con Direccion -> Composición - Cardinalidad -> 1:1
    private Direccion domicilio;

    public Persona(String dni, String nombre, Date fechaNacimiento, Direccion domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
    }

    public int getEdad(){
        // Calcular edad
        return 0;
    }
}
