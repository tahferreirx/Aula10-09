package Atividades;

public class Endereco {
	
	private String rua;
	private int numero;
	private String bairro;
	private String cep;
	private Cidade cidade;
	
	protected String getRua() {
		return rua;
	}
	protected void setRua(String rua) {
		this.rua = rua;
	}
	protected int getNumero() {
		return numero;
	}
	protected void setNumero(int numero) {
		this.numero = numero;
	}
	protected String getBairro() {
		return bairro;
	}
	protected void setBairro(String bairro) {
		this.bairro = bairro;
	}
	protected String getCep() {
		return cep;
	}
	protected void setCep(String cep) {
		this.cep = cep;
	}
	protected Cidade getCidade() {
		return cidade;
	}
	protected void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
}
