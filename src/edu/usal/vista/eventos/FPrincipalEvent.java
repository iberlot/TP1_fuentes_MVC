package edu.usal.vista.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import edu.usal.controller.PAlumnosController;
import edu.usal.controller.PListadoAlumnosController;
import edu.usal.negocio.dao.AlumnoDAO;
import edu.usal.negocio.factory.AlumnoFactory;
import edu.usal.vista.frame.FPrincipal;
import edu.usal.vista.paneles.PAlumnos;
import edu.usal.vista.paneles.PListadoAlumnos;

public class FPrincipalEvent implements ActionListener {
	
	private FPrincipal principal;
	
	public FPrincipalEvent(FPrincipal principal) {
		this.principal = principal;
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(this.principal.getiSalir())){
			int opcion = JOptionPane.showConfirmDialog(this.principal, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
			if(opcion == 0) {
				System.exit(0);
			}
		} else if(e.getSource().equals(this.principal.getIaltaAlumnos())) {
			AlumnoDAO modelo = AlumnoFactory.getAlumnoDAO("");
			PAlumnos panel = new PAlumnos();
			
			PAlumnosController controller = new PAlumnosController(panel, modelo);
			panel.setController(controller);
			
			this.principal.getContentPane().add(controller.initPanel());			
			this.principal.validate();
		}
		else if(e.getSource().equals(this.principal.getiListarAlumnos())) {
			AlumnoDAO modelo = AlumnoFactory.getAlumnoDAO("");
			PListadoAlumnos panel = new PListadoAlumnos();
			
			PListadoAlumnosController controller = new PListadoAlumnosController(panel, modelo);
			panel.setController(controller);
			
			this.principal.getContentPane().add(controller.initPanel());			
			this.principal.validate();
		}
//		else if(e.getSource().equals(this.principal.getiPanel())) {
//			AlumnoDAO modelo = AlumnoFactory.getAlumnoDAO("");
//			PAlumnos panel = new PAlumnos();
//			
//			PAlumnosController controller = new PAlumnosController(panel, modelo);
//			panel.setController(controller);
//			
//			this.principal.getContentPane().add(controller.initPanel());			
//			this.principal.validate();
//		}
	}

}
