package AlumnoMain_3;

import Alumno.Service_3.AlumnoService;
import java.util.ArrayList;

public class AlumnoMain {

    public static void main(String[] args) {
        AlumnoService serv = new AlumnoService();
        ArrayList lista = serv.listaAlumnos();
        serv.notaFinal(lista);
    }
    
}
