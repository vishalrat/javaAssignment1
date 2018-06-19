package main.java;
import org.junit.Test;

import static org.junit.Assert.*;



public class tomjerryTest {

	 @Test
	   public void testDisplayResult3() throws Exception {
	      //Arrange
	      String expectedValue="TOM";
	      tomjerry pl=new tomjerry();
	      //Act
	      String actualValue=pl.q(25);
	      //Assert
	      assertEquals(expectedValue, actualValue);
	   }
	 
	 @Test
	   public void testDisplayResult41() throws Exception {
	      //Arrange
	      String expectedValue="TOM";
	      tomjerry pl=new tomjerry();
	      //Act
	      String actualValue=pl.q(26);
	      //Assert
	      assertEquals(expectedValue, actualValue);
	   }
	 @Test
	   public void testDisplayResult4() throws Exception {
	      //Arrange
	      String expectedValue="TOM";
	      tomjerry pl=new tomjerry();
	      //Act
	      String actualValue=pl.q(26);
	      //Assert
	      assertEquals(expectedValue, actualValue);
	   }
	

}
