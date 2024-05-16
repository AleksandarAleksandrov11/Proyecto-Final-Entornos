package AgendaTelefonica;

public class Multimedia extends Mensajes {

	private String nombreFichero;
	private int tamaño;
	
	public Multimedia(int telRemitente,int telDestinatario,String nombreFichero,int tamaño) {
		this.nombreFichero=nombreFichero;
		this.tamaño=tamaño;
	}

	public String getNombreFichero() {
		return nombreFichero;
	}

	public void setNombreFichero(String nombreFichero) {
		this.nombreFichero = nombreFichero;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Nombre del mensaje multimedia: " + nombreFichero + ", tamaño= " + tamaño+"MB";
	}
	
	
	
	
}
