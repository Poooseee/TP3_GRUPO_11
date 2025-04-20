package ejercicio1;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Archivo archivoPersonas = new Archivo("ejercicio1\\Personas.txt");
		
		TreeSet<Persona> listaPersonas = new TreeSet<Persona>();
		
		archivoPersonas.leerLineas();
		//LLENAR TREESET
	}

}
