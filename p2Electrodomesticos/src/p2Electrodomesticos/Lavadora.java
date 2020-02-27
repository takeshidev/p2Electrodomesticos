package p2Electrodomesticos;

public class Lavadora extends Electrodomesticos{
//ATRIBUTOS_____________________________________
	private float carga;
	
	private final float CARGA_DEFAULT= 5;
// CONSTRUCTORES________________________________
	public Lavadora() {
		super();
		this.carga=CARGA_DEFAULT;
	}
	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga=CARGA_DEFAULT;
	}
	public Lavadora(float carga) {
		super();
		this.carga=carga;
	}
//METODOS_______________________________________
	public double precioFinal(char consumo, double peso) {
	
		double adicionalConsumo = Utiles.precioConsumo(consumo);
		double adicionalPeso = Utiles.precioPeso(peso);
		double adicionalCarga = Utiles.precioCarga(getCarga());
		double precioFinal = getPrecioBase()+adicionalConsumo+adicionalPeso+adicionalCarga;
		return precioFinal;
	}
//GET & SET_____________________________________
		//solo get carga
	public float getCarga() {
		return carga;
	}
}

