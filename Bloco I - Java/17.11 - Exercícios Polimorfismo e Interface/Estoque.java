package excollections;

public class Estoque {
	
	private String itens;
	
	//@Getters and setters
	public String getItens() {
		return itens;
	}

	public void setItens(String itens) {
		this.itens = itens;
	}

	//Constructor
	public Estoque(String itens) {
		super();
		this.itens = itens;	
	}

	//@Override
	public String toString() {
		return "Estoque [itens=" + itens + "]";
	}
}
