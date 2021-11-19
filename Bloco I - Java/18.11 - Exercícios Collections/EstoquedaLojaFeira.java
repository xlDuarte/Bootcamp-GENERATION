package exerciciocollection;

public abstract class EstoquedaLojaFeira {
	
	private int quantidade;
	private String produtos;
	
	public EstoquedaLojaFeira(int quantidade, String produtos){
		super();
		this.quantidade = quantidade;
		this.produtos = produtos;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}
	
	@Override
	public String toString() {
		return "EstoquedaLojaFeira [quantidade=" + quantidade + ", produtos=" + produtos + "]";
	}
	
}
