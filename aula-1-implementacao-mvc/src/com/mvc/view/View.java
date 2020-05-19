package com.mvc.view;

import com.mvc.controller.Controller;

public class View {
	public static void main(String[] args) {
		new View().simularCliqueUsuarioParaValidarLogin("dellead", "123456");
	}

	public void simularCliqueUsuarioParaValidarLogin(String usuario, String senha) {
		System.out.println("Simulando o clique de um usuario do sistema para validação de login...");

		Controller controller = new Controller();

		boolean resultado = controller.validarLogin(usuario, senha);
		System.out.println("Validação ok? " + (resultado ? "Sim" : "Não"));

	}
}
