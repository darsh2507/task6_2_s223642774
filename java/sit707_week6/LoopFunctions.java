package sit707_week6;

public class LoopFunctions {

	  public int sumOfNumbers(int n) {
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum = sum + i; // Simple instruction in the loop body
	        }
	        return sum;
	    }

	    public int sumOfEvenNumbers(int n) {
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0) { // Conditional statement in the loop body
	                sum = sum + i;
	            }
	        }
	        return sum;
	    }
	
}
