package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	Calculadora calc;
	
	private void extracted(float resultado, float esperado) {
		// TODO Auto-generated method stub
		
	}
	
	@Before
	public void Before() {
		calc = new Calculadora();	
		
	}
	@After
	public void After() {
		calc.Limiar();
	}
	
	//Suma PRUEBA
	@Test(timeout = 100)
	public void testSumaPositivos() throws Exception {
		System.out.println("TestSumaPositivos");
		float resultado = calc.Resta(3, 3);
		float esperado = 6;
		extracted(resultado, esperado);
		
	}
	
	@Test(timeout = 100)
	public void testSumaNegativos() throws Exception {
		System.out.println("TestSumaNegativo");
		float resultado = calc.Suma(-3, -3);
		float esperado = -6;
		extracted(resultado, esperado);
		
	}
	
	@Test(timeout = 100)
	public void testSumaNegativoYPositivo() throws Exception {
		System.out.println("TestSumaNegativo&Positivo");
		float resultado = calc.Suma(3, -3);
		float esperado = 0;
		extracted(resultado, esperado);
		
	}
	
	@Test(timeout = 100)
	public void testSumaMaxPermitido() throws Exception {
		System.out.println("TestSumaMaxPermitido");
		float resultado = calc.Suma(1111111111, 999999999);
		float esperado = 0;
		extracted(resultado, esperado);
		
	}
	
	@Test(timeout = 100)
	public void testSumaMinPermitido() throws Exception {
		System.out.println("TestSumaMinPermitido");
		float resultado = calc.Suma(-1111111111, 999999999);
		float esperado = 0;
		extracted(resultado, esperado);
		
	}
	
	
	//Resta PRUEBAS
	@Test(timeout = 100)
	public void testRestaPositivos() throws Exception {
		System.out.println("TestRestaPositivos");
		float resultado = calc.Resta(9, 3);
		float esperado = 6;
		extracted(resultado, esperado);
		
	}
	
	@Test(timeout = 100)
	public void testRestaNegativos() throws Exception {
		System.out.println("TestRestaNegativo");
		float resultado = calc.Resta(-6, -6);
		float esperado = 0;
		extracted(resultado, esperado);
		
	}
	
	@Test(timeout = 100)
	public void testRestaNegativoYPositivo() throws Exception {
		System.out.println("TestRestaNegativo&Positivo");
		float resultado = calc.Resta(3, -3);
		float esperado = 6;
		extracted(resultado, esperado);
		
	}
	
	
	@Test(timeout = 100)
	public void testRestaMinPermitido() throws Exception {
		System.out.println("TestRestaMinPermitido");
		float resultado = calc.Resta(-1111111111, -999999999);
		float esperado = 0;
		extracted(resultado, esperado);
		
	}
	
	
	//Multiplicacion Pruebas
	@Test(timeout = 100)
	public void testMultiplicacionPositivos() throws Exception {
		System.out.println("TestMultiplicacionPositivos");
		float resultado = calc.Multiplicacion(3, 3);
		float esperado = 9;
		extracted(resultado, esperado);
		
	}
	
	@Test(timeout = 100)
	public void testMultiplicacionNegativos() throws Exception {
		System.out.println("TestMultiplicacionNegativos");
		float resultado = calc.Multiplicacion(-3, -3);
		float esperado = 9;
		extracted(resultado, esperado);
		
	}
	
	@Test(timeout = 100)
	public void testMultiplicacionNegativoYPositivo() throws Exception {
		System.out.println("TestMultiplicacionNegativo&Positivo");
		float resultado = calc.Multiplicacion(3, -3);
		float esperado = -9;
		extracted(resultado, esperado);
		
	}
	
	@Test(timeout = 100)
	public void testMultiplicacionMaxPermitido() throws Exception {
		System.out.println("TestMultiplicacionMaxPermitido");
		float resultado = calc.Multiplicacion(1111111111, 999999999);
		float esperado = 0;
		extracted(resultado, esperado);
		
	}
	
	@Test(timeout = 100)
	public void testMultiplicacionMinPermitido() throws Exception {
		System.out.println("TestMultiplicacionMinPermitido");
		float resultado = calc.Multiplicacion(-1111111111, 999999999);
		float esperado = 0;
		extracted(resultado, esperado);
		
	}
	
	//Division Prueba
	@Test(timeout = 100)
	public void testDivisionPositivos() throws Exception {
		System.out.println("TestDivisionPositivos");
		float resultado = calc.Division(3, 3);
		float esperado = 1;
		extracted(resultado, esperado);
		
	}
	
	@Test(timeout = 100)
	public void testDivisionNegativos() throws Exception {
		System.out.println("TestDivisionNegativos");
		float resultado = calc.Division(-3, -3);
		float esperado = 1;
		extracted(resultado, esperado);
		
	}
	
	@Test(timeout = 100)
	public void testDivisionNegativoYPositivo() throws Exception {
		System.out.println("TestDivisionNegativo&Positivo");
		float resultado = calc.Division(3, -3);
		float esperado = -1;
		extracted(resultado, esperado);
		
	}
	@Test(timeout = 100)
	public void testDivisionCero() throws Exception{
		System.out.println("TestDivisionCero");
		float resultado = calc.Division(7, 0);
		float esperado = 0;
		extracted(resultado, esperado);
	}
	
	
	//Resto Prueba
	@Test(timeout = 100)
	public void testRestoPositivos() throws Exception {
		System.out.println("TestRestoPositivos");
		float resultado = calc.Resto(3, 3);
		float esperado = 1;
		extracted(resultado, esperado);
			
	}
		
	@Test(timeout = 100)
	public void testRestoNegativos() throws Exception {
		System.out.println("TestRestoNegativos");
		float resultado = calc.Resto(-3, -3);
		float esperado = 1;
		extracted(resultado, esperado);		
		}
		
	@Test(timeout = 100)
	public void testRestoNegativoYPositivo() throws Exception {
		System.out.println("TestRestoNegativo&Positivo");
		float resultado = calc.Resto(3, -3);
		float esperado = -1;
		extracted(resultado, esperado);	
	}
	
	@Test(timeout = 100)
	public void testRestoCero() throws Exception{
		System.out.println("TestRestoCero");
		float resultado = calc.Resto(7, 0);
		float esperado = 0;
		extracted(resultado, esperado);
	}
		
	//Potencia Prueba
	@Test(timeout = 100)
	public void testPotenciaPositivos() throws Exception {
		System.out.println("TestPotenciaPositivos");
		float resultado = calc.Potencia(3, 3);
		float esperado = 27;
		extracted(resultado, esperado);			
	}
	@Test(timeout = 100)
	public void testPotenciaNegativos() throws Exception {
		System.out.println("TestPotenciaNegativos");
		float resultado = calc.Potencia(-2, -2);
		float esperado = (float) 0.25;
		extracted(resultado, esperado);
				
	}
	@Test(timeout = 100)
	public void testPotenciaNegativoYPositivo() throws Exception {
		System.out.println("TestRestoNegativo&Positivo");
		float resultado = calc.Potencia(1, -3);
		float esperado = 1;
		extracted(resultado, esperado);
		
	}
	
	


	
	

}
