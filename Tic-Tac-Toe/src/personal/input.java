package personal;

import java.util.Scanner;

public class input {

	public static String String(String texto) {
		imprimir.print(texto);
		Scanner teclado = new Scanner(System.in);
		return teclado.nextLine();
		
	}

	public static int Int(String texto) {
		imprimir.print(texto);
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
		
	}
	public static float Float(String texto) {
		imprimir.print(texto);
		Scanner teclado = new Scanner(System.in);
		return teclado.nextFloat();
	}
}
