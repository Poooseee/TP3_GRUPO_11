package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
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
	
	public boolean existeArchivo() {
		File archivo = new File(ruta);
		if(archivo.exists()) {
			return true;
		}else return false;
	}

	public void leerLineas() {
		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
			BufferedReader Buffer = new BufferedReader(entrada);
			
			String linea = "";
			while(linea != null) {
				System.out.println(linea);
				linea = Buffer.readLine();
			}
			Buffer.close();
			entrada.close();
		}
		catch(IOException e){
			System.out.println("No se encontró el archivo.");
		}
	}
	
	public void leerLetraXLetra() {
		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
			int c = entrada.read();
			while(c != -1) {
				char letra = (char) c;
				c = entrada.read();
			}
			entrada.close();
		}catch(IOException e){
			System.out.println("No se encontró el archivo.");
		}
	}
	
}
