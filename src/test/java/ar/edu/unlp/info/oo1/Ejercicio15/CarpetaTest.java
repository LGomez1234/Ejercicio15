package ar.edu.unlp.info.oo1.Ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio15.Carpeta;
import ejercicio15.Email;



public class CarpetaTest {
	
	
	private Carpeta carpeta;
	
	@BeforeEach 
	void setUp() {
		carpeta=new Carpeta("Leonel");
	}
	
	
	@Test 
	void buscarTest () {
		
		Email e=new Email("hola","mundo") ;
		carpeta.agregarEmail(e);
		assertEquals(carpeta.buscar("mundo"));
		assertNull(carpeta.buscar("perro"));
	}
	@Test
	void tamanioTest() {
		;
		assertEquals(0,carpeta.tamanioCarpeta());
		Email e=new Email("hola","mundo");
		Email e2=new Email2("hola","mundo");
		carpeta.agregarEmail(e);
		carpeta.agregarEmail(e2);
		assertEquals(18,carpeta.tamanioCarpeta());
	}
	
	
	
	@Test 
	
	void mover() {
		Email e=new Email("hola","mundo");//tengo que crear la misma instancia de email y no dos nuevas porque el metodo remove en carpeta usa el meotod equals y como no sobreescribi dicho metodo me compara referencias 
	    carpeta.agregarEmail(e);
		Carpeta carpeta2 = new Carpeta("carpeta 2");
		carpeta.mover(e,carpeta2);
		assertNull(carpeta.buscar("hola"));
		aseertEquals(e,carpeta2.buscar("hola"));
		
		
		
		
		
		
		
	}


	private void aseertNotNull(Email buscar) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
