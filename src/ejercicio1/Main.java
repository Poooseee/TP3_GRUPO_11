package ejercicio1;

import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		DniInvalido validaciones = new DniInvalido();
		
		Archivo archivoPersonas = new Archivo("src/ejercicio1/Personas.txt");
		
		TreeSet<Persona> listaPersonas = new TreeSet<Persona>();
		
		List <String> lineas = archivoPersonas.leerLineas();
		
		for(String linea : lineas) {
			String[] vector = linea.split("-");
			
			if(vector.length >=3) {}
			String nombre = vector[0];
			String apellido = vector[1];
			String dni = vector[2];
			
			try {
				validaciones.verificarDniInvalido(dni);
				
				Persona persona = new Persona();
				persona.setNombre(nombre);
				persona.setApellido(apellido);
				persona.setDni(dni);
				
				listaPersonas.add(persona);
			}
			catch (DniInvalido e) {
				System.out.println(e);
			}
		}
	}

}
