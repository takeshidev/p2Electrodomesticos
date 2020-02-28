package p2Electrodomesticos;
/**
 * Crea objeto Lista que contiene array items
 */
public class Lista {
	Electrodomesticos[] items = new Electrodomesticos[10];

// CONSTRUCTORES________________________________
	public Lista() {
	}

//METODOS_______________________________________

	/**
	 * Calcula y muestra el precio total de los Electrodomesticos
	 */
	public void calculaTodo() {
		double totalTodo = 0;
		System.out.println("Todos los items:");
		for (int i = 0; i < items.length; i++) {
			if (items[i] instanceof Electrodomesticos) {
				totalTodo += items[i].getPrecioBase();
				System.out.println("["+i+"]" + " $" + items[i].getPrecioBase() +"  "+items[i].toString());
			}
		}
		System.out.println("Total final: $" + totalTodo);
	}
	/**
	 * Calcula y muestra el precio total de los electrodomesticos que no son Televisor o Lavadora
	 */
	public void calculaElectrodomesticosOtros() {
		double totalElectrodomesticos = 0;
		System.out.println("\nOtros electrodomesticos:");
		for (int i = 0; i < items.length; i++) {
			if (items[i] instanceof ElectrodomesticoOtro) {
				totalElectrodomesticos += items[i].getPrecioBase();
				System.out.println("["+i+"]" + " $" + items[i].getPrecioBase() +"  "+items[i].toString());
			}
		}
		System.out.println("Total otros electrodomesticos: $" + totalElectrodomesticos+"\n");
	}
	/**
	 * Calcula y muestra el precio total de las Lavadoras
	 */
	public void calculaLavadoras() {
		double totalLavadoras = 0;
		System.out.println("Lavadoras:");
		for (int i = 0; i < items.length; i++) {
			if (items[i] instanceof Lavadora) {
				totalLavadoras += items[i].getPrecioBase();
				System.out.println("["+i+"]" + " $" + items[i].getPrecioBase() +"  "+items[i].toString() );
			}
		}
		System.out.println("Total lavadoras: $" + totalLavadoras+"\n");
	}

	/**
	 * Calcula y muestra el precio total de los Televisores
	 */
	public void calculaTelevisores() {
		double totalTelevisores = 0;
		System.out.println("Televisores:");
		for (int i = 0; i < items.length; i++) {
			if (items[i] instanceof Televisor) {
				totalTelevisores += items[i].getPrecioBase();
				System.out.println("["+i+"]" + " $" + items[i].getPrecioBase() +"  "+items[i].toString() );
			}
		}
		System.out.println("Total televisores: $" + totalTelevisores +"\n");
	}

}
