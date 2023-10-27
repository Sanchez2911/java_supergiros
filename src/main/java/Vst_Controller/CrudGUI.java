package Vst_Controller;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import Modelo.Usuario;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class CrudGUI {
    private JFrame frame;
    private JTable table;
    private DefaultTableModel tableModel;
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    private JTextField nombreField;
    private JTextField apellidoField;
    private JTextField edadField;
    private JButton addButton;
    private JButton updateButton;
    private JButton deleteButton;

    public CrudGUI() {
        frame = new JFrame("Aplicación CRUD de Usuarios");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Apellido");
        tableModel.addColumn("Edad");

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        nombreField = new JTextField(15);
        apellidoField = new JTextField(15);
        edadField = new JTextField(5);
        addButton = new JButton("Agregar");
        updateButton = new JButton("Actualizar");
        deleteButton = new JButton("Eliminar");

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                String apellido = apellidoField.getText();
                int edad = Integer.parseInt(edadField.getText());
                Usuario usuario = new Usuario(nombre, apellido, edad);
                usuarios.add(usuario);
                agregarUsuarioATabla(usuario);
                limpiarCampos();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    String nombre = nombreField.getText();
                    String apellido = apellidoField.getText();
                    int edad = Integer.parseInt(edadField.getText());
                    Usuario usuario = usuarios.get(selectedRow);
                    usuario.setNombre(nombre);
                    usuario.setApellido(apellido);
                    usuario.setEdad(edad);

                    actualizarTabla();
                    limpiarCampos();
                }
            }
        });
        
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    Usuario usuario = usuarios.get(selectedRow);
                    nombreField.setText(usuario.getNombre());
                    apellidoField.setText(usuario.getApellido());
                    edadField.setText(String.valueOf(usuario.getEdad()));
                }
            }
        });


        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    usuarios.remove(selectedRow);
                    eliminarUsuarioDeTabla(selectedRow);
                    limpiarCampos();
                }
            }
        });

        panel.add(new JLabel("Nombre:"));
        panel.add(nombreField);
        panel.add(new JLabel("Apellido:"));
        panel.add(apellidoField);
        panel.add(new JLabel("Edad:"));
        panel.add(edadField);
        panel.add(addButton);
        panel.add(updateButton);
        panel.add(deleteButton);
        frame.add(panel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void agregarUsuarioATabla(Usuario usuario) {
        Vector<String> row = new Vector<String>();
        row.add(usuario.getNombre());
        row.add(usuario.getApellido());
        row.add(String.valueOf(usuario.getEdad()));
        tableModel.addRow(row);
    }

    private void actualizarTabla() {
        tableModel.setRowCount(0);
        for (Usuario usuario : usuarios) {
            agregarUsuarioATabla(usuario);
        }
    }

    private void eliminarUsuarioDeTabla(int rowIndex) {
        tableModel.removeRow(rowIndex);
    }

    private void limpiarCampos() {
        table.clearSelection();
        nombreField.setText("");
        apellidoField.setText("");
        edadField.setText("");
    }

}