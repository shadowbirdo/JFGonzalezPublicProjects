import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Relación con Persona -> Herencia
public class Estudiante extends Persona {
    private boolean repetidor;

    // Relación con Matricula -> Asociación - Cardinalidad -> 1:N
    private List<Matricula> matriculas;

    public Estudiante(String dni, String nombre, Date fechaNacimiento, Direccion domicilio, boolean repetidor) {
        super(dni, nombre, fechaNacimiento, domicilio);
        this.repetidor = repetidor;
        this.matriculas = new ArrayList<>();
    }

    public Matricula inscribirse(Curso c){
        Matricula m = new Matricula(new Date(), c, this);
        return m;
    }
}
