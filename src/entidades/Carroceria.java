package entidades;

public class Carroceria {

	private String cor;
	private Integer passageiros;
	private String bancos;
	
	public Carroceria(String cor, Integer passageiros, String bancos) {
		this.cor = cor;
		this.passageiros = passageiros;
		this.bancos = bancos;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(Integer passageiros) {
		this.passageiros = passageiros;
	}

	public String getBancos() {
		return bancos;
	}

	public void setBancos(String bancos) {
		this.bancos = bancos;
	}

	@Override
	public String toString() {
		return cor + ", " + passageiros + " lugares com bancos de " + bancos;
	}
}
