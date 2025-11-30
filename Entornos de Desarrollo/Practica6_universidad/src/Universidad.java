import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;

    // Relación con Departamento -> Composición - Cardinalidad -> 1:N
    private List<Departamento> departamentos;

    public Universidad(String nombre){
        this.nombre = nombre;
        departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Departamento d) {
        this.departamentos.add(d);
    }
}
