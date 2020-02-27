package p2Electrodomesticos;

public class Utiles {
	/**
	 * Recibe una letra categoria de consumo y retorna el valor a adicionar al
	 * precio
	 * 
	 * @param letra
	 * @return
	 */
	public static double precioConsumo(char letra) {
		double nuevoPrecio = 0;
		boolean inputCorrecto = false;
		if (letra == 'A') {
			nuevoPrecio = 100;
			inputCorrecto = true;
		}
		if (letra == 'B') {
			nuevoPrecio = 80;
			inputCorrecto = true;
		}
		if (letra == 'C') {
			nuevoPrecio = 60;
			inputCorrecto = true;
		}
		if (letra == 'D') {
			nuevoPrecio = 50;
			inputCorrecto = true;
		}
		if (letra == 'E') {
			nuevoPrecio = 30;
			inputCorrecto = true;
		}
		if (letra == 'F') {
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
		boolean inputCorrecto = false;

		if (peso <= 19) {
			nuevoPrecio = 10;
			inputCorrecto = true;
		} else if (peso <= 49) {
			nuevoPrecio = 50;
			inputCorrecto = true;
		} else if (peso <= 79) {
			nuevoPrecio = 80;
			inputCorrecto = true;
		} else if (peso > 79) {
			nuevoPrecio = 100;
			inputCorrecto = true;
		}
		return nuevoPrecio;
	}
}
