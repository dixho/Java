package controlador;

import vista.*;
import modelo.*;

public class CoVentana {

	Modelo xmodelo = new Modelo();
	Ventana window = new Ventana(xmodelo);
	
	public CoVentana() {
		window.setSize(250, 550);
		window.setVisible(true);
	}
	
}
