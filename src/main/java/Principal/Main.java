package Principal;

import javax.swing.SwingUtilities;

import Vista.VstCrear;
import Vista.VstUsuario;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				VstUsuario ventana = new VstUsuario();
				ventana.setVisible(true);
				ventana.Interfaz();
			}

		});

	}

	public void crear() {
		VstUsuario vista = new VstUsuario();
		vista.InterfazCrear();
	}
}
