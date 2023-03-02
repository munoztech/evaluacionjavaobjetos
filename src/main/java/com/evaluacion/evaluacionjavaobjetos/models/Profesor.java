package com.evaluacion.evaluacionjavaobjetos.models;

import java.util.ArrayList;

public class Profesor extends Persona {
    private String especialidad;
    private ArrayList<Materia> materiasAsignadas;
    
    public Profesor(String especialidad, ArrayList<Materia> materiasAsignadas) {
        this.especialidad = especialidad;
        this.materiasAsignadas = materiasAsignadas;
    }
    public Profesor(String nombre, Integer edad, char genero, String especialidad,
            ArrayList<Materia> materiasAsignadas) {
        super(nombre, edad, genero);
        this.especialidad = especialidad;
        this.materiasAsignadas = materiasAsignadas;
    }


    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public ArrayList<Materia> getMateriasAsignadas() {
        return materiasAsignadas;
    }
    public void setMateriasAsignadas(ArrayList<Materia> materiasAsignadas) {
        this.materiasAsignadas = materiasAsignadas;
    }
    
    @Override
    public String toString() {
        return "Profesor [especialidad=" + especialidad + ", materiasAsignadas=" + materiasAsignadas + "]";
    }
    
}
