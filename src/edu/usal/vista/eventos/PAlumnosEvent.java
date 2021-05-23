package edu.usal.vista.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.usal.controller.PAlumnosController;
import edu.usal.vista.paneles.PAlumnos;

public class PAlumnosEvent implements ActionListener{
	
	private PAlumnos pAlumnos;
	private PAlumnosController controller;
	 
	public PAlumnosEvent(PAlumnos pAlumnos) {
		this.pAlumnos = pAlumnos;		
	}
	
	public void setController(PAlumnosController controller) {
		this.controller = controller;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(this.pAlumnos.getBtnAceptar())) {
			this.controller.addAlumno();
		}
		
	}

}
