package edu.usal.controller;

import javax.swing.JOptionPane;

import edu.usal.negocio.dao.AlumnoDAO;
import edu.usal.negocio.dominio.Alumno;
import edu.usal.vista.paneles.PListadoAlumnos;

public class PListadoAlumnosController {
	
	private PListadoAlumnos panel;
	private AlumnoDAO modelo;

	public PListadoAlumnosController(PListadoAlumnos panel, AlumnoDAO modelo) {
		this.panel = panel;
		this.modelo = modelo;
	}

	public PListadoAlumnos initPanel() {
		this.panel.setVisible(true);
		return this.panel;
	}
	
	public void addAlumno() {
		Alumno alumno = modelo.addAlumno(this.panel.getAlumno());
		JOptionPane.showMessageDialog(null, "Alumno ".concat(alumno.getNombre()).concat(" ").concat(alumno.getApellido())
				.concat(", dado de alta"));
		this.panel.getTxtNombre().setText("");
		this.panel.getTxtApellido().setText("");
		this.panel.getTxtDni().setText("");
	}
	
}
