package Modelo;

public class Usuario {

	private int Id;
	private String Nombre;
	private String Apellido;
	private int Edad;
	private boolean Estado;

	public Usuario(int Id, String Nombre, String Apellido, int Edad, boolean Estado) {

		this.Id = Id;
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Edad = Edad;
		this.Estado = Estado;

	}

	public Usuario() {

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public boolean isEstado() {
		return Estado;
	}

	public void setEstado(boolean estado) {
		Estado = estado;
	}
	

}
