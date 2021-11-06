package javatm;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Dixho
 * @version 0.0.8
 */
public class JavATM {
	static int saldo = 1000;
	static int efectivo = 237;
	static int contadorError = 3;

	public static void main(String[] args) {

		// Presentaci�n del cajero
		imprimirln("Bienvenido a JavATM.\n");
		seleccionPrimera();

	}

	private static void seleccionPrimera() { // Metodo para la primera seleccion
		int seleccion;
		imprimir("Que desea hacer: \n 1.Acceder a mi cuenta \n 2.Salir\n: ");
		seleccion = input();
		if (seleccion == 1) {
			ingresoUsuario();
		} else {
			salir();
		}

	}

	private static void ingresoUsuario() { // Metodo para ingresar usuario
		imprimir("Ingrese su usuario: ");
		String user = inputString();
		if (user.equalsIgnoreCase("flf")) {
			imprimirln("Usuario Correcto.");
			contadorError=3;
			ingresoPin();
		} else {
			userIncorrecto();
		}

	}

	private static void userIncorrecto() { // Metodo para avisar de que el usuario es incorrecto y comprobar cuantos
											// intentos ha realizado
		contadorError--;
		imprimirln("Usuario incorrecto");
		imprimirln("Tiene "+(contadorError+1)+" intento/s");
		//imprimir(""+contadorError);
		if (contadorError < 0 ) {
			errorUsuario();
		} else {
			ingresoUsuario();
		}

	}

	private static void errorUsuario() { // Metodo para avisar de exceso de fallos y terminar el cajero
		imprimirln("Demasiados intentos fallidos");

	}

	private static void ingresoPin() { // Metodo para ingresar PIN
		int pin;
		imprimir("ingrese su PIN: ");
		pin = Math.abs(input());
		comprobarPIN(pin);

	}

	private static void comprobarPIN(int pin) { // Metodo para comprobar si el PIN es correcto y cuantos intentos
												// fallidos
		if (pin == 1234) { // Comprobaci�n del PIN
			imprimirln("\nPIN Correcto");
			seleccionarOpcion();
		} else {
			pinIncorrecto();
		}
	}

	private static void pinIncorrecto() { // Metodo para avisar de que el PIN es incorrecto y comprobar cuantos intentos
											// ha realizado
		contadorError--;
		imprimirln("PIN incorrecto ");
		imprimirln("Tiene "+(contadorError+1)+" intento/s");
		//imprimir(""+contadorError);
		if (contadorError < 0) {
			errorPin();
		} else {
			ingresoPin();
		}

	}

	private static void errorPin() { // Metodo para avisar de exceso de fallos y terminar el cajero
		imprimirln("Demasiados intentos fallidos");

	}

	private static void seleccionarOpcion() { // Metodo para seleccionar la opci�n a realizar
		boolean bucle = true;
		int seleccion;
		while(bucle==true) {
			imprimir("\n Elija que desea hacer:\t\t Efectivo: " + efectivo
					+ "�\n \n 1. Ver Saldo. \n 2. Ingresar. \n 3. Retirar \n 4. Salir. ");
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
				bucle = false;
				salir();
			}
			if (seleccion == 5) {
				debugReseteoSaldoEfectivo();
			}
		}
	}

	
	private static void verSaldo() { // Metodo para ver el saldo
		imprimirln("\nSaldo actual: " + saldo + "�");
	}

	private static void ingresar() { // Metodo para ingresar en el cajero
		int sel, ingreso;
		imprimir("\nCantidad a ingresar: ");
		ingreso = Math.abs(input());
		if (ingreso <= efectivo) {
			saldo += ingreso;
			efectivo -= ingreso;
			mostrarSaldo();
			}
		 else {
			imprimirln("Ha ingresado una cantidad erronea.");
		}
	}


	private static void retirar() { // Metodo para retirar del cajero
		int retirada, sel;
		imprimir("\nCantidad a retirar: ");
		retirada = Math.abs(input());
		if (retirada <= saldo) {
			saldo -= retirada;
			efectivo += retirada;
			mostrarSaldo();
				}
		else {
			imprimir("Saldo insuficiente\n�Qu� desea hacer?:\n 1.Retirar hasta 0�\n 2.Dejar la cuenta en negativo\n:");
			sel = input();
			if (sel == 1){saldo = 0;}
			else {saldo -= retirada;}
			mostrarSaldo();	
		}
		

	}

	private static void salir() { // Metodo para terminar el cajero
		imprimirln("Gracias por su visita");

	}
	
	private static void mostrarSaldo() { // Metodo para mostrar el saldo tras un ingreso o retirada
		int sel;
		imprimir("�Ver saldo? 1/0: ");
		sel = input();
		if (sel == 1) {
			imprimirln("\nSaldo actual: " + saldo + "�");}
		
	}

	static int input() { // Metodo del Scanner para ingresar numeors por teclado
		Scanner teclado = new Scanner(System.in);
		return (teclado.nextInt());

	}

	static String inputString() { // Metodo del escaner para Strings
		Scanner teclado = new Scanner(System.in);
		return (teclado.nextLine());

	}

	static void imprimirln(String texto) { // Metodo de println
		System.out.println(texto);

	}

	static void imprimir(String texto) { // Metodo de print
		System.out.print(texto);

	}
	
	private static void debugReseteoSaldoEfectivo() { // Modo debug para volver a los valores iniciales sin reiniciar
		saldo = 1000;
		efectivo = 237;
		imprimir("Debug activado");
		seleccionarOpcion();
		
	}

}
