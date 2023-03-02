package com.evaluacion.evaluacionjavaobjetos.models;

import java.util.ArrayList;

public class Alumno extends Persona{
    private String curso;
    private ArrayList<Double> notas;
    
    public Alumno(){
        super();
    }

    public Alumno(String curso, ArrayList<Double> notas) {
        this.curso = curso;
        this.notas = notas;
    }
    public Alumno(String nombre, Integer edad, char genero, String curso, ArrayList<Double> notas) {
        super(nombre, edad, genero);
        this.curso = curso;
        this.notas = notas;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public ArrayList<Double> getNotas() {
        return notas;
    }
    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno [curso=" + curso + ", notas=" + notas + "]";
    }


    
   

}
