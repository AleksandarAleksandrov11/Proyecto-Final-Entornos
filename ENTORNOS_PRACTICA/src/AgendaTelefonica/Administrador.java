package AgendaTelefonica;

import java.util.Scanner;

/**
 * La clase Administrador representa a un usuario con privilegios de administrador en la agenda telefónica.
 * Hereda de la clase Personas.
 */
public class Administrador extends Personas {

    Scanner sc = new Scanner(System.in);

    /**
     * Constructor para crear un administrador con el número de teléfono especificado.
     *
     * @param telefono El número de teléfono del administrador.
     */
    public Administrador(int telefono) {
        super(telefono);
    }

    /**
     * Constructor para crear un administrador con el número de teléfono y nombre especificados.
     *
     * @param telefono El número de teléfono del administrador.
     * @param nombre   El nombre del administrador.
     */
    public Administrador(int telefono, String nombre) {
        super(telefono, nombre);
    }

    /**
     * Muestra los mensajes enviados y recibidos por un usuario específico.
     *
     * @param user El usuario del cual se quieren ver los mensajes.
     */
    public void verMensajesPorUsuario(Personas user) {
        System.out.println("Estos son los mensajes enviados por el usuario: " + user.getNombre());
        System.out.println(user.listaMensajesEnviados.toString());

        System.out.println("------------------------------------------");

        System.out.println("Estos son los mensajes recibidos por el usuario: " + user.getNombre());
        System.out.println(user.listaMensajesRecibidos.toString());
    }
}