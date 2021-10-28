package javatm;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Dixho
 * @version 0.0.5.1
 */
public class JavATM {
	static int saldo = 1000;
	static int efectivo = 237;
	static int contadorErrorUsuario = 0;
	static int contadorErrorPin = 0;

	public static void main(String[] args) {
		// Creación de variables

		// Presentación del cajero
		imprimirln("Bienvenido a JavATM.\n");
		ingresoUsuario();

	}

	private static void ingresoUsuario() {
		imprimir("Ingrese su usuario: ");
		String user = inputString();
		if (user.equals("flf") || user.equals("FLF")) {
			imprimirln("Usuario Correcto.");
			ingresoPin();
		} else {
			userIncorrecto();
		}

	}

	private static void userIncorrecto() {
		contadorErrorUsuario++;
		imprimirln("Usuario incorrecto");
		if(contadorErrorUsuario == 3) {
			usuarioError();
		}else {ingresoUsuario();}

	}

	private static void usuarioError() {
		imprimirln("Demasiados intentos fallidos");
		
	}

	private static void ingresoPin() {
		int pin = input();
		imprimir("ingrese su PIN: ");
		pin = Math.abs(input());
		comprobarPIN(pin);

	}

	private static void comprobarPIN(int pin) {
		if (pin == 1234) { // Comprobación del PIN
			imprimirln("\nPIN Correcto");
			seleccionarOpcion();
		} else {
			pinIncorrecto();
		}
	}

	private static void pinIncorrecto() {
		contadorErrorPin++;
		imprimirln("PIN incorrecto ");
		if (contadorErrorPin == 3) {
			errorPin();
		}else {ingresoPin();}

	}

	private static void errorPin() {
		imprimirln("Demasiados intentos fallidos");
		
	}

	private static void seleccionarOpcion() {
		int seleccion;
		imprimir("\n Elija que desea hacer:\t\t Efectivo: "+efectivo+"€\n \n 1. Ver Saldo. \n 2. Ingresar. \n 3. Retirar \n 4. Salir. ");
		imprimir("\n: ");
		seleccion = input();
		if (seleccion == 1) {
			verSaldo();
		}
		if (seleccion == 2) {
			ingresar();
		}
		if (seleccion == 3) {
			retirar();
		}
		if (seleccion == 4) {
			salir();
		}
	}

	private static void verSaldo() {
		imprimirln("\nSaldo actual: " + saldo + "€");
		seleccionarOpcion();
	}

	private static void ingresar() {
		int sel, ingreso;
		imprimir("\nCantidad a ingresar: ");
		ingreso = Math.abs(input());
		if (ingreso <= efectivo) {
			saldo += ingreso;
			efectivo -= ingreso;
			imprimir("¿Ver saldo? 1/0: ");
			sel = input();
			if (sel == 1) {
				imprimirln("\nSaldo actual: " + saldo + "€");
			}
		} else {
			imprimirln("Ha ingresado una cantidad erronea.");
		}
		seleccionarOpcion();
	}

	private static void retirar() {
		int retirada, sel;
		imprimir("\nCantidad a retirar: ");
		retirada = Math.abs(input());
		saldo -= retirada;
		efectivo += retirada;
		imprimir("¿Ver saldo? 1/0: ");
		sel = input();
		if (sel == 1) {
			imprimirln("\nSaldo actual: " + saldo + "€");
		}
		seleccionarOpcion();

	}

	private static void salir() {
		imprimirln("Gracias por su visita");

	}

	private static int input() {
		Scanner teclado = new Scanner(System.in);
		return (teclado.nextInt());

	}

	private static String inputString() {
		Scanner teclado = new Scanner(System.in);
		return (teclado.nextLine());

	}

	private static void imprimirln(String texto) {
		System.out.println(texto);

	}

	private static void imprimir(String texto) {
		System.out.print(texto);

	}
}
