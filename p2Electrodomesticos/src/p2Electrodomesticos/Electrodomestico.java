package p2Electrodomesticos;

public class Electrodomestico {
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
	public Electrodomestico() { // Constructor default
		this.precioBase = PRECIO_DEFAULT;
		this.color = COLOR_DEFECTO;
		this.consumoEnergetico=CONSUMO_DEFAULT;
		this.peso = PESO_DEFAULT;
		
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
	}

	public Electrodomestico(double precio, double peso) { // Constructor precio, peso
		this.precioBase = precio;
		this.color = COLOR_DEFECTO;
		this.consumoEnergetico=CONSUMO_DEFAULT;
		this.peso = peso;
		
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
	}

	public Electrodomestico(double precio, double peso, String color, char consumo) { // Constructor todos
		this.precioBase = precio;
		this.color = color;
		this.peso = peso;
		this.consumoEnergetico = consumo;
		
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
	}

//METODOS_______________________________________
	public void comprobarConsumoEnergetico(char letra) {
		// comprueba letra correcta
	}

	public void comprobarColor(String color) {
		// color correcto o defecto
	}

	public double precioFinal(char consumo, double peso) {
		
		
		
		double precioFinal = 0;// segun consumo y tamano
		return precioFinal;
	}

//GET & SET_____________________________________

}
