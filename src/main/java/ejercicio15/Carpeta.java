package ejercicio15;

import java.util.LinkedList;
import java.util.List;

public class Carpeta {
	 private String nombre;
	 private List<Email> emails;
	 
	 public Carpeta(String nombre) {
		 this.nombre=nombre;
		 this.emails=new LinkedList<Email>();
	
	 }
	public String getNombre() {
		return nombre;
	}
	public List<Email>getEmails () { // cuando te ponen metodos para hacer tipo asi (????) cuantos deberia agregar aca agregue uno que es devolver emails
		return emails;
	}
	public void agregarEmail (Email email) {
		emails.add(email);
		
		
		
	}
	public void eliminarEmail(Email email) { // cuando te ponen metodos para hacer tipo asi (????) cuantos deberia agregar aca agregue uno que es eliminar email  
		this.emails.remove(email);
		
	}
	
	public Email buscar (String texto) {
		
		
		return emails.stream().filter(e->e.Cumple(texto)).findFirst().orElse(null);
	}

	
	public int tamanioCarpeta () {
		
		
		return this.emails.stream().mapToInt(e->e.tamanioEmail()).sum();
		
	}
	
	public void mover (Email email,Carpeta destino) { //¿¿¿este metodo mover le corresponde a esta clase o a otra?? deberia agregar otro metodo que se llame desede la calse ClienteDeCorreo??
		
		 emails.remove(email);
		 destino.agregarEmail(email);
		
		 
		 
	}


}
