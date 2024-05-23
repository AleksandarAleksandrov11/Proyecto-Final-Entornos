package AgendaTelefonica;

/**
 * La clase Mensajes es una clase base para representar mensajes genéricos.
 */
public class Mensajes {

    private int telRemitente, telDestinatario;

    /**
     * Obtiene el número de teléfono del remitente del mensaje.
     *
     * @return El número de teléfono del remitente.
     */
    public int getTelRemitente() {
        return telRemitente;
    }

    /**
     * Establece el número de teléfono del remitente del mensaje.
     *
     * @param telRemitente El número de teléfono del remitente a establecer.
     */
    public void setTelRemitente(int telRemitente) {
        this.telRemitente = telRemitente;
    }

    /**
     * Obtiene el número de teléfono del destinatario del mensaje.
     *
     * @return El número de teléfono del destinatario.
     */
    public int getTelDestinatario() {
        return telDestinatario;
    }

    /**
     * Establece el número de teléfono del destinatario del mensaje.
     *
     * @param telDestinatario El número de teléfono del destinatario a establecer.
     */
    public void setTelDestinatario(int telDestinatario) {
        this.telDestinatario = telDestinatario;
    }
}
