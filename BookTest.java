package lab0;

/******

Name: Molly Domino

Assignment: Lab 0

Date: 1/11/24

Notes: The following is a file testing the getters for the class Book.
Since all of the attributes in Book are private, we're making sure the methods that return the values associated with those attributes works properly 

******/

import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
	private Book wanderingInn;

	private String title;
	private Person wInnAuthor;
	private float price;

	@Before
	public void setUp() {

		this.title = "The Wandering Inn";
		this.wInnAuthor = new Person("Pirateaba", "", 1992);
		this.price = 0.0f;
		this.wanderingInn = new Book(title, wInnAuthor, price);

	}

	@Test
	public void testGetTitle() {
		String expected = title;
		String result = this.wanderingInn.getTitle();
		assertEquals(expected, result);
	}

	@Test
	public void testGetPrice() {
		float expected = price;
		float result = this.wanderingInn.getPrice();
		assertEquals(expected, result, 0.01);
	}

	@Test
	public void testGetAuthor() {
		// We can't just do object comparison here!
		// Test that the values for attributes are the same
		Person expected = wInnAuthor;
		Person result = this.wanderingInn.getAuthor();

		assertEquals(expected.getFirstName(), result.getFirstName());
		assertEquals(expected.getLastName(), result.getLastName());
		assertEquals(expected.getYearOfBirth(), result.getYearOfBirth());
	}

}
