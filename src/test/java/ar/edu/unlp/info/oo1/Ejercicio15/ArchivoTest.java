package ar.edu.unlp.info.oo1.Ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import ejercicio15.Archivo;

public class ArchivoTest {
	
	
	private Archivo archivo1;
	
	@BeforeEach 
	
	void setUp ()  { 
		
		archivo1= new Archivo ("Archivo") ;
	}
  @Test 
	void tamaño () {
		
		assertEquals(7,archivo1.tamanio());
		
	}
	
	
}
