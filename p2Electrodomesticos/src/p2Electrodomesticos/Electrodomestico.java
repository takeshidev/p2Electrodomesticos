package p2Electrodomesticos;

public class Electrodomestico {
//ATRIBUTOS_____________________________________
	private double precioBase;
	private String color;
	private String consumoEnergetico;
	private double peso;
	
	private final double PRECIO_DEFAULT=100000;
	private final String COLOR_DEFECTO="Blanco";
	private final double PESO_DEFAULT=5;

	
// CONSTRUCTORES________________________________
	public Electrodomestico() {    //Constructor default
		this.precioBase=PRECIO_DEFAULT;
		this.color=COLOR_DEFECTO;
		this.peso=PESO_DEFAULT;
	}
	public Electrodomestico(double precio, double peso) {    //Constructor precio, peso
		this.precioBase=precio;
		this.color=COLOR_DEFECTO;
		this.peso=peso; 
	}
	public Electrodomestico(double precio, double peso, String color, String consumo) {    //Constructor todos
		this.precioBase=precio;
		this.color=COLOR_DEFECTO;
		this.peso=peso; 
		this.consumoEnergetico=consumo;
	}

//METODOS_______________________________________
}
