package entidades;

public class Importacao extends Imposto {

	private Double dutt;

	public Importacao() {
	}

	public Importacao(Double taxa, Double dutt) {
		super(taxa);
		this.dutt = dutt;
	}

	public Double getDutt() {
		return dutt;
	}

	public void setDutt(Double dutt) {
		this.dutt = dutt;
	}

	@Override
	public double taxa() {
		return dutt;
	}	
}
