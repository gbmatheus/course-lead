package br.com.dell.lead.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.dell.lead.model.Produto;

@Controller
public class CadastroController {
	
	@GetMapping("adicionarProduto")
	public String adicionarProduto (@Validated Produto produto, BindingResult result) {
		if(result.hasFieldErrors("nome")) {
			return "formProdutos";
		}
//		JdbcDaoProduto dao = new JdbcProdutoDao();
//		dao.adicionarProduto(produto);
		return "produtoAdicionado";
	}

}
