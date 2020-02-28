package p2Electrodomesticos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilesTest {

	@Test
	void testPrecioConsumo() {
		double x = Utiles.precioConsumo('A');
		assertEquals(100, x);
		x = Utiles.precioConsumo('B');
		assertEquals(80, x);
		x = Utiles.precioConsumo('C');
		assertEquals(60, x);
		x = Utiles.precioConsumo('d');
		assertEquals(10, x);
		x = Utiles.precioConsumo('x');
		assertEquals(10, x);
		x = Utiles.precioConsumo('4');
		assertEquals(10, x);
	}

	@Test
	void testPrecioPeso() {
		double test = Utiles.precioPeso(10);
		assertEquals(10, test);
		test = Utiles.precioPeso(37);
		assertEquals(50, test);
		test = Utiles.precioPeso(65);
		assertEquals(80, test);
		test = Utiles.precioPeso(80);
		assertEquals(100, test);
		test = Utiles.precioPeso(-888);
		assertEquals(10, test);
		test = Utiles.precioPeso(888);
		assertEquals(100, test);
	}

	@Test
	void testPrecioCarga() {
		double test;
		test = Utiles.precioCarga(-888);
		assertEquals(0, test);
		test = Utiles.precioCarga(0);
		assertEquals(0, test);
		test = Utiles.precioCarga(29);
		assertEquals(0, test);
		test = Utiles.precioCarga(31);
		assertEquals(50, test);
		test = Utiles.precioCarga(999);
		assertEquals(50, test);
	}

	@Test
	void testPrecioSintonizador() {
		double test;
		test = Utiles.precioSintonizador(true);
		assertEquals(50, test);
		test = Utiles.precioSintonizador(false);
		assertEquals(0, test);
	}

	@Test
	void testIncrementoPulgadas() {
		double test;
		test = Utiles.incrementoPulgadas(0);
		assertEquals(1.0, test);
		test = Utiles.incrementoPulgadas(39);
		assertEquals(1.0, test);
		test = Utiles.incrementoPulgadas(70);
		assertEquals(1.3, test);
		test = Utiles.incrementoPulgadas(999);
		assertEquals(1.3, test);
	}

}
