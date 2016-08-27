package br.senai.sp.informatica.contato.modelo;

public enum Sexo {
	MASCULINO("Masculino"), 
	FEMININO("Feminino");

	private String descricao;

	private Sexo(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}
}
