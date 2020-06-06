package br.com.dell.lead.controller;

import br.com.dell.lead.model.Produto;

public class RemoveController {
	
	public String remove(Produto produto) {
//		JdbcProdutoDao dao = new JdbcProdutoDao();
//		dao.remove(produto);
		return "redirect:listaProdutos";
	}
}
