package com.mvc.controller;

import com.mvc.model.Model;

public class Controller {
	
	private Model model = new Model();
	
	public boolean creditarValor (double valor, int numeroConta, int agencia) {
		return model.creditar(valor, numeroConta, agencia);
	}
	
	public boolean creditarValor (double valor, int numeroConta, int agencia, String cpf) {
		return model.creditar(valor, numeroConta, agencia, cpf);
	}
	
	public boolean debitarValor (double valor, int numeroConta, int agencia) {
		return model.depositar(valor, numeroConta, agencia);
	}

	public boolean debitarValor (double valor, int numeroConta, int agencia, String cpf) {
		return model.depositar(valor, numeroConta, agencia, cpf);
	}
	
	public String getModel () {
		return model.toString();
	}
}
