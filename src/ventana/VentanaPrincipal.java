package ventana;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.EventController;

public class VentanaPrincipal extends JFrame {

	//Propiedades de la clase
	private JLabel n1, n2, total;
	private JTextField cajaTexto1, cajaTexto2;
	private JButton botonSumar, botonRestar, botonMultiplicar, botonDividir, botonRaiz2, botonRaiz3;
	private JPasswordField cajaContraseña;
	
	// Características de la ventana
	public VentanaPrincipal() {
		setSize (400,400);
		setLocationRelativeTo(null); // centra en pantalla
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
		setIconImage(Toolkit.getDefaultToolkit().getImage("img1.jpg"));
		setLayout(null);

		inicializarComponentes();

		setVisible(true);
	}
	
	private void inicializarComponentes() {
		n1 = new JLabel ("Numero 1");
		n1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		n1.setBounds(50,30,80,30);
		add(n1);
		
		n2 = new JLabel ("Numero 2");
		n2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		n2.setBounds(50,70,80,30);
		add(n2);
		
		cajaTexto1 = new JTextField();
		cajaTexto1.setBounds(120, 30, 100, 30);
		cajaTexto1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		add(cajaTexto1);
		
		cajaTexto2 = new JTextField();
		cajaTexto2.setBounds(120, 70, 100, 30);
		cajaTexto2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		add(cajaTexto2);
		
		cajaContraseña= new JPasswordField();
		cajaContraseña.setBounds(35, 10, 100, 30);
		cajaContraseña.setEchoChar('*');
//		add(cajaContraseña);
		
		
		botonSumar = new JButton("Sumar");
		botonSumar.setBounds(50, 110, 100, 30);
		botonSumar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		add(botonSumar);
		
		botonRestar = new JButton("Restar");
		botonRestar.setBounds(160, 110, 100, 30);
		botonRestar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		add(botonRestar);
		
		botonMultiplicar = new JButton("Multiplicar");
		botonMultiplicar.setBounds(50, 150, 100, 30);
		botonMultiplicar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		add(botonMultiplicar);
		
		botonDividir = new JButton("Dividir");
		botonDividir.setBounds(160, 150, 100, 30);
		botonDividir.setFont(new Font("Times New Roman", Font.BOLD, 12));
		add(botonDividir);
		
		botonRaiz2 = new JButton("Raiz 2");
		botonRaiz2.setBounds(50, 190, 100, 30);
		botonRaiz2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		add(botonRaiz2);
		
		botonRaiz3 = new JButton("Raiz 3");
		botonRaiz3.setBounds(160, 190, 100, 30);
		botonRaiz3.setFont(new Font("Times New Roman", Font.BOLD, 12));
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