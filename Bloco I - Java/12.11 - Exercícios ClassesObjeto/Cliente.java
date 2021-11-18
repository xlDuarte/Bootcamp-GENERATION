package exercicioclassesobjetos1;

public class Cliente {
	
	//1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
	//em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.
	
	//Atributos PRIVADOS
	private String nome, sexo, estadocivil;
	private int idade;
	private int filhos;
	
	//Getter e Setter - Acessar os dados privados (botão direito -> source -> generate setters e getters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getFilhos() {
		return filhos;
	}
	public void setFilhos(int filhos) {
		this.filhos = filhos;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
}
