package entities;

import entities.enums.Color;

public abstract class Forma {
	
	private Color cor;
	
	public Forma() {
		
	}

	public Forma(Color cor) {
		
		this.cor = cor;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;}
	
	public abstract double area();
	
	
	
	
	
	
	
	
	}


	
	
	