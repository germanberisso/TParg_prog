package org;

public class Inscripcion {
    private Alumno alumno;
    private Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }


    public boolean aprobada(){
        return !this.materia.tieneCorrelativas() || this.alumno.getMateriasAprobadas().containsAll(this.materia.getCorrelativas());
    }
}
