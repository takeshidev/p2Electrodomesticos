package p2Electrodomesticos;
/**
 * Clase Utiles que contiene metodos que modifican el valor del precio acorde a sus atributos
 */
public class Utiles {
	/**
	 * Recibe una letra categoria de consumo y retorna el valor a adicionar al
	 * precio 
	 * 
	 * @param letra
	 * @return nuevoPrecio
	 */
	public static double precioConsumo(char letra) {
		double nuevoPrecio = 0;
		boolean inputCorrecto = false;
		if (letra == 'A') {
			nuevoPrecio = 100;
			inputCorrecto = true;
		} else if (letra == 'B') {
			nuevoPrecio = 80;
			inputCorrecto = true;
		} else if (letra == 'C') {
			nuevoPrecio = 60;
			inputCorrecto = true;
		} else if (letra == 'D') {
			nuevoPrecio = 50;
			inputCorrecto = true;
		} else if (letra == 'E') {
			nuevoPrecio = 30;
			inputCorrecto = true;
		} else {
			nuevoPrecio = 10;
			inputCorrecto = true;
		}
		return nuevoPrecio;
	}

	/**
	 * Recibe el peso y retorna el valor a adicionar al precio
	 * 
	 * @param peso
	 * @return
	 */
	public static double precioPeso(double peso) {
		double nuevoPrecio = 0;

		if (peso <= 19) {
			nuevoPrecio = 10;
		} else if (peso <= 49) {
			nuevoPrecio = 50;
		} else if (peso <= 79) {
			nuevoPrecio = 80;
		} else if (peso > 79) {
			nuevoPrecio = 100;
		} else
			nuevoPrecio = 10;
		return nuevoPrecio;
	}

	/**
	 * Recibe la carga de una Lavadora y retorna el valor a adicionar al precio
	 */
	public static double precioCarga(float carga) {
		double nuevoPrecio = 0;
		if (carga > 30) {
			nuevoPrecio += 50;
		}

		return nuevoPrecio;
	}

	/**
	 * Recibe si Televisor tiene Sintonizador y retorna el valor a adicionar al
	 * precio
	 */
	public static double precioSintonizador(boolean sintonizador) {
		double nuevoPrecio = 0;
		if (sintonizador) {
			nuevoPrecio = 50;
		}
		return nuevoPrecio;
	}

	/**
	 * Recibe el tamano del Televisor y retorna el porcentaje de incremento del
	 * precio
	 */
	public static double incrementoPulgadas(float pulgadas) {
		if (pulgadas > 40) {
			return 1.3;
		} else {
			return 1.0;
		}
	}
}
