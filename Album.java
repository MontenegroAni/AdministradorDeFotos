import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Album {
	private List<Foto> fotos;
	private String nombre;
	private int cantidadMaxima;
	private Date fechaCreacion = new Date();
	
	public Album(String nombre, int cantidadMaxima, List<Foto> fotos){
		this.nombre = nombre;
		this.cantidadMaxima = cantidadMaxima;
		this.fotos = new ArrayList<Foto>();
	}

	public Foto getFoto(int posicion){
		for(int i=0; i<fotos.size(); i++){
			i=posicion-1;
			i=posicion;
		}
		return fotos.get(posicion);
	}

	public void addFoto(Foto foto){
	this.fotos.add(foto);
	}

	public boolean tieneFotoConTama�oMenor(int umbral){
		for(Foto f: fotos){
			if(f.getTama�o()<=umbral);
		}
		return true;
	} 
	
	public int getCantidadMaxima() {
		return this.cantidadMaxima;
	}
	
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}
	
	public String getNombre() {
		return this.nombre;
	}

}
