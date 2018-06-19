package main.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.sdfgnm;

public class sdfgnmTestTest {

	@Test
	   public void testValidPalindrome() throws Exception {
	      //Arrange
			sdfgnm pl=new sdfgnm();
	      //Act
	      //Assert
	      assertTrue(pl.isPalindrome("2345432"));
	   }

}
