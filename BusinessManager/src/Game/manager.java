package Game;

import Personal.*;

public class manager {
	static int[] decisiones = new int[5];
	static String[] si = new String[] { "si", "sí", "s" };
	static boolean loop = true;
	static private int puntos = 0;
	static private int resulrandom;

	public static void manager() {

		int sel;
		while (loop) {
			imprimir.println(BusinessManager.nombreEmpresa + " Año " + BusinessManager.turno + " / 10");
			sel = input.Int("1.Mostrar decisiones\n2.Ver Dinero\n3.Vender la empresa\n:");
			if (sel == 1)
				mostrarDecisiones();

			if (sel == 2)
				verDinero();

			if (sel == 3)
				VenderEmpresa();

		}
	}

	private static void VenderEmpresa() {
		String confir = "Vender " + BusinessManager.nombreEmpresa;
		String sel = input.String("¿Estás seguro? (No hay vuelta atrás) Sí/No: ");
		for (int f = 0; f < si.length; f++) {
			if (sel.equalsIgnoreCase(si[f])) {
				String sel2 = input.String("Escribe " + confir + " para vender la empresa: ");
				if (sel2.equals(confir)) {
					imprimir.println(BusinessManager.nombreEmpresa + " vendida correctamente. Gracias por jugar");
					BusinessManager.loop = false;
					loop = false;
				}
			}
		}

	}

	private static void verDinero() {
		imprimir.println("Saldo actual: " + BusinessManager.dinero);
	}

	private static void mostrarDecisiones() {
		switch (BusinessManager.turno) {
		case 1:
			int decision = 0;
			for (int f = 0; f < 2; f++) {

				imprimir.println("\n1. Invertir en almacen (-80.000€)"); // +2

				imprimir.println("2. Aumentar Produccion (-25.000€)"); // +1

				imprimir.println("3. Elegir campaña de publicidad 1 (-150.000€)"); // +3

				imprimir.println("4.Elegir campaña de publicidad 2 (-50.000€)"); // -1

				imprimir.println("5. No modificar nada"); // 0
				decision = input.Int(f + 1 + "/2 Elija la decisión que quiera: ");
				switch (decision) {
				case 1:
					puntos += 2;
				case 2:
					puntos += 1;
				case 3:
					puntos += 3;
				case 4:
					puntos -= 1;
				case 5:
					puntos += 0;
				}
				resulrandom = random();

			}

		case 2:

		case 3:

		case 4:

		case 5:

		case 6:

		case 7:

		case 8:

		case 9:

		case 10:

		}
	}

	private static int random() {
		return random.random(0, puntos);

	}

}
