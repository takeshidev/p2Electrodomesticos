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
		lista.items[0]=e1;
	
		Lavadora l1 = new Lavadora();
		l1.setPrecioBase(l1.precioFinal(l1.getConsumoEnergetico(), l1.getPeso()));
		lista.items[1]=l1;
		
		Lavadora l2 = new Lavadora(40);
		l2.setPrecioBase(l2.precioFinal(l2.getConsumoEnergetico(), l2.getPeso()));
		lista.items[2]=l2;
		
		Lavadora l3 = new Lavadora(70000, 40);
		l3.setPrecioBase(l3.precioFinal(l3.getConsumoEnergetico(), l3.getPeso()));
		lista.items[3]=l3;
		
		Televisor t1= new Televisor();
		t1.setPrecioBase(t1.precioFinal(t1.getConsumoEnergetico(), t1.getPeso()));
		lista.items[4]=t1;
		
		Televisor t2= new Televisor(60, true);
		t2.setPrecioBase(t2.precioFinal(t2.getConsumoEnergetico(), t2.getPeso()));
		lista.items[5]=t2;
		
		Televisor t3= new Televisor(250000, 90);
		t3.setPrecioBase(t3.precioFinal(t3.getConsumoEnergetico(), t3.getPeso()));
		lista.items[6]=t3;
		
		Electrodomesticos e2 = new ElectrodomesticoOtro(50000, 37);
		e2.setPrecioBase(e2.precioFinal(e2.getConsumoEnergetico(), e2.getPeso()));
		lista.items[7]=e2;
		
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
