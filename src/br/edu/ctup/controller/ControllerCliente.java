package br.edu.ctup.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.ctup.model.Cliente;

public class ControllerCliente {

	List<Cliente> listCliente = new ArrayList<Cliente>();
	
	

	public void cadastrarCliente(Cliente cliente) {
		
		listCliente.add(cliente);
		
	}
	
	public void alterarDadosCliente(int indice, Cliente cliente) {
		
		listCliente.get(indice).setNome(cliente.getNome());
		listCliente.get(indice).setSenha(cliente.getSenha());
		listCliente.get(indice).setLogin(cliente.getLogin());
		listCliente.get(indice).setEndereco(cliente.getEndereco());
		listCliente.get(indice).setTelefone(cliente.getTelefone());
		
		
	}
	
	public int autenticarCliente(String login, String senha) {
		int indice = -1;
		
				for (int i = 0; i < listCliente.size(); i++) {
					
					if(listCliente.get(i).getLogin().equals(login)
							&& listCliente.get(i).getSenha().equals(senha)) {
						
						 indice = i;
						break;
						
					}
					
				}
			return indice;	
	}
	
}

