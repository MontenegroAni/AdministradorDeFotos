
public class Foto {
	private String personasEnFoto;
	private String nombreArchivo;
	private int tamaño;
	private String descripcion;
	
	public Foto(String nombreArchivo, String personasEnFoto, int tamaño, String descripcion) {
		this.personasEnFoto = personasEnFoto;
		this.nombreArchivo = nombreArchivo;
		this.tamaño = tamaño;
		this.descripcion = descripcion;
	}
	
	public String getPersonaEnFoto(int pos) {
		return this.personasEnFoto;
	}
	
	public void setPersonaEnFoto(String persona, int pos) {
		this.nombreArchivo.contains(persona);
	}
	
	public int getTamaño() {
		return tamaño;
	}

}
