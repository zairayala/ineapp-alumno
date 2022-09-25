package pe.inapp.ineappalumnoservice.Alumno;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @GetMapping
    @RequestMapping("/getAll")
    List<Alumno> getAll(){

        Alumno alumno = Alumno.builder()
                .id(1)
                .nombre("Jose")
                .apellido("Martinez")
                .dni("78942135")
                .curso("Internet de las cosas").build();

        Alumno alumno2 = Alumno.builder()
                .id(2)
                .nombre("Laura")
                .apellido("Carrera")
                .dni("71465324")
                .curso("Programación web").build();

        Alumno alumno3 = Alumno.builder()
                .id(3)
                .nombre("Marcos")
                .apellido("Vera")
                .dni("45678124")
                .curso("Desarrollo de aplicaciones android").build();

        return List.of(alumno,alumno2,alumno3);
    }
}
