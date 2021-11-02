package javatm;

public class test {
static String nombre,apellido1,apellido2,user,pin;
	public static void main(String[] args) {
		int sel;
		JavATM.imprimir("Bienvenido al sistema de registro de JavATM\n ¿Qué desea hacer?\n 1. Registrarme\n 2.Salir\n:");
		sel = JavATM.input();
		if (sel == 1) {
			registroDP();
			registroUser();
			registroPIN();
			JavATM.imprimir("Registro completo " + nombre+" "+ apellido1+" "+ apellido2+"\nUsuario: "+user+"\nPIN: "+pin);
			
		}
		
	 
	}

	private static void registroPIN() {
		JavATM.imprimir("Ingrese su nuevo PIN: ");
		pin = JavATM.inputString();
	}

	private static void registroUser() {
		JavATM.imprimir("Ingrese su usuario: ");
		user = JavATM.inputString();
		
	}

	private static void registroDP() {
		JavATM.imprimir("Ingrese su nombre completo: ");
		nombre = JavATM.inputString();
		JavATM.imprimir("Ingrese su primer apellido: ");
		apellido1 = JavATM.inputString();
		JavATM.imprimir("Ingrese su segundo apellido: ");
		apellido2 = JavATM.inputString();
		
	}
	
}