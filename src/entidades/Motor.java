package entidades;

public class Motor{
	
	private Double potencia;
	private String combustivel;
	
	public Motor() {
	}
	
	public Motor(Double potencia, String combustivel) {
		this.potencia = potencia;
		this.combustivel = combustivel;
	}
	public Double getPotencia() {
		return potencia;
	}
	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}

	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	public void mudaPotencia (double power) {
		
		this.potencia = power;
	}

	@Override
	public String toString() {
		return potencia + ", motor " + combustivel;
	}
}
