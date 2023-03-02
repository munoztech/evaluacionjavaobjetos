package com.evaluacion.evaluacionjavaobjetos.models;

import java.util.ArrayList;

public class Materia {
    private String nombre;
    private String horario;
    private Profesor profesor;
    private ArrayList<Alumno> alumnos;
    
    public Materia() {
    }
    
    public Materia(String nombre, String horario, Profesor profesor, ArrayList<Alumno> alumnos) {
        this.nombre = nombre;
        this.horario = horario;
        this.profesor = profesor;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Materia [nombre=" + nombre + ", horario=" + horario + ", profesor=" + profesor + ", alumnos=" + alumnos
                + "]";
    }



    
}
