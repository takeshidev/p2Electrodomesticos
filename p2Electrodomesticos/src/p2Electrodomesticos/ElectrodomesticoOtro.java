package p2Electrodomesticos;
/**
 * Clase ElectrodomesticoOtro que representa objetos que no son Televisor o Lavadora
 * @author Alumno
 *
 */
public class ElectrodomesticoOtro extends Electrodomesticos{

	public ElectrodomesticoOtro() {
		super();
	}
	
	public ElectrodomesticoOtro(double precio, double peso) { // Constructor precio, peso
		super();
		setPrecioBase(precio);
		setPeso(peso);
	}
}
