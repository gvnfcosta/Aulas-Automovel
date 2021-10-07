package aplicativo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Carro;
import entidades.Carroceria;
import entidades.Fabricante;
import entidades.Importacao;
import entidades.Motor;
import entidades.Nacional;
import entidades.Rodas;

public class Programa {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Carro> veiculo = new ArrayList<>();
		
		Fabricante carro1 = new Fabricante("Ford", "Fiesta");
		Fabricante carro2 = new Fabricante("Renault", "Torus");
		Motor motorBasico = new Motor(1.0, "Flex");
		Motor motorRanger = new Motor(1.4, "Diesel");
		Motor motorPower = new Motor(1.6, "Gasolina");
		Rodas rodasStandard = new Rodas(14, "Ferro");
		Rodas rodasFull = new Rodas(17, "Liga Leve");
		Carroceria carroceriaSuv = new Carroceria("Branco", 7, "Couro");
		Carroceria carroceriaPasseio = new Carroceria("Prata", 5, "Tecido");
		
		Nacional empresa = new Nacional(10.0, 50.0);
		Importacao employe = new Importacao(20.0, 80.0);
		
		System.out.println(empresa.taxa());
		System.out.println(empresa.getTaxa());
		System.out.println(empresa.getTaxa());
		System.out.println(employe.taxa());
		System.out.println(employe.getTaxa());
		
 		
		//System.out.println("Motor Siena: " + motorPower.getPotencia());
		
		veiculo.add(new Carro(carro1, motorBasico, rodasStandard, carroceriaPasseio));
		veiculo.add(new Carro(carro2, motorPower, rodasFull, carroceriaSuv));
		
		for(int i=0; i < veiculo.size(); i++) {
			System.out.println("Veículo: " + veiculo.get(i));
		}

		//motorSiena.setPotencia(1.6);
		
		motorPower.mudaPotencia(2.0);
		
		System.out.println("Novo Motor Torus: " + veiculo.get(1).getMotor().getPotencia());

		sc.close();
	}
}
