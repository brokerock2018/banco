package br.com.bancorock;

public class Conta_PF {

	String numconta;
	char digito;
	String data;
	public String getNumconta() {
		return numconta;
	}
	public void setNumconta(String numconta) {
		this.numconta = numconta;
	}
	public char getDigito() {
		return digito;
	}
	public void setDigito(char digito) {
		this.digito = digito;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Conta_PF(String numconta, char digito, String data) {
		super();
		this.numconta = numconta;
		this.digito = digito;
		this.data = data;
	}
	
	
	
}

