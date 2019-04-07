package br.edu.ctup.view;

import java.util.Scanner;


public class Principal {
	
	static ViewCliente viewCliente = new ViewCliente();
	static Scanner sc = new Scanner(System.in);
			

	public static void main(String[] args) {
		
		int opcao =0;
		
		do {
			
			menuPrincipal();
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				
				viewCliente.cadastrarCliente();
				
				break;
			
			case 2:
				
				viewCliente.logarCliente(); 
				
				break;
				
			case 3:
				
				break;

			default:
				break;
			}
			
		}while(opcao > 0 && opcao <3);
		
	
	}
	
	 
	static public void menuPrincipal() {

		System.out.println("1 - Cadastrar cliente");
		System.out.println("2 - Logar no Sistema");

		System.out.println("3 - Sair");
		System.out.printf("Digite sua opção: ");

	}


	
	
}
