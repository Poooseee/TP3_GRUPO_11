package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Archivo {
    private String ruta;
    
    public Archivo(String ruta) {
    	this.ruta = ruta;
    }
    
    public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	public boolean existeArchivo() {
		File archivo = new File(ruta);
		if(archivo.exists()) {
			return true;
		}else return false;
	}
	
	
	public List<String> leerLineas() {
	    List<String> lineas = new ArrayList<>();
	    FileReader entrada;

	    try{
	        entrada = new FileReader(ruta);
	        BufferedReader bufferLeerLineas = new BufferedReader(entrada);
	        
	        String linea;
	        
	        while((linea = bufferLeerLineas.readLine()) != null) {
	        	lineas.add(linea);
	        }
	        
	        bufferLeerLineas.close();
	    }
	    catch (IOException e) {
	    	System.out.println("No se encontró el archivo.");
	    }
	    return lineas;
	}
	
	public void EscribirLineas(TreeSet<Persona> personas) {
		try {
			FileWriter fw = new FileWriter(ruta, false);
			BufferedWriter bw = new BufferedWriter(fw);
			
				for (Persona persona : personas) {
					bw.write(persona.toString());
					bw.newLine();
				} 
				
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
