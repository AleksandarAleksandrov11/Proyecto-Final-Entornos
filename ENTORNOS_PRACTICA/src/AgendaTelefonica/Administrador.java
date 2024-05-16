package AgendaTelefonica;

import java.util.Scanner;

public class Administrador extends Personas {

	Scanner sc= new Scanner(System.in);
	
	public Administrador(int telefono) {
		super(telefono);
	}
	
	public Administrador(int telefono, String nombre) {
		super(telefono,nombre);
	}
	
	public void verMensajesPorUsuario(Personas user) {
		

			System.out.println("Estos son los mensajes enviados por el usuario: "+user.getNombre());
			System.out.println(user.listaMensajesEnviados.toString());

			System.out.println("------------------------------------------");
			
			System.out.println("Estos son los mensajes recibidos por el usuario: "+user.getNombre());
			System.out.println(user.listaMensajesRecibidos.toString());

		
	}
	
	
}
