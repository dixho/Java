package Game;

import Personal.*;
/**
*
* @author Dixho
* @version 0.0.1
*/
public class BusinessManager {
	public static String nombreEmpresa;
	public static int dinero = 10000000;
	public static boolean loop = true;
	public static int turno = 1;

	public static void main(String[] args) {
		imprimir.println("Bienvenido a Business Manager");
		while (loop) {
			int sel;

			mostrarSeleccion();

		}

	}

	private static void mostrarSeleccion() {
		int sel;
		sel = input.Int("\n�Qu� desea hacer?\n1.Jugar\n2.Instrucciones\n3.Salir\n:");
		if (sel == 1) {
			jugar();
		}
		if (sel == 2) {
			instrucciones();
		}
		if (sel == 3) {
			loop = false;
		}
	}

	private static void instrucciones() {
		imprimir.println("En Business Manager deber�s dirigir tu propia empresa");
		imprimir.println("Cada turno ser� 1 a�o, cuando tomes todas las decisiones, se acabar� el turno");
		imprimir.println(
				"Habr� 5 decisiones con 5 opciones, 3 malas y 2 buenas, el resultado de ese a�o depender� de las decisiones que elijas");
		imprimir.println("El juego se gana habiendo llegado con m�s de 10.000.000 � al decimo turno");
		imprimir.println(
				"El juego se pierde si est�s en bancarrota (-10.000.000 �) O si no superas el limite al decimo turno");
	}

	private static void jugar() {
		nombreEmpresa = input.String("Ingrese el nombre de la empresa: ");
		imprimir.println("Mucha suerte " + nombreEmpresa);
		manager.manager();
	}

	

}
