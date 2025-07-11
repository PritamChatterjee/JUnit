/**
 * 
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import demo.Calculator;

/**
 * 
 */
public class TestCalculator {
	Calculator calculator;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass: This method runs once before all tests in this class.");
	}

	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
		System.out.println("SetUp: This method runs before each test method to initialize the calculator.");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
			calculator = null;
			System.gc();
	}

	/**
	 * Test method for {@link demo.Calculator#add(int, int)}.
	 */
	@Test
	public void testAddition() {
		
		assertEquals(5, calculator.add(2, 3));
		assertEquals(0, calculator.add(-1, 1));
		assertEquals(-5, calculator.add(-2, -3));
	}
	/**
	 * Test method for {@link demo.Calculator#subtract(int, int)}.
	 */
	@Test
	public void testSubtraction() {
		
		assertEquals(1, calculator.subtract(3, 2));
		assertEquals(-2, calculator.subtract(-1, 1));
		assertEquals(1, calculator.subtract(-2, -3));
	}
	/**
	 * Test method for {@link demo.Calculator#multiply(int, int)}.
	 */
	@Test
	public void testMultiplication() {
		
		assertEquals(6, calculator.multiply(2, 3));
		assertEquals(-1, calculator.multiply(-1, 1));
		assertEquals(6, calculator.multiply(-2, -3));
	}
	/**
	 * Test method for {@link demo.Calculator#divide(int, int)}.
	 */
	@Test
	public void testDivision() {
		
		assertEquals(2, calculator.divide(6, 3));
		assertEquals(-1, calculator.divide(-1, 1));
		assertEquals(2, calculator.divide(-6, -3));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivisionByZero() {
		
		calculator.divide(1, 0);
	}
}
