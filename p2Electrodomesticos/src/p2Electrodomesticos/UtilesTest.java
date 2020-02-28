package p2Electrodomesticos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilesTest {

	@Test
	void testPrecioConsumo() {
		double x = Utiles.precioConsumo('A');
		System.out.println(x);
		assertEquals(100, x);
		x = Utiles.precioConsumo('B');
		System.out.println(x);
		assertEquals(80, x);
		x = Utiles.precioConsumo('C');
		System.out.println(x);
		assertEquals(60, x);
		x = Utiles.precioConsumo('d');
		System.out.println(x);
		assertEquals(10, x);
		x = Utiles.precioConsumo('4');
		System.out.println(x);
		assertEquals(10, x);
	}
//
//	@Test
//	void testPrecioPeso() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testPrecioCarga() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testPrecioSintonizador() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testIncrementoPulgadas() {
//		fail("Not yet implemented");
//	}

}
