package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import ventana.VentanaPrincipal;

public class EventController implements ActionListener{
	
	private VentanaPrincipal ventana;
	private double n1, n2;
	
	public EventController(VentanaPrincipal ventana) {
		this.ventana = ventana;
	}
	
	// guardamos el input del usuario en variables numericas
	public void getUserInput() {
		n1 = Double.parseDouble(ventana.getN1().getText());
		n2 = Double.parseDouble(ventana.getN2().getText());
	}
	
	// vaciamos los campos numericos de la calculadora y le damos focus al numero 1
	public void resetAndFocus() {
		ventana.getN1().setText(null);
		ventana.getN2().setText(null);
		ventana.getN1().requestFocus();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			// SUMA
			if (e.getSource() == ventana.getBotonSumar()) {
				getUserInput();
				ventana.getTotal().setText(String.valueOf(n1 + n2));
			}
			// RESTA
			else if (e.getSource() == ventana.getBotonRestar()) {
				getUserInput();
				ventana.getTotal().setText(String.valueOf(n1 - n2));
			}
			//  MULTIPLICACION
			else if (e.getSource() == ventana.getBotonMultiplicar()) {
				getUserInput();
				ventana.getTotal().setText(String.valueOf(n1 * n2));
			}
			// DIVISION
			else if (e.getSource() == ventana.getBotonDividir()) {
				getUserInput();
				if(n2 != 0) {
					ventana.getTotal().setText(String.valueOf(Math.round((n1/n2)*100.0)/100.0));
				}
				else {
					JOptionPane.showMessageDialog(ventana, "Usa un numero distinto de 0", "Aviso", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			// R2
			else if (e.getSource() == ventana.getBotonRaiz2()) {
				getUserInput();
				JOptionPane.showMessageDialog(ventana, "No disponible","Error", JOptionPane.WARNING_MESSAGE);
			}
			// R3
			else if (e.getSource() == ventana.getBotonRaiz2()) {
				getUserInput();
				String password = JOptionPane.showInputDialog("Escribe la contraseña del root user");
				if(password.equals("root")) {
					String r3Answer = JOptionPane.showInputDialog("Inserte un número para calcular su raíz cúbica");
					double n3 = Double.parseDouble(r3Answer);
					ventana.getTotal().setText(
							String.valueOf(
									Math.round((Math.cbrt(n3)*100.0/100.0))
									)
							);
				}
				else {
					JOptionPane.showMessageDialog(ventana, "Pista: A Groot no le gusta esa respuesta");
				}
			}
			resetAndFocus();
		} catch (NumberFormatException e2) {
			JOptionPane.showMessageDialog(ventana, "Debes rellenar los campos con 2 numeros", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
}
