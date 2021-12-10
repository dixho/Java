package TicTacToe;

import personal.*;

public class main {
	static String[] abc = new String[] { " ", "  A", "  B", "  C" };
	static String[] fila1 = new String[4];
	static String[] fila2 = new String[4];
	static String[] fila3 = new String[4];
	static boolean play = true;

	public static void main(String[] args) {
		imprimir.println("------ Tic-Tac-Toe ------");
		selec();
	}

	private static void selec() {
		boolean loop = true;
		while (loop) {
			int sel = input.Int("1. Jugar\n2. Salir\n:");
			if (sel == 1) {
				juego();
			}
			if (sel == 2) {
				loop = false;
			}
		}
	}

	private static void juego() {
		rellenarTableoInicio();
		while (play) {
			tablero();
			elegirPosicion();
		}
	}

	private static void elegirPosicion() {
		int sel1 = input.Int("Elija la fila (1,2,3) : ");
		String sel2 = input.String("Elija la columna (A,B,C) : ");
		cambiarCelda(sel1, sel2);

	}

	private static void cambiarCelda(int sel1, String sel2) {
		if (sel1 == 1) {
			if (sel2.equalsIgnoreCase("a") && !fila1[1].equals("|X|")) {
				fila1[1] = "|X|";
			}
			if (sel2.equalsIgnoreCase("b") && !fila1[2].equals("|X|")) {
				fila1[2] = "|X|";
			}
			if (sel2.equalsIgnoreCase("c") && !fila1[3].equals("|X|")) {
				fila1[3] = "|X|";
			}
		}
		if (sel1 == 2) {
			if (sel2.equalsIgnoreCase("a")) {
				fila2[1] = "|X|";
			}
			if (sel2.equalsIgnoreCase("b")) {
				fila2[2] = "|X|";
			}
			if (sel2.equalsIgnoreCase("c")) {
				fila2[3] = "|X|";
			}
		}
		if (sel1 == 3) {
			if (sel2.equalsIgnoreCase("a")) {
				fila3[1] = "|X|";
			}
			if (sel2.equalsIgnoreCase("b")) {
				fila3[2] = "|X|";
			}
			if (sel2.equalsIgnoreCase("c")) {
				fila3[3] = "|X|";
			}
		}
	}

	private static void rellenarTableoInicio() {
		fila1[0] = "1 ";
		fila2[0] = "2 ";
		fila3[0] = "3 ";
		for (int f = 1; f < fila1.length; f++) {
			fila1[f] = "|-|";
			fila2[f] = "|-|";
			fila3[f] = "|-|";
		}
	}

	private static void tablero() {
		mostrarTablero(abc);
		mostrarTablero(fila1);
		mostrarTablero(fila2);
		mostrarTablero(fila3);

	}

	private static void mostrarTablero(String[] fila) {
		for (int f = 0; f < fila.length; f++) {
			imprimir.print(fila[f]);
		}
		imprimir.print("\n");
	}

}
