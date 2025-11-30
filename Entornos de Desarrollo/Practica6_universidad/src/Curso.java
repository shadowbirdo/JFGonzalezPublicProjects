import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Curso {
    private String codigo;
    private String nombre;
    private int cupoMaximo;

    // Relación con Horario -> Composición - Cardinalidad -> 1:N
    private List<Horario> horarios;

    // Relación con Matricula -> Asociación - Cardinalidad -> 1:N
    private List<Matricula> inscripciones;

    public Curso(String codigo, String nombre, int cupoMaximo, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cupoMaximo = cupoMaximo;
        this.profesor = profesor;
        this.horarios = new ArrayList<>();
        this.inscripciones = new ArrayList<>();
    }

    public void agregarHorario(Horario h) {
        this.horarios.add(h);
    }

    public Matricula inscribirse(Estudiante e) {
        Matricula m = new Matricula(new Date(), this, e);
        this.inscripciones.add(m);
        return m;
    }
}
