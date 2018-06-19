package main.java;

import static org.junit.Assert.*;


import org.junit.Test;

import vishalhello.VOWEL;




public class VOWELTest {

	@Test
	public void test() {
		VOWEL p=new VOWEL();
		String actualvalue=p.vowelConsonants("abcdef");
		String expectedVlaue="VowelConsonantConsonantConsonantVowelConsonant";
		assertEquals(expectedVlaue, actualvalue);
		
	}
	@Test
	public void test1() {
		VOWEL p=new VOWEL();
		String actualvalue=p.vowelConsonants("12@we");
		String expectedVlaue="Not a alphabetNot a alphabetNot a alphabetConsonantVowel";
		assertEquals(expectedVlaue, actualvalue);
		
	}
}
