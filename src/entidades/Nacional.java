package entidades;

public class Nacional extends Imposto {
	
	private Double impostos;

	public Nacional(Double taxa, Double impostos) {
		super(taxa);
		this.impostos = impostos;
	}

	public Double getImpostos() {
		return impostos;
	}

	public void setImpostos(Double impostos) {
		this.impostos = impostos;
	}

	@Override
	public double taxa() {
		return impostos;
	}	
}
