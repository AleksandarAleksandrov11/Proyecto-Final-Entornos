package AgendaTelefonica;

/**
 * La clase Usuario representa a un usuario común en la agenda telefónica.
 * Hereda de la clase Personas.
 */
public class Usuario extends Personas {
    
    /**
     * Constructor para crear un usuario con el número de teléfono especificado.
     *
     * @param telefono El número de teléfono del usuario.
     */
    public Usuario(int telefono) {
        super(telefono);
    }

    /**
     * Constructor para crear un usuario con el número de teléfono y nombre especificados.
     *
     * @param telefono El número de teléfono del usuario.
     * @param nombre   El nombre del usuario.
     */
    public Usuario(int telefono, String nombre) {
        super(telefono, nombre);
    }
}