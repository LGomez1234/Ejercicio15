package ejercicio15;

import java.util.LinkedList;
import java.util.List;

public class ClienteDeCorreo {

	
	  private Carpeta inbox;
	  private List<Carpeta> carpetas;
	  
	  public ClienteDeCorreo(String nombre) {
		    this.inbox = new Carpeta(nombre);
		    this.carpetas = new LinkedList<Carpeta>();
		    this.carpetas.add(inbox);
		}
		public void agregarCarpetas(Carpeta carpeta) {
			
			this.carpetas.add(carpeta);
			
		}
	  
	public void  recibir (Email email) {
        this.inbox.agregarEmail(email);
      
		
	}
	
	
	public  Email buscar (String texto) {
		return this.carpetas.stream().map(c->c.buscar(texto)).filter(e->e.Cumple(texto)).findFirst().orElse(null);
		 
	}
	
	public Integer espacioOcupado () {
		return this.carpetas.stream().mapToInt(c->c.tamanioCarpeta()).sum();
		
	}
	public void mover(Email email,Carpeta destino) {
		
		
	}
	
  public Carpeta getInbox () {
	  return this.inbox;
	  
  }
  public List<Carpeta>  getCarpetas() {
	  
	  return new LinkedList<>(carpetas);
	  
  }
  
  
	
}
