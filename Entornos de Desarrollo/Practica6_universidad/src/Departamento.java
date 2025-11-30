import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;

    // Relación con Curso-> Agregación - Cardinalidad -> 1:N
    private List<Curso> cursos;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }
    
    public void agregarCurso(Curso c) {
        this.cursos.add(c);
    }
}
