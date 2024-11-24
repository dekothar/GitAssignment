package test;

import src.Subtractor;

public class SubtractorTest {
	public void testSubtract() {
	     Subtractor subtractor = new Subtractor();
	     int result = subtractor.substract(5,2);
	     
		assert(result==3);
	   }
}
