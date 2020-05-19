package com.mvc.model;

public class Model {

	private double saldoAtual = 500.0;
	private String nomePessoa = "Gabriel";
	private String cpf = "123.456.789-00";
	private int numeroConta = 4567890;
	private int agencia = 123;

	public boolean creditar(double valor, int numeroConta, int agencia) {
		if (this.saldoAtual > valor && this.numeroConta == numeroConta && this.agencia == agencia) {
			
			saldoAtual -= valor;
			return true;
		}
		return false;
	}

	public boolean creditar(double valor, int numeroConta, int agencia, String cpf) {
		if (this.saldoAtual > valor && this.numeroConta == numeroConta && this.agencia == agencia
				&& this.cpf.equalsIgnoreCase(cpf)) {
			
			saldoAtual -= valor;
			return true;
		}
		return false;
	}

	public boolean depositar(double valor, int numeroConta, int agencia) {
		if (this.saldoAtual > valor && this.numeroConta == numeroConta && this.agencia == agencia) {
			
			saldoAtual += valor;
			return true;
		}
		return false;
	}

	public boolean depositar(double valor, int numeroConta, int agencia, String cpf) {
		if (this.saldoAtual > valor && this.numeroConta == numeroConta && this.agencia == agencia
				&& this.cpf.equalsIgnoreCase(cpf)) {
			
			saldoAtual += valor;
			return true;
		}
		return false;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public String getCpf() {
		return cpf;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	@Override
	public String toString() {
		return "Nome: " + getNomePessoa()
				+ " Cpf: " + getCpf()
				+ "\nAgencia: " + getAgencia()
				+ " Conta: " + getNumeroConta()
				+ "\nSaldo: " + getSaldoAtual();
	}
	
}
