package ar.edu.unlp.info.oo1.Ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio15.Email;

public class EmailTest {
	
	

	private Email email,emailVacio;
	@BeforeEach 
    void setUp () {
		email=new Email("hola","mundo");
		emailVacio=new Email("","");
		
	}

	@Test 
	
	
	void tamanioEmail() { // deberia instanciar un arhciov para que me diga el tamaño verdadero??
		
		assertEquals(9,email.tamanioEmail());
		
	}
	
	@Test
	
	void cumpleTest() {
		
		assertTrue(email.Cumple("hola"));
		assertTrue(email.Cumple("mundo"));
		assertTrue(emailVacio.Cumple(""));//estos tres chequeos estan al pedo 
		assertFalse(email.Cumple(null));
		assertFalse(email.Cumple("dd"));//aseguro que el mail no sea dd entonces me da verdadero 
	}
	
	
}
