package Aula15;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;
	protected float xp;
	
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.xp = 0;
	}
	
	protected void ganharXP() {
		
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public float getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", xp=" + xp + "]";
	}
	
	
}
