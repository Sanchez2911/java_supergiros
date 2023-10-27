package Conexion;

import java.util.ArrayList;

import Modelo.Usuario;

public class Conexion {
	//Debido a que no se puede usar conexion en localhost porque no se tiene XAMPP o un servidor que pueda usar local por temas de seguridad
	//usare un arreglo para almacenar la informacion y asi mismo mostrarla, eliminarla o editarla.
	
	public ArrayList<Usuario> bd = new ArrayList<Usuario>();
	
	int id = 0;
	
	public void Insertar (String Nombre, String Apellido, int Edad) {
		id++;
		boolean Estado = true;
		bd.add(new Usuario(id ,Nombre, Apellido, Edad, Estado));
	}
	
	public void Eliminar (int id) {
		bd.remove(id);
	}
	
	
	  public void Modificar (int id, String Nombre, String Apellido, int Edad) { 
		  for (Usuario usuarios : bd) {
			if(usuarios.getId() - 1 == id) {
				usuarios.setNombre(Nombre);
				usuarios.setApellido(Apellido);
				usuarios.setEdad(Edad);
			}
		}
	  
	  }
	  
	
	public ArrayList Consultar () {
		return bd;
	}
}
