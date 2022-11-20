package ventana;

import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {
	
	//Propiedades de la clase 
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JLabel etiqueta3;
	private JTextField cajaTexto1;
	private JTextField cajaTexto2;
	private JButton botonSumar;
	private JButton botonRestar;
	private JButton botonMultiplicar;
	private JButton botonDividir;
	private JButton botonRaiz2;
	private JButton botonRaiz3;
	
	// Características de la ventana
	public VentanaPrincipal() {
		setSize (400,400);
		setLocationRelativeTo(null); // centra en pantalla
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");		
		setIconImage(Toolkit.getDefaultToolkit().getImage("img1.jpg"));
		inicializarComponentes();
		setLayout(null);
		setVisible(true);
		
	}
	
	private void inicializarComponentes() {
		etiqueta1 = new JLabel ("Numero 1");
		etiqueta1.setBounds(50,30,80,30);
		add(etiqueta1);
		
		etiqueta2 = new JLabel ("Numero 2");
		etiqueta2.setBounds(50,70,80,30);
		add(etiqueta2);
		
		cajaTexto1 = new JTextField();
		cajaTexto1.setBounds(110, 30, 100, 30);
		add(cajaTexto1);
		
		cajaTexto2 = new JTextField();
		cajaTexto2.setBounds(110, 70, 100, 30);
		add(cajaTexto2);
		
		botonSumar = new JButton("Sumar");
		botonSumar.setBounds(50, 110, 100, 30);
		add(botonSumar);
		
		botonRestar = new JButton("Restar");
		botonRestar.setBounds(160, 110, 100, 30);
		add(botonRestar);
		
		botonMultiplicar = new JButton("Multiplicar");
		botonMultiplicar.setBounds(50, 150, 100, 30);
		add(botonMultiplicar);
		
		botonDividir = new JButton("Dividir");
		botonDividir.setBounds(160, 150, 100, 30);
		add(botonDividir);
		
		botonRaiz2 = new JButton("Raiz 2");
		botonRaiz2.setBounds(50, 190, 100, 30);
		add(botonRaiz2);
		
		botonRaiz3 = new JButton("Raiz 3");
		botonRaiz3.setBounds(160, 190, 100, 30);
		add(botonRaiz3);
		
		etiqueta3 = new JLabel ("Resultado: ");
		etiqueta3.setBounds(50,240,80,30);
		add(etiqueta3);
		
	}
}