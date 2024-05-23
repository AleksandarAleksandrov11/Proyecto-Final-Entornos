package AgendaTelefonica;

/**
 * La clase Multimedia representa un mensaje multimedia que puede ser enviado entre usuarios.
 * Extiende la clase base Mensajes.
 */
public class Multimedia extends Mensajes {

    private String nombreFichero;
    private int tamano;

    /**
     * Constructor para crear un mensaje multimedia con los detalles proporcionados.
     *
     * @param telRemitente    El número de teléfono del remitente del mensaje.
     * @param telDestinatario El número de teléfono del destinatario del mensaje.
     * @param nombreFichero   El nombre del archivo multimedia.
     * @param tamano          El tamaño del archivo multimedia en MB.
     */
    public Multimedia(int telRemitente, int telDestinatario, String nombreFichero, int tamano) {
        super.setTelRemitente(telRemitente);
        super.setTelDestinatario(telDestinatario);
        this.nombreFichero = nombreFichero;
        this.tamano = tamano;
    }

    /**
     * Obtiene el nombre del archivo multimedia.
     *
     * @return El nombre del archivo multimedia.
     */
    public String getNombreFichero() {
        return nombreFichero;
    }

    /**
     * Establece el nombre del archivo multimedia.
     *
     * @param nombreFichero El nombre del archivo multimedia a establecer.
     */
    public void setNombreFichero(String nombreFichero) {
        this.nombreFichero = nombreFichero;
    }

    /**
     * Obtiene el tamaño del archivo multimedia en MB.
     *
     * @return El tamaño del archivo multimedia en MB.
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * Establece el tamaño del archivo multimedia en MB.
     *
     * @param tamano El tamaño del archivo multimedia en MB a establecer.
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    /**
     * Devuelve una representación en cadena del mensaje multimedia.
     *
     * @return Una cadena que contiene el nombre del archivo y su tamaño.
     */
    @Override
    public String toString() {
        return "Nombre del mensaje multimedia: " + nombreFichero + ", tamaño= " + tamano + "MB";
    }
}