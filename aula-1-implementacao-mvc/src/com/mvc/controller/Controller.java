package com.mvc.controller;

import com.mvc.model.Model;

public class Controller {
	
	public Boolean validarLogin (String usuario, String senha) {
		
		Model model = new Model();
		return model.validarLogin(usuario, senha);
	}

}
