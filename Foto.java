
public class Foto {
	private String personasEnFoto;
	private String nombreArchivo;
	private int tama�o;
	private String descripcion;
	
	public Foto(String nombreArchivo, String personasEnFoto, int tama�o, String descripcion) {
		this.personasEnFoto = personasEnFoto;
		this.nombreArchivo = nombreArchivo;
		this.tama�o = tama�o;
		this.descripcion = descripcion;
	}
	
	public String getPersonaEnFoto(int pos) {
		return this.personasEnFoto;
	}
	
	public void setPersonaEnFoto(String persona, int pos) {
		this.nombreArchivo.contains(persona);
	}
	
	public int getTama�o() {
		return tama�o;
	}

}
