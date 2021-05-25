package edu.usal.vista.frame;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.usal.vista.eventos.FPrincipalEvent;

import java.awt.CardLayout;

public class FPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
	private JMenuBar barra;

	private JMenu mArchivo;
	private JMenu mEmpleados;
	private JMenu mAlumnos;
	private JMenu mClases;
	private JMenu mPabellon;
	private JMenu mCarrera;
	
//	private JMenuItem iPanel;
	private JMenuItem iSalir;
	private JMenuItem ialtaAlumnos;
	private JMenuItem iListarAlumnos;
	private JMenuItem iProfesores;
	private JMenuItem iMantenimiento;
	private JMenuItem iAdministrativos;
	private JMenuItem iListarClases;
	private JMenuItem iListarPabellones;
	private JMenuItem iListarCarreras;

	
	private FPrincipalEvent evento;
	
	public FPrincipal() {
		this.evento = new FPrincipalEvent(this);
		this.setTitle("Universitas");
		this.init();
	}
	
	private void init() {
		this.barra = new JMenuBar();
		
		this.mArchivo = new JMenu("Archivo");
		this.mAlumnos = new JMenu("Alumnos");
		this.mEmpleados = new JMenu("Empleados");
		this.mClases = new JMenu("Clases");
		this.mPabellon = new JMenu("Pabellones");
		this.mCarrera = new JMenu("Carreras");
		
		this.iSalir = new JMenuItem("Salir");
		this.ialtaAlumnos = new JMenuItem("Alta");
		this.iListarAlumnos = new JMenuItem("Listado");
		this.iProfesores = new JMenuItem("Profesores");
		this.iMantenimiento = new JMenuItem("Mantenimiento");
		this.iAdministrativos = new JMenuItem("Administrativos");
		this.iListarClases = new JMenuItem("Listado");
		this.iListarPabellones = new JMenuItem("Listado");
		this.iListarCarreras = new JMenuItem("Listado");

		this.mAlumnos.add(ialtaAlumnos);
		this.mAlumnos.add(iListarAlumnos);
		this.mArchivo.add(iSalir);
		this.mEmpleados.add(iProfesores);
		this.mEmpleados.add(iMantenimiento);
		this.mEmpleados.add(iAdministrativos);
		this.mClases.add(iListarClases);
		this.mPabellon.add(iListarPabellones);
		this.mCarrera.add(iListarCarreras);
		
		this.barra.add(mArchivo);
		this.barra.add(mAlumnos);
		this.barra.add(mEmpleados);
		this.barra.add(mClases);
		this.barra.add(mPabellon);
		this.barra.add(mCarrera);
		
		setJMenuBar(barra);	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));		

		
//		this.iPanel.addActionListener(this.evento);
		this.ialtaAlumnos.addActionListener(this.evento);
		this.iListarAlumnos.addActionListener(this.evento);
		this.iSalir.addActionListener(this.evento);

		this.iProfesores.addActionListener(this.evento);
		this.iMantenimiento.addActionListener(this.evento);
		this.iAdministrativos.addActionListener(this.evento);
		this.iListarClases.addActionListener(this.evento);
		this.iListarPabellones.addActionListener(this.evento);
		this.iListarCarreras.addActionListener(this.evento);
	}

//	public JMenuItem getiPanel() {
//		return iPanel;
//	}

	public JMenuItem getiSalir() {
		return iSalir;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	/**
	 * @return the ialtaAlumnos
	 */
	public JMenuItem getIaltaAlumnos() {
		return ialtaAlumnos;
	}

	/**
	 * @return the iListarAlumnos
	 */
	public JMenuItem getiListarAlumnos() {
		return iListarAlumnos;
	}

	/**
	 * @return the iProfesores
	 */
	public JMenuItem getiProfesores() {
		return iProfesores;
	}

	/**
	 * @return the iMantenimiento
	 */
	public JMenuItem getiMantenimiento() {
		return iMantenimiento;
	}

	/**
	 * @return the iAdministrativos
	 */
	public JMenuItem getiAdministrativos() {
		return iAdministrativos;
	}

	/**
	 * @return the iListarClases
	 */
	public JMenuItem getiListarClases() {
		return iListarClases;
	}

	/**
	 * @return the iListarPabellones
	 */
	public JMenuItem getiListarPabellones() {
		return iListarPabellones;
	}

	/**
	 * @return the iListarCarreras
	 */
	public JMenuItem getiListarCarreras() {
		return iListarCarreras;
	}		

}
