package ejercicio1;

import java.io.FileReader;

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
		catch{
			
		}
	}
}
