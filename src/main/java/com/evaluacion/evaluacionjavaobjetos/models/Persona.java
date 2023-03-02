package com.evaluacion.evaluacionjavaobjetos.models;

public class Persona {
    public String nombre;
    public Integer edad;
    public char genero;
    
    public Persona() {
    }

    public Persona(String nombre, Integer edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
    }
    
}
