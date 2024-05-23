package AgendaTelefonica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * La clase Personas representa a un usuario con su lista de contactos y mensajes.
 */
public class Personas {
    Scanner sc = new Scanner(System.in);
    private int telefono;
    private String nombre;

/**
* Creamos un arraylist para lista de contactos
*/
    public ArrayList<Personas> listaContactos = new ArrayList<Personas>();
/**
* Creamos un arraylist para lista de mensajes enviados
*/
    public ArrayList<Mensajes> listaMensajesEnviados = new ArrayList<Mensajes>();
/**
* Creamos un arraylist para lista de mensajes recividos
*/
    public ArrayList<Mensajes> listaMensajesRecibidos = new ArrayList<Mensajes>();

    /**
     * Constructor para crear una persona solo con el número de teléfono.
     *
     * @param telefono El número de teléfono de la persona.
     */
    public Personas(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Constructor para crear una persona con el número de teléfono y el nombre.
     *
     * @param telefono El número de teléfono de la persona.
     * @param nombre   El nombre de la persona.
     */
    public Personas(int telefono, String nombre) {
        this.telefono = telefono;
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de teléfono de la persona.
     *
     * @return El número de teléfono.
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono de la persona.
     *
     * @param telefono El número de teléfono a establecer.
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre El nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Envía un mensaje de texto a otro usuario.
     *
     * @param u     El remitente del mensaje.
     * @param num   El número de teléfono del destinatario.
     * @param testo El contenido del mensaje de texto.
     */
    public void enviarMensajeTexto(Personas u, int num, String testo) {
        u.listaMensajesEnviados.add(new Texto(u.getTelefono(), num, testo));
    }

    /**
     * Envía un mensaje multimedia a otro usuario.
     *
     * @param u       El remitente del mensaje.
     * @param num     El número de teléfono del destinatario.
     * @param fichero El nombre del archivo multimedia.
     * @param tamano  El tamaño del archivo multimedia.
     */
    public void enviarMensajeMultimedia(Personas u, int num, String fichero, int tamano) {
        u.listaMensajesEnviados.add(new Multimedia(u.getTelefono(), num, fichero, tamano));
    }

    /**
     * Muestra los mensajes enviados por el usuario.
     */
    public void verMensajesEnviados() {
        System.out.println("Mensajes enviados");
        for (int i = 0; i < listaMensajesEnviados.size(); i++) {
            System.out.println(listaMensajesEnviados.get(i).toString());
        }
    }

    /**
     * Muestra los mensajes recibidos por el usuario.
     */
    public void verMensajesRecibidos() {
        System.out.println("Mensajes recibidos");
        for (int i = 0; i < listaMensajesRecibidos.size(); i++) {
            System.out.println(listaMensajesRecibidos.get(i));
        }
    }
}