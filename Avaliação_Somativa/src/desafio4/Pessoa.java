package desafio4;

public class Pessoa {
	private String nome; //tem que mudar de public para se tornar private.
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome; //faltou adicionar os campos.
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	

}
