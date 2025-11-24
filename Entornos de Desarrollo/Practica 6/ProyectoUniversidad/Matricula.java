import java.util.Date;

public class Matricula {
    private Date fecha;
    private double notaFinal;
    
    // Relación con Curso -> Asociación - Cardinalidad -> N:1
    private Curso curso;

    // Relación con Estudiante -> Asociación - Cardinalidad -> N:1
    private Estudiante estudiante;

    public Matricula(Date fecha, Curso curso, Estudiante estudiante) {
        this.fecha = fecha;
        this.curso = curso;
        this.estudiante = estudiante;
        this.notaFinal = 0.0;
    }

    public double calcularNotaFinal(){
        // Cálculo de la nota final
        return 0;
    }
}