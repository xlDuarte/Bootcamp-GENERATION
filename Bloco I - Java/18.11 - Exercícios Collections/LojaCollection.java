package exerciciocollection;

public class LojaCollection extends EstoquedaLojaFeira implements LigaEstoque{
	
private String mirtilo,pera,melancia,abacaxi;
	
	int i = 1;
	
	public LojaCollection(int quantidade, String produtos, String mirtilo, String pera, String melancia,
			String abacaxi) {
		super(quantidade, produtos);
		this.mirtilo = mirtilo;
		this.pera = pera;
		this.melancia = melancia;
		this.abacaxi = abacaxi;
	}

	public String getMirtilo() {
		return mirtilo;
	}

	public void setMirtilo(String mirtilo) {
		this.mirtilo = mirtilo;
	}

	public String getPera() {
		return pera;
	}

	public void setPera(String pera) {
		this.pera = pera;
	}

	public String getMelancia() {
		return melancia;
	}

	public void setMelancia(String melancia) {
		this.melancia = melancia;
	}

	public String getAbacaxi() {
		return abacaxi;
	}

	public void setAbacaxi(String abacaxi) {
		this.abacaxi = abacaxi;
	}
	
	@Override
	public String toString() {
		return "LojaCollection [mirtilo=" + mirtilo + ", pera=" + pera + ", melancia=" + melancia + ", abacaxi="
				+ abacaxi + "]";
	}

	@Override
	public void cont() {
		System.out.println(getQuantidade());
		
	}

	@Override
	public void vends() {
		System.out.println("Parabéns!!! Você realizou sua compra!");
		
	}
}

