package org;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;


public class InscripcionTest {
    @Test
    public void inscripcion1correlativa(){
        Materia mate1 = new Materia("mate1");
        Materia mate2 = new Materia("mate2");
        mate2.agregarCorrelativa(mate1);
        Alumno ger= new Alumno("German","Rodriguez","26803977");
        ger.agregarMateriaAprobada(mate1);
        Inscripcion inscripcionGer = new Inscripcion(ger,mate2);
        if (inscripcionGer.aprobada()){
            System.out.println("La inscripcion esta aprobada");
        }
    }

    @Test
    public void noAprobada(){
        Materia mate1 = new Materia("mate1");
        Materia mate2 = new Materia("mate2");
        mate2.agregarCorrelativa(mate1);
        Alumno ger= new Alumno("German","Rodriguez","26803977");
        Inscripcion inscripcionGer = new Inscripcion(ger,mate2);
        if (!inscripcionGer.aprobada()){
            System.out.println("La inscripcion no esta aprobada");
        }
    }
}
