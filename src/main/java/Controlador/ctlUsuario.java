package Controlador;

import Conexion.Conexion;
import Modelo.Usuario;
import Vista.VstUsuario;

public class ctlUsuario {
	
	Usuario modelo = new Usuario();
	Conexion conectar = new Conexion();
	VstUsuario vista = new VstUsuario();
	
	
	public void crearUsuario () {
		modelo.setNombre(vista.Nombre.getText());
		modelo.setApellido(vista.Apellido.getText());
		modelo.setEdad(Integer.valueOf(vista.Apellido.getText()));
		
		conectar.Insertar(modelo.getNombre(), modelo.getApellido(), modelo.getEdad());
	}
	
	public void DeleteUsuario(int id) {
		conectar.Eliminar(id-1);
	}
	
	public void UpdateUsuario(int id) {
		
		conectar.Modificar(id, modelo.getNombre(),  modelo.getApellido(), modelo.getEdad());
	}
	
	public void mostrar() { 
		vista.mdlTabla.addRow(new String[] {
			//quedo en este punto necesito añadir filas con nombre apellido y edad	
		});;
	}

}
