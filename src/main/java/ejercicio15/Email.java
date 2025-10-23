package ejercicio15;

import java.util.LinkedList;
import java.util.List;

public class Email {
	
	private String titulo;
	private String cuerpo;
	
	private List<Archivo> adjuntos;
	
	
	
	
	
	public Email(String titulo, String cuerpo) {
	
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos=new LinkedList<Archivo>();
	}
	public void agregarAdjuntos(Archivo a) {
		adjuntos.add(a);
		
	}
	public String getTitulo() {
		return titulo;}
	
	public String getCuerpos() {
		return cuerpo;};
	
	public List<Archivo> getAjuntos() {
		return adjuntos;
	}
	
	
	public int tamanioEmail () {
		
		return adjuntos.stream().mapToInt(a->a.tamanio()).sum()+this.titulo.length()+this.cuerpo.length(); 
	}
	
	public boolean Cumple (String texto) {
		return this.titulo.equals(texto) | this.cuerpo.equals(texto);	}
	
	
	

}

