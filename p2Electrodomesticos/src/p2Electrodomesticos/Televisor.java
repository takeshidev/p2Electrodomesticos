package p2Electrodomesticos;
/**
 * Clase Televisor, subclase de Electrodomesticos
 * @author takeshi
 *
 */
public class Televisor extends Electrodomesticos {
//ATRIBUTOS_____________________________________
	private float resolucion; // pulgadas
	private boolean sintonizadorTDT;

	private final float RESOLUCION_DEFAULT = 20;
	private final boolean SINTONIZADOR_DEFAULT = false;

// CONSTRUCTORES________________________________
	public Televisor() {
		super();
		this.resolucion = RESOLUCION_DEFAULT;
		this.sintonizadorTDT = SINTONIZADOR_DEFAULT;
	}

	public Televisor(double precio, double peso) {
		super(precio, peso);
		this.resolucion = RESOLUCION_DEFAULT;
		this.sintonizadorTDT = SINTONIZADOR_DEFAULT;
	}

	public Televisor(float resolucion, boolean sintonizador) {
		super();
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizador;
	}
//METODOS_______________________________________
/**
 * Calcula el precio final del objeto televisor
 */
	public double precioFinal(char consumo, double peso) {

		double adicionalConsumo = Utiles.precioConsumo(consumo);
		double adicionalPeso = Utiles.precioPeso(peso);
		double adicionalSintonizador = Utiles.precioSintonizador(isSintonizadorTDT());
		double incrementoPulgadas = Utiles.incrementoPulgadas(getResolucion());
		double precioFinal = (getPrecioBase() + adicionalConsumo + adicionalPeso + adicionalSintonizador)
				* incrementoPulgadas;
		return precioFinal;
	}

//GET & SET_____________________________________
	/**
	 * @return the resolucion
	 */
	public float getResolucion() {
		return resolucion;
	}

	/**
	 * @return the sintonizadorTDT
	 */
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
}
