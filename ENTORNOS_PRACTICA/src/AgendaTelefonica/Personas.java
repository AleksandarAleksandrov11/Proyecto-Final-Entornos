package AgendaTelefonica;

import java.util.ArrayList;
import java.util.Scanner;

public class Personas {
	Scanner sc = new Scanner(System.in);
	private int telefono;
	private String nombre;
	
	public ArrayList<Personas> listaContactos = new ArrayList<Personas>(); 
	public ArrayList<Mensajes> listaMensajesEnviados = new ArrayList<Mensajes>(); 
	public ArrayList<Mensajes> listaMensajesRecibidos = new ArrayList<Mensajes>();
	
	public Personas(int telefono) {
		this.telefono=telefono;
	}
	
	public Personas(int telefono,String nombre) {
		this.telefono=telefono;
		this.nombre=nombre;
	}
	
	
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void enviarMensajeTexto(Personas u,int num,String testo) {
			
			u.listaMensajesEnviados.add(new Texto(u.getTelefono(),num,testo));
			
	}
		
	public void enviarMensajeMultimedia(Personas u,int num,String fichero,int tamaño) {
		
		u.listaMensajesEnviados.add(new Multimedia(u.getTelefono(),num,fichero,tamaño));
	
	}
	

	public void verMensajesEnviados() {
		

			System.out.println("Mensajes enviados");
			for (int i = 0; i < listaMensajesEnviados.size(); i++) {
				System.out.println(listaMensajesEnviados.get(i).toString());
			}
		
	}
	
	public void verMensajesRecibidos() {
		System.out.println("Mensajes recibidos");
		for (int i = 0; i < listaMensajesRecibidos.size(); i++) {
			System.out.println(listaMensajesRecibidos.get(i));
		}
	}
	
	
}
