import java.time.LocalTime;

public class Horario {
    private String diaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public Horario(String diaSemana, LocalTime horaInicio, LocalTime horaFin) {
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
}