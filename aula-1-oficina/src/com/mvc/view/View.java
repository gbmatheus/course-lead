package com.mvc.view;

import com.mvc.controller.Controller;

public class View {
	public static void main(String[] args) {
		View visao = new View();
		visao.simularDeposito(100, 4567890, 123);
		visao.simularCredito(400, 4567890, 123);

	}

	public void simularCredito (double valor, int numeroConta, int agencia) {
		System.out.println("\nEfetuando operação de crédito");

		Controller controller = new Controller();

		boolean resultado = controller.creditarValor(valor, numeroConta, agencia);
		System.out.println("Operação " + (resultado ? "Concluída \n" + controller.getModel()
				: "Inválida \nVerifique se os dados estão corretos"));

	}

	public void simularDeposito (double valor, int numeroConta, int agencia) {
		System.out.println("Efetuando operação de depósito");

		Controller controller = new Controller();

		boolean resultado = controller.debitarValor(valor, numeroConta, agencia);
		System.out.println("Depósito " + (resultado ? "Concluído \n" + controller.getModel()
				: "Inválido \nVerifique se os dados estão corretos"));

	}
}
