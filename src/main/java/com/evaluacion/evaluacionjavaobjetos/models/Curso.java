package com.evaluacion.evaluacionjavaobjetos.models;

import java.util.ArrayList;

public class Curso extends Materia{
    private String nivel;

    public Curso(String nombre, String horario, Profesor profesor, ArrayList<Alumno> alumnos, String nivel) {
        super(nombre, horario, profesor, alumnos);
        this.nivel = nivel;
    }

    public Curso(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Curso [nivel=" + nivel + "]";
    }

    
}
