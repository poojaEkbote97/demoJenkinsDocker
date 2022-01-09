package org.example.demoJenkins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMain {
    
  @Test
  public void testInputIsEven() {
	  assertTrue(Main.checkIfInputIsAnEvenNumber(122)); //
		
  }
}
