package oo.encapsulamento;

public class Pessoa {

	private int idade;
	
	Pessoa(int idade) {
		this.setIdade(idade);
	}
	
	public int getIdate() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if (0 <= idade && idade <= 120)
			this.idade = idade;
	}
}
