package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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

	/*public void leerLineas() {
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
	}*/
	
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
	
	public TreeSet<Persona> leerLineas() {
	    TreeSet<Persona> listaPersonas = new TreeSet<>();

	    try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
	        String linea;

	        while ((linea = br.readLine()) != null) {
	            if (!linea.trim().isEmpty()) {
	                String[] datos = linea.split("-");

	                if (datos.length == 3) {
	                    String nombre = datos[0].trim();
	                    String apellido = datos[1].trim();
	                    String dni = datos[2].trim();

	                    try {
	                        Persona.validarDni(dni);
	                        listaPersonas.add(new Persona(nombre, apellido, dni));
	                    } catch (DniInvalido e) {
	                        System.out.println("DNI inválido, no se agrega: " + dni);
	                    }
	                } else {
	                    System.out.println("Línea con formato incorrecto: " + linea);
	                }
	            }
	        }
	    } catch (IOException e) {
	        System.out.println("Error al leer el archivo: " + e.getMessage());
	    }

	    return listaPersonas;
	}
	
}
