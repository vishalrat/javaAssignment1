package main.java;

import static org.junit.Assert.*;

import org.junit.Test;


public class qtest {

	@Test
	public void test() {
		tomjerry x=new tomjerry();
		assertEquals("TOM",tomjerry.q(22));
	}	
}
