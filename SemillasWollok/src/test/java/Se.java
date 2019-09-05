import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Se {

	/*@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		
		
	}

	@After
	public void tearDown() throws Exception {
	}*/

	
	@Test
	public void test1() {
		/* una menta de 1 metro, debería dar semillas .*/
		Menta menta1 = new Menta(2007,1f);
		assertEquals(true, menta1.daSemillas());
		
	}
	@Test
	public void test2() {
		
		/* una menta de 1 metro, ocupa un espacio de 3 metros cuadrados.*/
		Menta menta2 = new Menta(2008,1f);
		assertEquals(3f,menta2.espacioQueOcupa(),0.01f);
		
	}
	
	
	@Test
	public void test3() {
		/*una menta de solo 0.3 metros,
		 *  no debería dar semillas */
		Menta menta3 = new Menta(2007,0.3f);
		assertEquals(false, menta3.daSemillas());
		assertEquals(0.9f,menta3.espacioQueOcupa(),0.01f);
		
	}
	
	@Test
	public void test4() {
		/*soja de 0.6 metros y de semilla de 2009, 
		 * la planta tendría una tolerancia al sol de 7 horas,
		 *  no daría semillas y ocuparía 0.3 m2. */
		Soja soja1 = new Soja(2009,0.6f);
		assertEquals(false, soja1.daSemillas());
		assertEquals(0.3f,soja1.espacioQueOcupa(),0.01f);
		assertEquals(7f, soja1.horasDeSolToleradas() ,0.01f);
			
	}
	
	@Test
	public void test5() {
		/*Una parcela de 20 mts. de ancho por 1 mt.
		 *  de largo que recibe 8 horas de sol por día, 
		 * tiene una superficie de 20 m2 y
		 *  la cantidad máxima de plantas que tolera es de 4. */
		Parcela p1 = new Parcela(20,1,8f);
	
		assertEquals(20,p1.superficie(),0.01);
		assertEquals(4, p1.maximoPlantas() ,0.01f);
			
	}
	
	@Test
	public void test6() {
		/*parcela con 4 plantas de menos 1.5mts de largo,sup 20mts, 
		 * es parcela ideal para la menta y la quinoa q soporta 8hs de sol , pero no para la
		 * soja ni la soja trans, por las horas de sol  */
		Parcela p1 = new Parcela(20,1,8f);
		Menta menta1 = new Menta(2007,1f);
		Soja soja1 = new Soja(2009,0.6f);
		Menta menta3 = new Menta(2007,0.3f);
		Menta menta2 = new Menta(2008,1f);
		SojaTransgenica soja2 = new SojaTransgenica(2008,0.3f);
		Quinoa quinoa1 = new Quinoa(2007,0.2f,8);
		p1.plantarUnaPlanta(menta1);
		p1.plantarUnaPlanta(soja1);
		p1.plantarUnaPlanta(menta3);
		
		assertEquals(false, soja1.parcelaIdeal(p1) );
		assertEquals(true, menta1.parcelaIdeal(p1));
		assertEquals(false, soja2.parcelaIdeal(p1));
		assertEquals(true, quinoa1.parcelaIdeal(p1));	
	}
	 
		
	}
	
	
	


