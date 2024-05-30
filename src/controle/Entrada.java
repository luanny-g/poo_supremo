package controle;

import java.util.Scanner;

public abstract class Entrada{
	private static String entradaUsuario;
	private static Scanner scanner = new Scanner(System.in);
	
	public static String getEntradaUsuario() {
		return entradaUsuario;
	}
	private static void setEntradaUsuario(String entradaUsuario) {
		Entrada.entradaUsuario = entradaUsuario;
	}
	
	public static String pegar() {
		setEntradaUsuario(scanner.next()); 
		return getEntradaUsuario();
	}
	
	
}
