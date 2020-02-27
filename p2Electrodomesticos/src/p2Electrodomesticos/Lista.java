package p2Electrodomesticos;

public class Lista {
	Electrodomestico[] items = new Electrodomestico[10];

	public Lista() {

	}

	public void calculaElectrodomesticos() {
		double totalElectrodomesticos = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i] instanceof Electrodomestico) {
				totalElectrodomesticos += items[i].getPrecioBase();
				System.out.println(i+" "+items[i].getPrecioBase());
			}
		}
		System.out.println("Electrodomesticos: $" + totalElectrodomesticos);
	}
}
