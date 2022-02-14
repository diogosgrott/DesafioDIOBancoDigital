package BancoDigital;

public class Cliente {
	private String nome;
	private String CPF;
	private String endereco;

	public Cliente(String nome, String cPF, String endereco) {
		this.nome = nome;
		CPF = cPF;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getCPF() {
		return CPF;
	}

	public String getEndereco() {
		return endereco;
	}

}
