package javatm;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Dixho
 * @version 0.0.5
 */
public class JavATM {

	public static void main(String[] args) {
		// Creación de variables
		Scanner teclado = new Scanner(System.in);
		String user;
		int pin, sel1, sel2, cont;
		double saldo, ingreso, retirada, efectivo;
		cont = 0;
		saldo = 1000;
		efectivo = 237;
		boolean bucle;
		bucle = true;

		// Presentación del cajero
		imprimirln("Bienvenido a JavATM.\n");
		while (cont < 3) {

			imprimir("Ingrese su usuario: ");
			user = teclado.nextLine();

			if (user.equals("flf") || user.equals("FLF"))// Comprobación de que el usuario es el correcto
			{
				imprimirln("Usuario Correcto.");
				imprimir("Por favor, ingrese su PIN: ");
				pin = Math.abs(teclado.nextInt());
				if (pin == 1234) { // Comprobación del PIN
					imprimirln("\nPIN Correcto");

					while (bucle == true) {
						imprimir(
								"\n Elija que desea hacer:\n \n 1. Ver Saldo. \n 2. Ingresar. \n 3. Retirar \n 4. Salir. ");
						imprimir("\n: ");
						sel1 = Math.abs(teclado.nextInt());
						if (sel1 == 1) {
							imprimirln("\nSaldo actual: " + saldo + "€");
						}
						if (sel1 == 2) { // Ingreso
							imprimir("\nCantidad a ingresar: ");
							ingreso = Math.abs(teclado.nextDouble());
							if (ingreso <= efectivo) {
								saldo = saldo + ingreso;
								imprimir("¿Ver saldo? 1/0: ");
								sel2 = teclado.nextInt();
								if (sel2 == 1) {
									imprimirln("\nSaldo actual: " + saldo + "€");
								}
							} else {
								imprimirln("Ha ingresado una cantidad erronea.");
							}

						}
						if (sel1 == 3) { // Retirada
							imprimir("\nCantidad a retirar: ");
							retirada = Math.abs(teclado.nextDouble());
							saldo = saldo - retirada;
							imprimir("¿Ver saldo? 1/0: ");
							sel2 = teclado.nextInt();
							if (sel2 == 1) {
								imprimirln("\nSaldo actual: " + saldo + "€");
							}

						}
						if (sel1 == 4) { // Salida
							imprimirln("Gracias por su visita");
							bucle = false;
						}
						if (sel1 != 1 && sel1 != 2 && sel1 != 3 && sel1 != 4) {
							imprimirln("¡Opción incorrecta!");
						}
					}
				} else {
					imprimirln("\nPIN Incorrecto, vuelva a intentarlo");
					cont++;
				}
			} else {
// Intento de fallos maximos erroneos
				if (cont <= 2) {

					

					imprimirln("\nUsuario Incorrecto, vuelva a intentarlo");

					//imprimirln(cont);
					cont++;

				} else {
					imprimirln("Usuario incorrecto, demasiados intentos fallidos");
					//imprimirln(cont);
				}

			}
		}
	}

	private static void imprimirln(String texto) {
		imprimirln(texto);
		
	}
}
