import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

	Person p1, p2, p3;
	
	@BeforeEach
	void setUp() throws Exception {
		
		p1 = new Person();
		p2 = new Person("Martha");
		p3 = new Person("Lois", 30, 25.50);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		p1 = p2 = p3 = null;
	}

	@Test
	void testGetName() {
		assertEquals(p1.getName(), "noname");
		p1.setName("Kate");
		assertEquals(p1.getName(), "Kate");
	}

	@Test
	void testGetAge() {
		assertEquals(p1.getAge(), 1);
		p1.setAge(27);
		assertEquals(p1.getAge(), 27);
	}

	@Test
	void testGetWage() {
		assertEquals(p1.getWage(), 10.0);
		p1.setWage(300.75);
		assertEquals(p1.getWage(), 300.75);
	}

	@Test
	void testHaveBirthday() {
		assertEquals(p3.getAge(), 30);
		p3.HaveBirthday();
		assertEquals(p3.getAge(), 31);
	}

	@Test
	void testIncreaseWage() {
		assertEquals(p3.getWage(), 25.5);
		p3.increaseWage(25.35);
		assertEquals(p3.getWage(), 31.96, 0.01);
	}

}
