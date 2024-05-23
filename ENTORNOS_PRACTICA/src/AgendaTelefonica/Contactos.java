package AgendaTelefonica;

import java.util.Scanner;

/**
 * La clase Contactos permite añadir, eliminar y visualizar contactos en una agenda telefónica.
 */
public class Contactos {

    Scanner sc = new Scanner(System.in);

    private int telefono;
    private String nombre;

    /**
     * Añade un nuevo contacto a la lista de contactos de un usuario.
     *
     * @param u  El usuario que añade el contacto.
     * @param u2 El contacto a añadir.
     */
    public void anadirContacto(Personas u, Personas u2) {
        telefono = u2.getTelefono();
        nombre = u2.getNombre();
        u.listaContactos.add(new Personas(telefono, nombre));
        System.out.println("Contacto añadido correctamente a la lista de " + u.getNombre());
    }

    /**
     * Elimina un contacto de la lista de contactos de un usuario según su número de teléfono.
     *
     * @param u        El usuario que elimina el contacto.
     * @param telefono El número de teléfono del contacto a eliminar.
     */
    public void eliminarContacto(Personas u, int telefono) {
        for (int i = 0; i < u.listaContactos.size(); i++) {
            if (telefono == u.listaContactos.get(i).getTelefono()) {
                u.listaContactos.remove(i);
                System.out.println("Se ha eliminado un contacto de la lista de contactos de " + u.getNombre());
                break;
            }
        }
    }

    /**
     * Muestra todos los contactos de la lista de contactos de un usuario.
     *
     * @param u El usuario cuyos contactos se van a visualizar.
     */
    public void verContactos(Personas u) {
        System.out.println();
        System.out.println("LISTA DE CONTACTOS DEL TITULAR DEL TELEFONO: " + u.getTelefono());
        for (int i = 0; i < u.listaContactos.size(); i++) {
            System.out.println("Nombre: " + u.listaContactos.get(i).getNombre() + " Tel: " + u.listaContactos.get(i).getTelefono());
        }
    }
}
