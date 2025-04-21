package ejercicio1;

import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Persona persona = new Persona();
	    TreeSet<Persona> listaPersonasValidadas = persona.cargarPersonasDesdeElArchivo("ejercicio1/Personas.txt");
	    Archivo arcPersonas = new Archivo("ejercicio1/Resultado.txt");
	    arcPersonas.EscribirLineas(listaPersonasValidadas);
	    
		System.out.println("--- RESULTADO.TXT --- ");
		
		arcPersonas.leerArchivo();
		
	}


	}


