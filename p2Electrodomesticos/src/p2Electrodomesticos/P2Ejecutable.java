package p2Electrodomesticos;
/**
 *  Ejecutable del Proyecto Electrodomesticos. Prueba 2 FullStack Java
 * @author Takeshi Kita
 *
 */
public class P2Ejecutable{

	public static void main(String[] args) {
		
		Lista lista = new Lista();
//CREACION ITEMS__________________________
		System.out.println("Fabricando electrodomesticos...");
		
		Electrodomesticos e1 = new ElectrodomesticoOtro();
		e1.setPrecioBase(e1.precioFinal(e1.getConsumoEnergetico(), e1.getPeso()));
		e1.setColor("Rojo");
		lista.items[0]=e1;
	
		Lavadora l1 = new Lavadora();
		l1.setPrecioBase(l1.precioFinal(l1.getConsumoEnergetico(), l1.getPeso()));
		l1.setColor("Gris");
		l1.setConsumoEnergetico('A');
		lista.items[1]=l1;
		
		Lavadora l2 = new Lavadora(40);
		l2.setPrecioBase(l2.precioFinal(l2.getConsumoEnergetico(), l2.getPeso()));
		l2.setColor("MultiColor"); //debe aparecer color default
		l2.setConsumoEnergetico('C');
		lista.items[2]=l2;
		
		Lavadora l3 = new Lavadora(70000, 40);
		l3.setPrecioBase(l3.precioFinal(l3.getConsumoEnergetico(), l3.getPeso()));
		lista.items[3]=l3;
		
		Televisor t1= new Televisor();
		t1.setPrecioBase(t1.precioFinal(t1.getConsumoEnergetico(), t1.getPeso()));
		t1.setConsumoEnergetico('A');
		lista.items[4]=t1;
		
		Televisor t2= new Televisor(60, true);
		t2.setPrecioBase(t2.precioFinal(t2.getConsumoEnergetico(), t2.getPeso()));
		t2.setConsumoEnergetico('B');
		lista.items[5]=t2;
		
		Televisor t3= new Televisor(250000, 90);
		t3.setPrecioBase(t3.precioFinal(t3.getConsumoEnergetico(), t3.getPeso()));
		t3.setConsumoEnergetico('8'); //debe aparecer valor default
		t3.setColor("AZUL");
		lista.items[6]=t3;
		
		Electrodomesticos e2 = new ElectrodomesticoOtro(50000, 37);
		e2.setPrecioBase(e2.precioFinal(e2.getConsumoEnergetico(), e2.getPeso()));
		e2.setColor("COLOR BOniTo");
		lista.items[7]=e2;
		
		Lavadora l4 = new Lavadora(110000, 45);
		l4.setPrecioBase(l4.precioFinal(l4.getConsumoEnergetico(), l4.getPeso()));
		lista.items[8]=l4;
		
		Televisor t4= new Televisor(200000, 55);
		t4.setPrecioBase(t4.precioFinal(t4.getConsumoEnergetico(), t4.getPeso()));
		t4.setConsumoEnergetico('D');
		lista.items[9]=t4;
		
		creaElectrodomesticos();
//MUESTRA TOTALES________________________________________
		lista.calculaElectrodomesticosOtros();
		lista.calculaTelevisores();
		lista.calculaLavadoras();
		lista.calculaTodo();
		

		
		
	}// main
	
	
	public static void creaElectrodomesticos() {
		

	}

}
