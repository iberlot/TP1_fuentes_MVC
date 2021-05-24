package edu.usal.vista.paneles;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import edu.usal.controller.PAlumnosController;
import edu.usal.controller.PListadoAlumnosController;
import edu.usal.negocio.dominio.Alumno;
import edu.usal.vista.eventos.PAlumnosEvent;
import edu.usal.vista.eventos.PListadoAlumnosEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PListadoAlumnos extends JPanel {

	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private PListadoAlumnosEvent evento;

	private JPanel contentPane;
	private JTable tabla;
	private JScrollPane scroll;

	public static String[] getColumnNames() {
		return new String[] { "Nombre", "Apellido", "Pasatiempo", "Años Practica", "Soltero/a", "Editar", "Borrar" };
	}

	public static Object[][] getData() {
		return new Object[][] { { "Maria", "Campione", "Esquiar", new Integer(4), Boolean.FALSE, "Editar", "Borrar"  },
				{ "Lucas", "Hum", "Patinar", new Integer(10), Boolean.FALSE, "Editar", "Borrar" },
				{ "Carla", "Gonzales", "Escalar", new Integer(2), Boolean.FALSE, "Editar", "Borrar" },
				{ "Marcos", "Esposito", "Nadar", new Integer(8), Boolean.TRUE, "Editar", "Borrar" },
				{ "Angela", "Perez", "Correr", new Integer(1), Boolean.TRUE, "Editar", "Borrar" } };
	}


	/**
	 * Create the panel.
	 */
	public PListadoAlumnos() {
		this.evento = new PListadoAlumnosEvent(this);
		this.init();
	}

	private void init() {
		String[] columnNames = this.getColumnNames();
		Object[][] data = this.getData();
		this.tabla = new JTable(data, columnNames);

		setLayout(new BorderLayout(0, 0));

		JPanel pTitulo = new JPanel();
		add(pTitulo, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Formulario Alumnos");
		pTitulo.add(lblNewLabel);

		JPanel pFormulario = new JPanel();
		add(pFormulario, BorderLayout.CENTER);
		pFormulario.setLayout(new GridLayout(4, 2, 0, 0));

		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		pFormulario.add(this.tabla);

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
		alumno.setDni(Long.parseLong(this.txtDni.getText().trim()));
		return alumno;
	}

	public void setController(PListadoAlumnosController controller) {
		this.evento.setController(controller);
	}

}
