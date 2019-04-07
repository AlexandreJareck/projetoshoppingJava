package br.edu.ctup.view;

import java.util.Scanner;

import br.edu.ctup.controller.ControllerCliente;
import br.edu.ctup.model.Cliente;

public class ViewCliente {

	static ControllerCliente controllerCliente = new ControllerCliente();
	static Cliente cliente;
	static Scanner sc = new Scanner(System.in);
	static Principal principal;
	static int indice;

	

	public void menuCliente(int indice) {
		int opcao;
		do {
			cliente = new Cliente();
			System.out.println("1 - Restaurante");
			System.out.println("2 - Alterar dados\n");
			System.out.println("3 - Sair");
			System.out.printf("Digite sua opção: ");
			opcao = sc.nextInt();
			System.out.println();

			switch (opcao) {
			case 1:

				// restaurante

				break;

			case 2:

				alterarDadosCliente();

				break;

			default:
				break;
			}

		} while (opcao > 0 && opcao < 3);

	}

	public void cadastrarCliente() {

		cliente = new Cliente();

		System.out.printf("Digite seu Nome: ");
		cliente.setNome(sc.next());
		System.out.printf("Digite seu CPF: ");
		cliente.setCpf(sc.next());
		System.out.printf("Digite seu RG: ");
		cliente.setRg(sc.nextInt());
		System.out.printf("Digite seu Login: ");
		cliente.setLogin(sc.next());
		System.out.printf("Digite sua Senha: ");
		cliente.setSenha(sc.next());
		System.out.printf("Digite seu Endereço(Rua,nº,bairro,cidade,UF: ");
		cliente.setEndereco(sc.next());
		controllerCliente.cadastrarCliente(cliente);
		limpaTela();
		System.out.println("Cliente CADASTRADO COM SUCESSO !!\n");

	}

	public void logarCliente() {
		System.out.printf("Digite seu login: ");
		String login = sc.next();
		System.out.println();
		System.out.printf("Digite sua senha: ");
		String senha = sc.next();
		System.out.println();

		indice = controllerCliente.autenticarCliente(login, senha);
		if (indice > -1) {
			System.out.println("Login efetuado com sucesso!!");
			System.out.println();
			menuCliente(indice);

		} else {
			limpaTela();
			System.out.println("Login ou senha invalida!");
			System.out.println("Voltando para o menu principal..");
			
			

		}
	}

	public void alterarDadosCliente() {

		System.out.println("Você não pode alterar RG E CPF!!\n");

		System.out.printf("Digite seu Nome: ");
		cliente.setNome(sc.next());
		System.out.printf("Digite seu Login: ");
		cliente.setLogin(sc.next());
		System.out.printf("Digite sua Senha: ");
		cliente.setSenha(sc.next());
		System.out.printf("Digite seu Endereço(Rua,nº,bairro,cidade,UF: ");
		cliente.setEndereco(sc.next());
		controllerCliente.alterarDadosCliente(indice, cliente);
		limpaTela();
		System.out.println("Cadastro alterado com sucesso!!\n");
		

	}

	public final static void limpaTela() {

		for (int i = 0; i < 50; ++i)
			System.out.println();
	}

}
