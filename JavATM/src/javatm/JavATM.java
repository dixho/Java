package javatm;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Dixho
 * @version 0.0.3
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
		System.out.println("Bienvenido a JavATM.\n");
		while (cont < 3) {

			System.out.print("Ingrese su usuario: ");
			user = teclado.nextLine();

			if (user.equals("flf") || user.equals("FLF"))// Comprobación de que el usuario es el correcto
			{
				System.out.println("Usuario Correcto.");
				System.out.print("Por favor, ingrese su PIN: ");
				pin = Math.abs(teclado.nextInt());
				if (pin == 1234) { // Comprobación del PIN
					System.out.println("\nPIN Correcto");

					while (bucle == true) {
						System.out.print(
								"\n Elija que desea hacer:\n \n 1. Ver Saldo. \n 2. Ingresar. \n 3. Retirar \n 4. Salir. ");
						System.out.print("\n: ");
						sel1 = Math.abs(teclado.nextInt());
						if (sel1 == 1) {
							System.out.println("\nSaldo actual: " + saldo + "€");
						}
						if (sel1 == 2) { // Ingreso
							System.out.print("\nCantidad a ingresar: ");
							ingreso = Math.abs(teclado.nextDouble());
							if (ingreso <= efectivo) {
								saldo = saldo + ingreso;
								System.out.print("¿Ver saldo? 1/0: ");
								sel2 = teclado.nextInt();
								if (sel2 == 1) {
									System.out.println("\nSaldo actual: " + saldo + "€");
								}
							} else {
								System.out.println("Ha ingresado una cantidad erronea.");
							}

						}
						if (sel1 == 3) { // Retirada
							System.out.print("\nCantidad a retirar: ");
							retirada = Math.abs(teclado.nextDouble());
							saldo = saldo - retirada;
							System.out.print("Â¿Ver saldo? 1/0: ");
							sel2 = teclado.nextInt();
							if (sel2 == 1) {
								System.out.println("\nSaldo actual: " + saldo + "€");
							}

						}
						if (sel1 == 4) { // Salida
							System.out.println("Gracias por su visita");
							bucle = false;
						}
						if (sel1 != 1 && sel1 != 2 && sel1 != 3 && sel1 != 4) {
							System.out.println("¡Opción incorrecta!");
						}
					}
				} else {
					System.out.println("\nPIN Incorrecto, vuelva a intentarlo");
					cont++;
				}
			} else {
// Intento de fallos maximos erroneos
				if (cont <= 2) {

					

					System.out.println("\nUsuario Incorrecto, vuelva a intentarlo");

					System.out.println(cont);
					cont++;

				} else {
					System.out.println("Usuario incorrecto, demasiados intentos fallidos");
					System.out.println(cont);
				}

			}
		}
	}
}
