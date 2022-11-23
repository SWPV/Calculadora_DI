package ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.EventController;

public class VentanaPrincipal extends JFrame {

	//Propiedades de la clase
	private JLabel n1, n2, total;
	private JTextField cajaTexto1, cajaTexto2;
	private JButton botonSumar, botonRestar, botonMultiplicar, botonDividir, botonRaiz2, botonRaiz3;
	private JPasswordField cajaContraseña;
	private JMenuItem imagen;
	
	
	// Características de la ventana
	public VentanaPrincipal() {
		setSize (500,500);
		setLocationRelativeTo(null); // centra en pantalla
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
		setIconImage(Toolkit.getDefaultToolkit().getImage("img1.jpg"));
		setLayout(null);
	//	setContentPane(imagen);
		setResizable(false);

		inicializarComponentes();

		setVisible(true);
	}

	private void inicializarComponentes() {
		n1 = new JLabel ("Numero 1: ");
		n1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		n1.setBounds(90,30,80,30);
		n1.setForeground(new Color (0,0,255));
		add(n1);
		
		n2 = new JLabel ("Numero 2: ");
		n2.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		n2.setBounds(90,70,80,30);
		n2.setForeground(new Color (0,0,255));
		add(n2);
		
		imagen = new JMenuItem(new ImageIcon("img2.jpg"));
		imagen.setBounds(200,300,100,133);
		imagen.setOpaque(false);
		add(imagen);
		
		cajaTexto1 = new JTextField();
		cajaTexto1.setBounds(160, 30, 100, 30);
		cajaTexto1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		add(cajaTexto1);
		
		cajaTexto2 = new JTextField();
		cajaTexto2.setBounds(160, 70, 100, 30);
		cajaTexto2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		add(cajaTexto2);
		
		cajaContraseña= new JPasswordField();
		cajaContraseña.setBounds(35, 10, 100, 30);
		cajaContraseña.setEchoChar('*');
//		add(cajaContraseña);
		
		
		botonSumar = new JButton("Sumar");
		botonSumar.setBounds(50, 130, 100, 40);
		botonSumar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		botonSumar.setBackground(new Color (0,170,255));
		add(botonSumar);
		
		botonRestar = new JButton("Restar");
		botonRestar.setBounds(160, 130, 100, 40);
		botonRestar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		botonRestar.setBackground(new Color (255,255,255));
		add(botonRestar);
		
		botonMultiplicar = new JButton("Multiplicar");
		botonMultiplicar.setBounds(270, 130, 100, 40);
		botonMultiplicar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		botonMultiplicar.setBackground(new Color (0,170,255));
		add(botonMultiplicar);
		
		botonDividir = new JButton("Dividir");
		botonDividir.setBounds(50, 180, 100, 40);
		botonDividir.setFont(new Font("Times New Roman", Font.BOLD, 12));
		botonDividir.setBackground(new Color (255,255,255));
		add(botonDividir);
		
		botonRaiz2 = new JButton("Raiz 2");
		botonRaiz2.setBounds(160, 180, 100, 40);
		botonRaiz2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		botonRaiz2.setBackground(new Color (0,170,255));
		add(botonRaiz2);
		
		botonRaiz3 = new JButton("Raiz 3");
		botonRaiz3.setBounds(270, 180, 100, 40);
		botonRaiz3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		botonRaiz3.setBackground(new Color (255,255,255));
		add(botonRaiz3);
		
		total = new JLabel ("Resultado: ");
		total.setFont(new Font("Times New Roman", Font.BOLD, 14));
		total.setBounds(50,240,80,30);
		add(total);
	}
	
	public void activaController(EventController control) {
		botonDividir.addActionListener(control);
		botonSumar.addActionListener(control);
		botonRestar.addActionListener(control);
		botonMultiplicar.addActionListener(control);
		botonRaiz2.addActionListener(control);
		botonRaiz3.addActionListener(control);
	}

	// Getters
	public JLabel getN1() {
		return n1;
	}

	public JLabel getN2() {
		return n2;
	}

	public JLabel getTotal() {
		return total;
	}

	public JTextField getCajaTexto1() {
		return cajaTexto1;
	}

	public JTextField getCajaTexto2() {
		return cajaTexto2;
	}

	public JButton getBotonSumar() {
		return botonSumar;
	}

	public JButton getBotonRestar() {
		return botonRestar;
	}

	public JButton getBotonMultiplicar() {
		return botonMultiplicar;
	}

	public JButton getBotonDividir() {
		return botonDividir;
	}

	public JButton getBotonRaiz2() {
		return botonRaiz2;
	}

	public JButton getBotonRaiz3() {
		return botonRaiz3;
	}
}