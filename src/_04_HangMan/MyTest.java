package _04_HangMan;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MyTest {
HangMan hangman = new HangMan();
	
	@Test
	void test() {
		assertEquals("____l", hangman.Torture("ideal", "_____", 'l'));
		
	}
	
	@Test
	void test2() {
		assertEquals("_a_a_a", hangman.Torture("banana", "______", 'a'));
		
	}
	@Test
	void test3() {
		assertEquals("______", hangman.Torture("banana", "______", 'q'));
		
	}
}
	