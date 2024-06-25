package lab0;

/******

Name: Molly Domino

Assignment: Lab 0

Date: 1/11/24

Notes: This class tests the getters in the Person class. 
Since all attributes in that class are private, these tests ensure the getters return the appropriate attribute valuesF

******/

import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * A JUnit test class for the Person class.
 */
public class PersonTest {

	private Person john;

	@Before
	public void setUp() {
		john = new Person("John", "Doe", 1945);
	}

	@Test
	public void testFirst() {
		assertEquals("John", john.getFirstName());

	}

	@Test
	public void testSecond() {
		assertEquals("Doe", john.getLastName());
	}

	@Test
	public void testYearOfBirth() {
		assertEquals(1945, john.getYearOfBirth());
	}

}
