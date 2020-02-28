package p2Electrodomesticos;

public class Electrodomesticos {
//ATRIBUTOS_____________________________________
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;

	private final double PRECIO_DEFAULT = 100000;
	private final String COLOR_DEFECTO = "Blanco";
	private final char CONSUMO_DEFAULT = 'F';
	private final double PESO_DEFAULT = 5;

// CONSTRUCTORES________________________________
	public Electrodomesticos() { // Constructor default
		this.precioBase = PRECIO_DEFAULT;
		this.color = COLOR_DEFECTO;
		this.consumoEnergetico=CONSUMO_DEFAULT;
		this.peso = PESO_DEFAULT;
		
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
	}

	public Electrodomesticos(double precio, double peso) { // Constructor precio, peso
		this.precioBase = precio;
		this.color = COLOR_DEFECTO;
		this.consumoEnergetico=CONSUMO_DEFAULT;
		this.peso = peso;
		
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
	}

	public Electrodomesticos(double precio, double peso, String color, char consumo) { // Constructor todos
		this.precioBase = precio;
		this.color = color;
		this.peso = peso;
		this.consumoEnergetico = consumo;
		
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
	}

//METODOS_______________________________________
	private void comprobarConsumoEnergetico(char letra) {
		if (letra=='A'||letra=='B'||letra=='C'||letra=='D'||letra=='E'||letra=='F') {
			System.out.print("Codigo consumo ok. \t ");
		}else {
			System.out.print("Codigo consumo erroneo, se usara valor por defecto. \t");
			setConsumoEnergetico(CONSUMO_DEFAULT);
		}
	}

	private void comprobarColor(String color) {
		if (color.equalsIgnoreCase("blanco")||color.equalsIgnoreCase("negro")||color.equalsIgnoreCase("rojo")||color.equalsIgnoreCase("azul")||color.equalsIgnoreCase("gris")) {
			System.out.print("Color ok. \n");
		}else {
			setColor(COLOR_DEFECTO);
			System.out.print("Color no existente. Se usara color default.\n");
		}
	}

	public double precioFinal(char consumo, double peso) {
		
		double adicionalConsumo = Utiles.precioConsumo(consumo);
		double adicionalPeso = Utiles.precioPeso(peso);
		double precioFinal = precioBase+adicionalConsumo+adicionalPeso;
		return precioFinal;
	}

	
//GETs & SETs___________________________________
	/**
	 * @return the precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * @param precioBase the precioBase to set
	 */
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the consumoEnergetico
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * @param consumoEnergetico the consumoEnergetico to set
	 */
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

}
