package com.adneom.fizzBuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void multiplesOfThree() {
		FizzBuzz fizzBuzz = new FizzBuzz();	
	   assertEquals("Fizz", fizzBuzz.fizzBuzz(9));
	}
	
	@Test
	public void multiplesOfFive() {
		FizzBuzz fizzBuzz = new FizzBuzz();	
	   assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
	}
	
	@Test
	public void multiplesOfThreeAndFive() {
		FizzBuzz fizzBuzz = new FizzBuzz();	
	   assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(30));
	}
	
	@Test
	public void notMultiplesOfThreeAndFive() {
		FizzBuzz fizzBuzz = new FizzBuzz();	
	   assertEquals("2", fizzBuzz.fizzBuzz(2));
	}

}
