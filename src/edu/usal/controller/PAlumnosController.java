package edu.usal.controller;

import javax.swing.JOptionPane;

import edu.usal.negocio.dao.AlumnoDAO;
import edu.usal.negocio.dominio.Alumno;
import edu.usal.vista.paneles.PAlumnos;

public class PAlumnosController {
	
	private PAlumnos panel;
	private AlumnoDAO modelo;

	public PAlumnosController(PAlumnos panel, AlumnoDAO modelo) {
		this.panel = panel;
		this.modelo = modelo;
	}

	public PAlumnos initPanel() {
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
