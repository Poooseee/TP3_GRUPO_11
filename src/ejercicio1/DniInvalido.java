package ejercicio1;

import java.io.IOException;

public class DniInvalido extends IOException {

	public DniInvalido() {
		
	}
	
	public boolean verificarDniInvalido(String dni)throws DniInvalido{
		for(int i=0;i<dni.length();i++) {
			if(!Character.isDigit(dni.charAt(i))) {
				throw new DniInvalido();
			}
		}
		return true;
	}

	@Override
	public String getMessage() {

		return "DNI INVALIDO";
	}

}
