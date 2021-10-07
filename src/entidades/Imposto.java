package entidades;

public abstract class Imposto {

	private Double taxa;
	
	public Imposto() {
	}

	public Imposto(Double taxa) {
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public abstract double taxa();
	
}
