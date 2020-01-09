package model;

import java.lang.reflect.Constructor;

public class Carro {
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private double km;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;
	private boolean isligado;
	
	
	
	
	public Carro() {
		this.marca = "ford";
		this.modelo = "Ka";
		this.placa = "DNZ 4520";
		this.cor = "Vermelho";
		this.km = 29;
		this.litrosCombustivel = 20;
		this.velocidade = 5;
		this.preco = 30000;
		this.isligado = false;
	}
	
	public String getMarca(){
		return this.marca;
	}
	public String getModelo(){
		return this.modelo;
	}
	public String getPlaca(){
		return this.placa;
	}
	public String getCor(){
		return this.cor;
	}
	
	public double getKm(){
		return this.km;
	}
	
	public int getlitrosCombustivel(){
		return this.litrosCombustivel;
	}
	
	public int getVelocidade(){
		return this.velocidade;
	}
	
	public double getPreco(){
		return this.preco;
	}
	
	public boolean getIsligado() {
		return this.isligado;
	}
	
	
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setIsligado(boolean isligado) {
		this.isligado = isligado;
	}
	
	
	
	
	public void ligar() {
		
		if (this.isligado==true) {
			System.out.println("O carro já está ligado!");
		}else {
			this.isligado = true;
			System.out.println("Ligou!");
			
		}
		
	}
	
	public void desligar() {
		if (this.isligado==true) {
			this.isligado = false;
			System.out.println("O carro foi desligado!");
		}
		
	}
	
	public void acelerar() {
		if(this.isligado == true && this.litrosCombustivel > 0 ) {
			this.velocidade = this.velocidade + 20;
			this.litrosCombustivel = this.litrosCombustivel-1;
		}else {
			System.out.println("O carro está desligado, não é possivel acelerar");
		}
			
	}
	public void abastecer(int litros) {
			this.litrosCombustivel = this.litrosCombustivel + litros;
			if (this.litrosCombustivel < 101) {
			System.out.println("A quantidade de Combustivel é de: " + this.litrosCombustivel);
			
		} else {
			System.out.println("Você excedeu o limite de 100 litros.");
		}
		
	}
	public void frear() {
		if(this.isligado == false && this.velocidade <= 0) {
			System.out.println("O carro está desligado, não é possível frear!");
		}else {
			this.velocidade-=10;
		}
		
		
	}
	public void pintar(String corcarro) {
		if(corcarro == "vermelho") {
			this.cor = "amarelo";
			System.out.println("A cor do carro é "+this.cor );
		}
		else {
			this.cor = "vermelho";
			System.out.println("A cor do carro é "+this.cor );
			
		}
		
	}
	

}
