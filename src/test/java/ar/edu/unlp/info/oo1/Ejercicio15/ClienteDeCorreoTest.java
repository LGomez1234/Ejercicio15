package ar.edu.unlp.info.oo1.Ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio15.Carpeta;
import ejercicio15.ClienteDeCorreo;
import ejercicio15.Email;

	
public class ClienteDeCorreoTest {

	
	
	
	
	

   private ClienteDeCorreo clienteCorreo ;
   private Carpeta carpeta;
   private Email e;
   
    @BeforeEach 

	void setUp () {
    	clienteCorreo = new ClienteDeCorreo("Leonel");
		carpeta = new Carpeta("Eliminados");
		clienteCorreo.agregarCarpetas(carpeta);
   }
    
    @Test 
    
    void buscarTest() {
    	Email email = new Email("hola", "chau");
		clienteCorreo.recibir(email);
		assertEquals(clienteCorreo.buscar("hola"));
        assertNull(clienteCorreo.buscar("perro"));	
    	
    	
    	
    }
	@Test
	void tamanioEmail () {
		
		Email email=new Email("Hola","chau");
		clienteCorreo.recibir(email);
		assertEquals(8,clienteCorreo.espacioOcupado());//deberia agregar un archivo al mail o asi con el titulo y cuerpo esta bien??
		
		
	}
	
	
}
