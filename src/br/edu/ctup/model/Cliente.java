package br.edu.ctup.model;

public class Cliente  extends Sistema {


	private Integer rg, telefone;
	private String cpf, endereco, nome;
	
	public Cliente() {
		
	}
	
	
	public Cliente(String login, String senha, Integer rg, Integer telefone, String cpf, String endereco, String nome) {
		super(login, senha);
		this.rg = rg;
		this.telefone = telefone;
		this.cpf = cpf;
		this.endereco = endereco;
		this.nome = nome;
	}


	public Integer getRg() {
		return rg;
	}


	public void setRg(Integer rg) {
		this.rg = rg;
	}


	public Integer getTelefone() {
		return telefone;
	}


	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	


}
