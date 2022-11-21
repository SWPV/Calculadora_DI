package main;

import controller.EventController;
import ventana.VentanaPrincipal;

public class Main {

	public static void main(String[] args) {
		VentanaPrincipal v = new VentanaPrincipal();
		EventController controlador = new EventController(v);
		
		v.activaController(controlador);
	}
}
