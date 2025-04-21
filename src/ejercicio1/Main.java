package ejercicio1;

import java.util.List;
import java.util.TreeSet;

public class Main {
	/*
		String dni ="0";
		String apellido ="";
		String nombre ="";
		DniInvalido validaciones = new DniInvalido();
		
		Archivo archivoPersonas = new Archivo("ejercicio1/Personas.txt");
		
		TreeSet<Persona> listaPersonas = new TreeSet<Persona>();
		
		List <String> lineas = archivoPersonas.leerLineas();
		
		for(String linea : lineas) {
			String[] vector = linea.split("-");
			
			if(vector.length >=3) {
				 nombre = vector[0];
				 apellido = vector[1];
				 dni = vector[2];				
			}
			
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
	 */

	public static void main(String[] args) {
	    TreeSet<Persona> listaPersonasValidadas = cargarPersonasDesdeElArchivo("ejercicio1/Personas.txt");
		
	    /*
	    crearYcargarArchivo(listaPersonasValidadas);
	    
		System.out.println("--- RESULTADO.TXT --- ");
		
		leerArchivo();
		*/
	    Archivo arcPersonas = new Archivo("ejercicio1/Resultado.txt");
	    arcPersonas.EscribirLineas(listaPersonasValidadas);
	    
		System.out.println("--- RESULTADO.TXT --- ");
		
		arcPersonas.leerArchivo();
		
	}
	public static TreeSet<Persona> cargarPersonasDesdeElArchivo(String ruta){
        DniInvalido validaciones = new DniInvalido();
        
		Archivo archivoPersonas = new Archivo("ejercicio1/Personas.txt");
		
		TreeSet<Persona> listaPersonas = new TreeSet<Persona>();
		
		List <String> lineas = archivoPersonas.leerLineas();
		
		for(String linea : lineas) {
			Persona persona = crearPersonaApartirDeLinea(linea);
		if(persona != null) {
			try {
				validaciones.verificarDniInvalido(persona.getDni());
				
				listaPersonas.add(persona);
				
			}catch(DniInvalido e) {
				System.out.println(e);
			}
		}
		   
		}
		return listaPersonas;
	}
	public static Persona crearPersonaApartirDeLinea(String linea) {
		String[] vector = linea.split("-");
		
		if(vector.length == 3) {
			String nombre = vector[0].trim();
			String apellido = vector[1].trim();
			String Dni = vector[2].trim();
			
			Persona persona = new Persona(nombre,apellido,Dni);
		    return persona;
		}
		return null;
	}
	
	public static void crearYcargarArchivo(TreeSet<Persona> listaPersonas) {
		Archivo arcPersonas = new Archivo("ejercicio1/Resultado.txt");
	    arcPersonas.EscribirLineas(listaPersonas);
	}
	
	public static void leerArchivo() {
		Archivo arcPersonas = new Archivo("ejercicio1/Resultado.txt");
		List<String> lista = arcPersonas.leerLineas();
		for (String personas : lista) {
			System.out.println(personas);
		}
	}

	}


