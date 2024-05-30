package main;

import campos.TodosCampos;
import controle.*;
import fluxo.*;

public class Main {
	private static boolean sair = false;
	public static void main(String[] args) {
		
		do {
			System.out.println("--------------------------------");
			Saida.mostrarMap(TodosCampos.crud());
			System.out.println("--------------------------------");
			Entrada.pegar();
			if(Entrada.getEntradaUsuario().contentEquals("0")) {
				sair = true;
			}
			switch (Entrada.getEntradaUsuario()) {
			case "1": 
				Criar.iniciar();
				break;
			case "2": 
				Ler.iniciar();
				break;
			case "3": 
				Atualizar.iniciar();
				break;
			case "4": 
				Deletar.iniciar();
				break;
			}
		}while(!sair);
		System.out.println("Finalizado!");
	}

}
