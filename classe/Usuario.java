package classe;

public class Usuario {

	String nome;
	String email;
	
	public boolean equals(Object obj) {
		return obj instanceof Usuario &&
				((Usuario) obj).nome.equals(this.nome) &&
				((Usuario) obj).email.equals(this.email);
	}
}
