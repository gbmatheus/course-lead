package br.com.dell.lead.model;

import javax.validation.constraints.NotNull;

public class Produto {
	private Long id;
	@NotNull
	private String nome;
	@NotNull
	private int quantidade;
}
