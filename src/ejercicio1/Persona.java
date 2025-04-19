package ejercicio1;

public class Persona implements Comparable<Persona>{

    private String nombre;
    private String apellido;
    private String dni;

    // Constructores
    public Persona() {
        this.nombre = "Sin nombre";
        this.apellido = "Sin apellido";
        this.dni = "00000000";
    }

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public static boolean validarDni(String dni)throws DniInvalido {
    	for(int i=0; i<dni.length();i++) {
    		if(!Character.isDigit(dni.charAt(i))) {
    			throw new DniInvalido();
    		}
    	}
    	return true;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona: "+ nombre + " -  " + apellido + " - " + dni;
    }

	@Override
	public int compareTo(Persona persona) {
		//ORDENADOS POR APELLIDO 
	    if (this.apellido.equals(persona.apellido)) {
	        return 0;
	    }
	    if (this.apellido.compareTo(persona.apellido) < 0) {
	        return -1;
	    } 
	    else {
	        return 1;
	    }
	}
    
    
}
