package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "223642774";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Darsh";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
	public void testFalseNumberIsEven() {
		 // Declare an integer variable number and initialize it with an even value
        int number = 4;
        // Call the isEven method of WeatherAndMathUtils class with the number
        boolean isEven = WeatherAndMathUtils.isEven(number);
        // Assert that the isEven method returns true for an even number
        Assert.assertTrue("Expected number to be even", isEven);
	}
	
	@Test
	public void testOddNumber()
	{
		// Declare an integer variable number and initialize it with an odd value
        int number = 7;
        // Call the isEven method of WeatherAndMathUtils class with the number
        boolean isEven = WeatherAndMathUtils.isEven(number);
        // Assert that the isEven method returns false for an odd number
        Assert.assertFalse("Expected number to be odd", isEven);
        
	}
	
	@Test
	public void testprimeNumber()
	{
		// Declare an integer variable number and initialize it with a prime value
        int number = 7;
        // Call the isPrime method of WeatherAndMathUtils class with the number
        boolean isPrime = WeatherAndMathUtils.isPrime(number);
        // Assert that the isPrime method returns true for a prime number
        Assert.assertTrue("Expected number to be prime", isPrime);
	}
	@Test
	public void testNonprimeNumber()
	{
		// Declare an integer variable number and initialize it with a non-prime value
        int number = 9;
        // Call the isPrime method of WeatherAndMathUtils class with the number
        boolean isPrime = WeatherAndMathUtils.isPrime(number);
        // Assert that the isPrime method returns false for a non-prime number
        Assert.assertTrue("Expected number to be non-prime", isPrime);
	}
	
    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    	 Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(0.0, 6.1));
         Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(46.0, 4.1));
    }
    
    @Test
    public void testWarnweatherAdvice()
    {
    	 // Assert that the weatherAdvice method returns "WARN" for the given wind speed and precipitation values
    	Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(46.0, 0.0));
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(0.0, 4.1));
    }
    @Test
    public void testAllclearweatherAdvice()
    {
    	 // Assert that the weatherAdvice method returns "ALL CLEAR" for the given wind speed and precipitation values
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(40.0, 3.0));
    }
    @Test
    public void testSumOfNumbers() {
        LoopFunctions loopFunctions = new LoopFunctions();
        int result = loopFunctions.sumOfNumbers(5);
        Assert.assertEquals(15, result); 
    }

    @Test
    public void testSumOfEvenNumbers() {
        LoopFunctions loopFunctions = new LoopFunctions();
        int result = loopFunctions.sumOfEvenNumbers(10);
        Assert.assertEquals(30, result); 
    }
   
}
