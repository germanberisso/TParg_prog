package org;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private ArrayList<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<Materia>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<org.Materia> getCorrelativas() {
        return correlativas;
    }

    public void agregarCorrelativa(Materia materia) {
        this.correlativas.add(materia);
    }

    public boolean tieneCorrelativas(){

        return !correlativas.isEmpty();
    }
}
