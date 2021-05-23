package edu.usal.vista.paneles;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import edu.usal.controller.PAlumnosController;
import edu.usal.negocio.dominio.Alumno;
import edu.usal.vista.eventos.PAlumnosEvent;

import javax.swing.JButton;

public class PAlumnos extends JPanel {
	
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private PAlumnosEvent evento;

	/**
	 * Create the panel.
	 */
	public PAlumnos() {
		this.evento = new PAlumnosEvent(this);		
		this.init();		
	}

	private void init() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pTitulo = new JPanel();
		add(pTitulo, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Formulario Alumnos");
		pTitulo.add(lblNewLabel);
		
		JPanel pFormulario = new JPanel();
		add(pFormulario, BorderLayout.CENTER);
		pFormulario.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		pFormulario.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		pFormulario.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido:");
		pFormulario.add(lblNewLabel_2);
		
		txtApellido = new JTextField();
		pFormulario.add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("DNI:");
		pFormulario.add(lblNewLabel_3);
		
		txtDni = new JTextField();
		pFormulario.add(txtDni);
		txtDni.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		pFormulario.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		pFormulario.add(btnCancelar);
		
		btnAceptar.addActionListener(this.evento);
		
	}
	
	

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public JTextField getTxtDni() {
		return txtDni;
	}

	public JButton getBtnAceptar() {
		return btnAceptar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public Alumno getAlumno() {
		Alumno alumno = new Alumno();
		alumno.setNombre(this.txtNombre.getText().trim());
		alumno.setApellido(this.txtApellido.getText().trim());
		alumno.setDni(this.txtDni.getText().trim());
		return alumno;
	}

	public void setController(PAlumnosController controller) {
		this.evento.setController(controller);		
	}

}
