package br.com.bancorock;

public class Pessoa {
	
	String nome,rg,cpf,uf,datanascimento,pai,mae,uf_nascimento,cidade_nascimento;
	String endereco,cep,fone,email;
	int idade;
	char sexo;
	String proffisao;
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public String getDatanascimento() {
		return datanascimento;
	}


	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}


	public String getPai() {
		return pai;
	}


	public void setPai(String pai) {
		this.pai = pai;
	}


	public String getMae() {
		return mae;
	}


	public void setMae(String mae) {
		this.mae = mae;
	}


	public String getUf_nascimento() {
		return uf_nascimento;
	}


	public void setUf_nascimento(String uf_nascimento) {
		this.uf_nascimento = uf_nascimento;
	}


	public String getCidade_nascimento() {
		return cidade_nascimento;
	}


	public void setCidade_nascimento(String cidade_nascimento) {
		this.cidade_nascimento = cidade_nascimento;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getFone() {
		return fone;
	}


	public void setFone(String fone) {
		this.fone = fone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public String getProffisao() {
		return proffisao;
	}


	public void setProffisao(String proffisao) {
		this.proffisao = proffisao;
	}


	public Pessoa(String nome, String rg, String cpf, String uf, String datanascimento, String pai, String mae,
			String uf_nascimento, String cidade_nascimento, String endereco, String cep, String fone, String email,
			int idade, char sexo, String proffisao) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.uf = uf;
		this.datanascimento = datanascimento;
		this.pai = pai;
		this.mae = mae;
		this.uf_nascimento = uf_nascimento;
		this.cidade_nascimento = cidade_nascimento;
		this.endereco = endereco;
		this.cep = cep;
		this.fone = fone;
		this.email = email;
		this.idade = idade;
		this.sexo = sexo;
		this.proffisao = proffisao;
	}
	
	
	
}
