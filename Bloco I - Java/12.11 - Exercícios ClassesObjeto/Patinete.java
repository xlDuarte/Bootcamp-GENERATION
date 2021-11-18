package exercicioclassesobjetos5;

public class Patinete {
	
	//5) Crie uma classe patinete e apresente os atributos e métodos referentes esta classe,
	//em seguida crie um objeto patinete, defina as instancias deste objeto e apresente as informações deste objeto no console.
	
	//Atributos PRIVADOS
	private String tipo, modalidade;
	private double preço; 
	
	//Getter e Setter - Acessar os dados privados (botão direito -> source -> generate setters e getters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	void desenhopatinete() {
	System.out.println("T");
	System.out.println("|________________");
	System.out.println("  O           O");
	}
}
