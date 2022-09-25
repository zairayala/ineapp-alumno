package pe.inapp.ineappalumnoservice.Alumno;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Alumno {
    Integer id;
    String nombre;
    String apellido;
    String dni;
    String curso;
}