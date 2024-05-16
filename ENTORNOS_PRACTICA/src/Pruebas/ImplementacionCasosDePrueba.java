package Pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

import AgendaTelefonica.Administrador;
import AgendaTelefonica.Contactos;
import AgendaTelefonica.Personas;
import AgendaTelefonica.Usuario;


public class ImplementacionCasosDePrueba {
	
	//Verificar que el telefono se añade correctamente
	@Test
	public void testGetTelefono() {
		
		Personas u1 = new Usuario(615615615);
		Personas a = new Administrador(121212121);
		
		assertEquals(615615615,u1.getTelefono());
		assertEquals(121212121,a.getTelefono());
		
		
		
	}
	
	//Verificar que los mensajes de texto se envian correctamente
	@Test
	public void testEnviarMensajeTexto() {
		
		Personas u1 = new Usuario(615615615);
		Personas u2 = new Usuario(121212121);
		
		u1.enviarMensajeTexto(u1, 121212121, "Hola,prueba");
		
		assertEquals(1,u1.listaMensajesEnviados.size());
		
	}
	
	//Verificar que los mensajes de texto se envian correctamente
	@Test
	public void testEnviarMensajeMultimedia() {
		
		Personas u1 = new Usuario(615615615);
		Personas u2 = new Usuario(121212121);
		
		u1.enviarMensajeMultimedia(u1, 121212121, "fichero.txt",1024);
		
		assertEquals(1,u1.listaMensajesEnviados.size());
		
	}
	
	//Test para verificar que se reciben los mensajes correctamente
	@Test
	public void testRecibirMensaje() {
		
		Personas u1 = new Usuario(615615615);
		Personas u2 = new Usuario(121212121);
		
		u1.enviarMensajeTexto(u1, 121212121, "Hola,prueba");
		u2.listaMensajesRecibidos.add(u1.listaMensajesEnviados.get(0));
		
		
		assertEquals(1,u1.listaMensajesEnviados.size());
		assertTrue(u2.listaMensajesRecibidos.get(0).equals(u1.listaMensajesEnviados.get(0)));
	}
	
	//Verificar que el nombre se añade correctamente
	@Test
	public void testGetNombre() {
		
		Personas u1 = new Usuario(615615615,"Pepe");
		Personas a = new Administrador(121212121,"Mario");
		
		assertEquals("Pepe",u1.getNombre());
		assertEquals("Mario",a.getNombre());
		
		
		
	}
	
	//Verificar que se pueden añadir contactos
	@Test
	public void testAñadirContacto() {
		
		Contactos c = new Contactos();
		Personas u1 = new Usuario(615615615);
		Personas u2 = new Usuario(121212121);
		
		c.añadirContacto(u1, u2);
		
		assertEquals(1,u1.listaContactos.size());
		
	}
	
	//Verificar que se eliminan contactos
	@Test
	public void testEliminarContacto() {
		
		Contactos c = new Contactos();
		Personas u1 = new Usuario(615615615);
		Personas u2 = new Usuario(121212121);
		
		c.añadirContacto(u1, u2);
		c.eliminarContacto(u1, 121212121);
		
		assertEquals(0,u1.listaContactos.size());
		
	}
	
	
	
	
	
	
}
