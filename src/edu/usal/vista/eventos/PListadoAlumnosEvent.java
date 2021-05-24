package edu.usal.vista.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.usal.controller.PAlumnosController;
import edu.usal.controller.PListadoAlumnosController;
import edu.usal.vista.paneles.PListadoAlumnos;

public class PListadoAlumnosEvent implements ActionListener{
	
	private PListadoAlumnos pAlumnos;
	private PListadoAlumnosController controller;
	 
	public PListadoAlumnosEvent(PListadoAlumnos pAlumnos) {
		this.pAlumnos = pAlumnos;		
	}
	
	public void setController(PListadoAlumnosController controller) {
		this.controller = controller;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(this.pAlumnos.getBtnAceptar())) {
			this.controller.addAlumno();
		}
		
	}

}
