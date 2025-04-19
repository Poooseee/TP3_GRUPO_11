package ejercicio1;

import java.io.FileReader;
import java.io.IOException;

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

	public void leerLineas() {
		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
		}
		catch(IOException e){
			System.out.println("No se encontró el archivo.");
		}
	}
}
