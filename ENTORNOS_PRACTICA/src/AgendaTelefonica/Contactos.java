package AgendaTelefonica;

import java.util.Scanner;

public class Contactos {

	Scanner sc=new Scanner(System.in);
	
	private int telefono;
	private String nombre;
	

	public void añadirContacto(Personas u,Personas u2) {
		
			telefono = u2.getTelefono();
			nombre = u2.getNombre();
			u.listaContactos.add(new Personas(telefono,nombre));
			System.out.println("Contacto añadido correctamente a la lista de "+u.getNombre());
		
		
	}
	
	public void eliminarContacto(Personas u,int telefono) {
		

			boolean noexiste = false;
			for (int i = 0; i < u.listaContactos.size(); i++) {
				if (telefono == u.listaContactos.get(i).getTelefono()) {
					u.listaContactos.remove(i);
					System.out.println("Se ha eliminado un contacto de a lista de contactos de "+u.getNombre());
					break;
				}
			}
			
		
	}
		
	public void verContactos(Personas u) {
		
		System.out.println();
		System.out.println("LISTA DE CONTACTOS DEL TITULAR DEL TELEFONO: "+ u.getTelefono());
		
		for (int i = 0; i < u.listaContactos.size(); i++) {
			
			System.out.println("Nombre: "+u.listaContactos.get(i).getNombre() +" Tel: " +u.listaContactos.get(i).getTelefono() );
			
		}
		
	}
	
}
