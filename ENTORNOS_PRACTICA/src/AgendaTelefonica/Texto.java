package AgendaTelefonica;

public class Texto extends Mensajes{
	
	private String texto;
	
	public Texto(int telRemitente,int telDestinatario,String texto) {
		this.texto=texto;
	}
	

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Contenido del mensaje de texto: "+texto;
	}
	
	
	
}
