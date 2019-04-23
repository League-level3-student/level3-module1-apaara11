package _04_HangMan;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MyTest {

	@Test
	void test() {
		assertEquals("____l", HangMan.Torture("ideal", "_____", 'l'));
		
	}
	
	@Test
	void test2() {
		assertEquals("_a_a_a", HangMan.Torture("banana", "______", 'a'));
		
	}
	@Test
	void test3() {
		assertEquals("______", HangMan.Torture("banana", "______", 'q'));
		
	}
}
