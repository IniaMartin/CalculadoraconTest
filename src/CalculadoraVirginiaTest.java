

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraVirginiaTest {

	@Test
	void testsumar() {
		double a = 2;
		double b = 3;
		double expectresult = 5;
		double resu = CalculadoraVirginia.addition(a,b);
		assertEquals(expectresult, resu);
	}
	
	@Test
	void testrestar() {
		double a = 2;
		double b = 3;
		double expectresult = -1;
		double resu = CalculadoraVirginia.subtraction(a, b);
		assertEquals(expectresult, resu);
	}
	
	@Test
	void testmultiplicar() {
		double a = 6;
		double b = 3;
		double expectresult = 18;
		double resu = CalculadoraVirginia.multiplication(a, b);
		assertEquals(expectresult, resu);
	}
	
	@Test
	void testdividir() {
		double a = 7;
		double b = 2;
		double expectresult = 3;
		double resu = CalculadoraVirginia.division(a, b);
		assertEquals(expectresult, resu);
	}

}
