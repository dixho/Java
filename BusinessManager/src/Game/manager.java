package Game;

import Personal.*;

public class manager {

	static String[] si = new String[] { "si", "sí", "s" };
	static boolean loop = true;
	public static void manager() {
		
		int sel;
		while (loop) {
			imprimir.println(BusinessManager.nombreEmpresa + " Año " + BusinessManager.turno + " / 10");
			sel = input.Int("1.Mostrar decisiones\n2.Ver Dinero\n3.Vender la empresa\n:");
			switch (sel) {
			case 1:
				mostrarDecisiones();
			case 2:
				verDinero();
			case 3:
				VenderEmpresa();

			}
		}
	}

	private static void VenderEmpresa() {
		String confir = "Vender " + BusinessManager.nombreEmpresa;
		String sel = input.String("¿Estás seguro? (No hay vuelta atrás) Sí/No: ");
		for(int f=0;f<si.length;f++) {
			if (sel.equalsIgnoreCase(si[f])) {
				String sel2 = input.String("Escribe "+confir+" para vender la empresa: ");
				if (sel2.equals(confir)) {
					imprimir.println(BusinessManager.nombreEmpresa+" vendida correctamente. Gracias por jugar");
					BusinessManager.loop=false;
					loop=false;
					}
				}
			}
		//input.String("Escribe "+confir+" para vender la empresa"
		
	}

	private static void verDinero() {
		imprimir.println("Saldo actual: " + BusinessManager.dinero);
	}

	private static void mostrarDecisiones() {
		switch (BusinessManager.turno) {
		case 1:
			imprimir.println("");

		}
	}

}
