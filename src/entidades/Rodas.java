package entidades;

public class Rodas {

	private Integer aro;
	private String tipo;
	
	public Rodas() {
	}
	
	public Rodas(Integer aro, String tipo) {
		this.aro = aro;
		this.tipo = tipo;
	}
	
	public Integer getAro() {
		return aro;
	}
	public void setAro(Integer aro) {
		this.aro = aro;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return tipo + " " + aro + "'";
	}
}
