package main.java;
import org.junit.Test;

import vishalhello.sdfgnm;

import static org.junit.Assert.*;





public class sdfgnmTest {

	@Test
	   public void testValidPalindrome() throws Exception {
	      //Arrange
			sdfgnm pl=new sdfgnm();
	      //Act
	      //Assert
	      assertTrue(pl.isPalindrome("2345432"));
	   }
	@Test
	   public void testValidPalindrome1() throws Exception {
	      //Arrange
			sdfgnm pl=new sdfgnm();
	      //Act
	      //Assert
	      assertFalse(pl.isPalindrome("234543"));
	   }
	
	   @Test
	   public void testGetEvenLetterSum() throws Exception {
	      //Arrange
	      int expectedValue=12;
	      sdfgnm pl=new sdfgnm();
	      //Act
	      int actualValue=pl.getEvenLetterSum("2345432");
	      //Assert
	      assertEquals(expectedValue, actualValue);
	   }

}
