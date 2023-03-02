package com.evaluacion.evaluacionjavaobjetos;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

import com.evaluacion.evaluacionjavaobjetos.models.Alumno;

@SpringBootApplication
public class EvaluacionjavaobjetosApplication {

	public static void main(String[] args) {
		/*crear las clases, clase padre persona, clases hijas profesor y alumno, clase padre materia clase hija curso*/
		System.out.println("---------------------primera funcion--------------------");
		IngresoNotas();

		
		System.out.println("---------------------segunda funcion--------------------");
		int n= 4;
		ArrayList<Alumno> alumnos = new ArrayList<>();
		
			Alumno alumno1  = new Alumno("Luis", 12, 'M', "octavo", null);
			Alumno alumno2  = new Alumno("Francisca", 12, 'F', "Segundo", null);
			Alumno alumno3  = new Alumno("ALicia", 12, 'F', "Sexto", null);
			Alumno alumno4  = new Alumno("Luis", 12, 'M', "Septimo", null);
			guardarList(alumnos, alumno1, n);
			guardarList(alumnos, alumno2, n);
			guardarList(alumnos, alumno3, n);
			guardarList(alumnos, alumno4, n);

			System.out.println("---------------------tercera funcion--------------------");

			//tercera funcion
		ArrayList<Integer> notas = new ArrayList<>();
		notas.add(3);
		notas.add(10);
		notas.add(4);
		mostrarNotas(notas);
		
		

		

	}

	public static void IngresoNotas() {
		ArrayList<Alumno> listaAlumnos = new ArrayList<>();
		
		String nombre;
		Alumno nombreAlumno;
		ArrayList<Double> listaNotas;
		Scanner entrada = new Scanner(System.in);
		
		
		while (true) {
			nombre = new String();
			nombreAlumno = new Alumno();
			listaNotas = new ArrayList<>();
			
			System.out.println("Ingrese nombre de alumno o para terminar escriba Fin => ");
			nombre = entrada.next();
			if(nombre.equalsIgnoreCase("Fin"))
				break;
			
			nombreAlumno.setNombre(nombre);
			
			
			
			System.out.println("Ingrese Nota => ");
			listaNotas.add(entrada.nextDouble()); 
			
			System.out.println("Ingrese Nota => ");
			listaNotas.add(entrada.nextDouble()); 
			
			nombreAlumno.setNotas(listaNotas);
			listaAlumnos.add(nombreAlumno);
			
		}		
		
		for(Alumno alumno:listaAlumnos) {
			Double suma = 0d;
			for(Double notaAlumno:alumno.getNotas()) {
				suma = suma + notaAlumno;
			}
			
			System.out.println("El alumno " + alumno.getNombre() + " tuvo un promedio de " + suma/alumno.getNotas().size());
		}
	}



	public static void guardarList(ArrayList<Alumno> alumnos, Alumno alumno, int n) {
		
		alumnos.add(alumno);
		
		if(n == alumnos.size()) {
			for(Alumno a:alumnos) {
				System.out.println(a);
			}
		}
		
	}

	public static void mostrarNotas(ArrayList<Integer> notas) {
		float suma = 0.0f;
		int masBaja = notas.get(0);
		int masAlta = notas.get(0);
		
		for(int i = 0 ; i<notas.size() ; i++ ) {
			suma = suma  + notas.get(i);
				
			if(notas.get(i) < masBaja) {
				masBaja = notas.get(i);
			}	
			
			if(notas.get(i) > masAlta) {
				masAlta = notas.get(i);
			}	
			
		}
		
		System.out.println("El promedio es => " + suma/notas.size());
		System.out.println("La nota mas baja es => " + masBaja);
		System.out.println("La nota mas alta es => " + masAlta);
	}
	

}