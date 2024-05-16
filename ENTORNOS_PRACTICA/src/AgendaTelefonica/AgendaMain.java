package AgendaTelefonica;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaMain {

	public static void main(String[] args) {
		
	Contactos c = new Contactos();
	Scanner sc = new Scanner(System.in);
	int respuesta=0;
	ArrayList<Personas> usuarios = new ArrayList<Personas>();
	String tipouser="";
	
	System.out.println();
	
	Personas u1 = new Usuario(111111111,"Pepe");
	Personas u2 = new Usuario(222222222,"Marcos");
	Personas u3 = new Usuario(333333333,"Antonio");
	Administrador a1 = new Administrador(444444444,"Miguel");
					
	c.añadirContacto(u1,u2);
	c.añadirContacto(u1,u3);
	
	System.out.println("-----------------------------------------------------------------");
	c.verContactos(u1);
	System.out.println("-----------------------------------------------------------------");
	System.out.println();
	c.eliminarContacto(u1, 333333333);
	c.verContactos(u1);
	System.out.println("-----------------------------------------------------------------");
	
	u1.enviarMensajeTexto(u1, 222222222, "¿Hola que tal?");
	u1.enviarMensajeMultimedia(u1, 222222222, "texto1.txt", 1024);
	u2.listaMensajesRecibidos.add(u1.listaMensajesEnviados.get(0));
	u2.listaMensajesRecibidos.add(u1.listaMensajesEnviados.get(1));
	
	System.out.println("-----------------------------------------------------------------");
	
	u1.verMensajesEnviados();
	
	System.out.println("-----------------------------------------------------------------");
	
	u2.verMensajesRecibidos();
	
	System.out.println("-----------------------------------------------------------------");
	
	a1.verMensajesPorUsuario(u1);
	
	}
}
