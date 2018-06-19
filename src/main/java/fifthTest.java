package main.java;

import static org.junit.Assert.*;

import org.junit.Test;

import vishalhello.VOWEL;
import vishalhello.fifth;

public class fifthTest {

	@Test
	public void test() {
		fifth p=new fifth();
		int actualvalue=p.sumEven("123456");
		int expectedVlaue=123456;
		assertEquals(expectedVlaue, actualvalue);
	}
	@Test
	public void test1() {
		fifth p=new fifth();
		int actualvalue=p.sumEven("12 4 6");
		int expectedVlaue=22;
		assertEquals(expectedVlaue, actualvalue);
	}
	@Test
	public void test2() {
		fifth p=new fifth();
		int actualvalue=p.sumEven("@34%6");
		int expectedVlaue=0;
		assertEquals(expectedVlaue, actualvalue);
	}
}
