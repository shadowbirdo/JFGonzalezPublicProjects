import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Relación con Persona -> Herencia
public class Profesor extends Persona {
    private double salario;

    // Relación con Curso -> Asociación - Cardinalidad -> 1:N
    private List<Curso> cursosDictados;

    public Profesor(String dni, String nombre, Date fechaNacimiento, Direccion domicilio, double salario) {
        super(dni, nombre, fechaNacimiento, domicilio);
        this.salario = salario;
        this.cursosDictados = new ArrayList<>();
    }

    public void asignarCurso(Curso c){
        this.cursosDictados.add(c);
    }
}
