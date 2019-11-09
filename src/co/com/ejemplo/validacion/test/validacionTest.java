
package co.com.ejemplo.validacion.test;



import static org.junit.Assert.*;
import org.junit.Test;
import co.com.ejemplo.validacion.test.valueString;




public class validacionTest {

public static final String resultado = "Claro2323.";	
	@Test
	public void validarCadena() {
		try {
			String respuesta = valueString.captar(resultado);
			System.out.println("La Cadena es:"+ respuesta );
			assertEquals("Claro2323.#", respuesta);
			
			
		}
		
		catch(Exception e){
			e.printStackTrace();
			
		}
		
	}

}
