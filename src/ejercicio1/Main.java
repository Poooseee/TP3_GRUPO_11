package ejercicio1;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Archivo archivoPersonas = new Archivo("src/ejercicio1/Personas.txt");
		
		TreeSet<Persona> listaPersonas = new TreeSet<Persona>();
		
		listaPersonas = archivoPersonas.leerLineas();
		//LLENAR TREESET
	}

}
