package co.com.ejemplo.validacion.test;

public class valueString {

	public static String captar(String cadena) throws Exception {
		String  resultado = "";
		
		try {
			
			if(cadena==null) {
				throw new Exception ("Valor no ingresado");	
			}
			
			resultado = cadena;
			return resultado;
			
		}
		
		catch(Exception e) {
			
			System.out.println(e.getMessage());
			return null;
		}
		
		
	}
}
