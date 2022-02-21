import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import test.Circulo_ADA;

class Circulo_ADATest {

	private double radio;
	static final double PI = 3.1416;
	
	
	@Test
	void test() {
		
		Circulo_ADA circ1 = new Circulo_ADA(7, "tipoFigura");
		assertEquals(153.9384, circ1.area());
		assertEquals(43.9824, circ1.perimetro());
		
		Circulo_ADA circ2 = new Circulo_ADA(0, "tipoFigura");
		assertEquals(0, circ2.area());
		assertEquals(0, circ2.perimetro());
		
		Circulo_ADA circ3 = new Circulo_ADA(-3, "tipoFigura");
		assertEquals(28.2744, circ3.area());
		assertEquals(18.8496, circ3.perimetro());

		

}
	
}
