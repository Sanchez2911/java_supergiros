package Vista;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.table.DefaultTableModel;

import Principal.Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VstUsuario extends JFrame {
	public DefaultTableModel mdlTabla;
	private JTable tblUsuarios;
	private JButton btnCrear;
	private JButton btnModificar;
	private JButton btnEliminar;
	JPanel pnlTabla = new JPanel();
	JPanel pnlBotones = new JPanel();
//----------------------------------------------------Interfaz para gestionar usuarios--------------------------------------------------------------------	
	public void Interfaz() {

		setTitle("Prueba Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 450);
		setLocationRelativeTo(null);

		mdlTabla = new DefaultTableModel();
		tblUsuarios = new JTable(mdlTabla);
		mdlTabla.addColumn("Nombre");
		mdlTabla.addColumn("Apellido");
		mdlTabla.addColumn("Edad");
		
		btnCrear = new JButton("CREAR");
		btnModificar = new JButton("ACTUALIZAR");
		btnEliminar = new JButton("ELIMINAR");

		
		pnlTabla.setLayout(new BorderLayout());
		pnlTabla.add(new JScrollPane(tblUsuarios), BorderLayout.CENTER);

		
		pnlBotones.add(btnCrear);
		pnlBotones.add(btnModificar);
		pnlBotones.add(btnEliminar);
		pnlTabla.add(pnlBotones, BorderLayout.SOUTH);

		add(pnlTabla);

		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlTabla.setVisible(false);
				pnlBotones.setVisible(false);
				InterfazCrear();
			}
		});

		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
	}
//----------------------------------------------------Interfaz para crear usuarios----------------------------------------------------------------------	
	
	JPanel pnlNombre = new JPanel();
	JPanel pnlApellido = new JPanel();
	JPanel pnlEdad = new JPanel();
	JPanel pnlBoton = new JPanel();
	JPanel pnlFormularioCrear = new JPanel();
	public JTextField Nombre = new JTextField();
	public JTextField Apellido = new JTextField();
	public JTextField Edad = new JTextField();
	private JButton btnRegistrar;
	
	public void InterfazCrear() {
		JLabel lblNombre = new JLabel("Nombre:");
		JLabel lblApellido = new JLabel("Apellido:");
		JLabel lblEdad = new JLabel("Edad:");
		
		
		Nombre.setPreferredSize(new DimensionUIResource(200, 20));
		Apellido.setPreferredSize(new DimensionUIResource(200, 20));
		Edad.setPreferredSize(new DimensionUIResource(200, 20));
		Edad.setBounds(5,5,5,5);
		pnlNombre.add(lblNombre);
		pnlNombre.add(Nombre);
		pnlNombre.setPreferredSize(new DimensionUIResource(200, 100));
		pnlApellido.add(lblApellido);
		pnlApellido.add(Apellido);
		pnlApellido.setPreferredSize(new DimensionUIResource(200, 100));
		pnlEdad.add(lblEdad);
		pnlEdad.add(Edad);
		pnlEdad.setPreferredSize(new DimensionUIResource(200, 100));
		
		pnlBoton.setPreferredSize(new DimensionUIResource(500, 50));
		pnlFormularioCrear.add(pnlNombre);
		pnlFormularioCrear.add(pnlApellido);
		pnlFormularioCrear.add(pnlEdad);
		pnlFormularioCrear.add(pnlBoton);
		add(pnlFormularioCrear);
		
		btnRegistrar = new JButton("Crear Usuario");
		pnlBoton.add(btnRegistrar);
		
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
	}	
	}
