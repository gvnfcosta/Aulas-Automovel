package entidades;

public class Carro {
	private Motor motor;
	private Rodas rodas;
	private Carroceria carroceria;
	private Fabricante fabricante;
	
	public Carro() { 
	}
	
	public Carro(Fabricante fabricante, Motor motor, Rodas rodas, Carroceria carroceria) {
		this.fabricante = fabricante;
		this.motor = motor;
		this.rodas = rodas;
		this.carroceria = carroceria;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Rodas getRodas() {
		return rodas;
	}

	public void setRodas(Rodas rodas) {
		this.rodas = rodas;
	}

	public Carroceria getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(Carroceria carroceria) {
		this.carroceria = carroceria;
	}

	@Override
	public String toString() {
		return fabricante + " " + motor + ", Rodas de " + rodas + ", " + carroceria;
	}
}
