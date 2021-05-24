package edu.usal.vista.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.usal.vista.eventos.FPrincipalEvent;

import java.awt.CardLayout;

public class FPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar barra;

	private JMenu mArchivo;
	private JMenuItem iSalir;
	
	private JMenu mAlumnos;
//	private JMenuItem iPanel;
	private JMenuItem ialtaAlumnos;
	private JMenuItem iListarAlumnos;
	
	private FPrincipalEvent evento;
	
	public FPrincipal() {
		this.evento = new FPrincipalEvent(this);
		this.init();
	}
	
	private void init() {
		this.barra = new JMenuBar();
		
		this.mArchivo = new JMenu("Archivo");
		this.iSalir = new JMenuItem("Salir");

		this.mArchivo.add(iSalir);
		this.barra.add(mArchivo);
		
		
		this.mAlumnos = new JMenu("Alumnos");
//		this.iPanel = new JMenuItem("Panel");
		this.ialtaAlumnos = new JMenuItem("Alta");
		this.iListarAlumnos = new JMenuItem("Listado");

//		this.mAlumnos.add(iPanel);
		this.mAlumnos.add(ialtaAlumnos);
		this.mAlumnos.add(iListarAlumnos);
		
		this.barra.add(mAlumnos);
		
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

}
