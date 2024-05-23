package AgendaTelefonica;

/**
 * La clase Texto representa un mensaje de texto que puede ser enviado entre usuarios.
 * Extiende la clase base Mensajes.
 */
public class Texto extends Mensajes {
    
    private String texto;
    
    /**
     * Constructor para crear un mensaje de texto con los detalles proporcionados.
     *
     * @param telRemitente    El número de teléfono del remitente del mensaje.
     * @param telDestinatario El número de teléfono del destinatario del mensaje.
     * @param texto           El contenido del mensaje de texto.
     */
    public Texto(int telRemitente, int telDestinatario, String texto) {
        super.setTelRemitente(telRemitente);
        super.setTelDestinatario(telDestinatario);
        this.texto = texto;
    }
    
    /**
     * Obtiene el contenido del mensaje de texto.
     *
     * @return El contenido del mensaje de texto.
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Establece el contenido del mensaje de texto.
     *
     * @param texto El contenido del mensaje de texto a establecer.
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * Devuelve una representación en cadena del mensaje de texto.
     *
     * @return Una cadena que contiene el contenido del mensaje de texto.
     */
    @Override
    public String toString() {
        return "Contenido del mensaje de texto: " + texto;
    } 
}