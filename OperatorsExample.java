package AllProgram;

public class OperatorsExample {
	

	    public static void main(String[] args) {
	        int a = 10;
	        int b = 20;
	        boolean x = true;
	        boolean y = false;

	        // Relational Operators
	        System.out.println("Relational Operators:");
	        System.out.println("a = " + a + ", b = " + b);
	        System.out.println("a == b : " + (a == b)); // Checks if a is equal to b
	        System.out.println("a != b : " + (a != b)); // Checks if a is not equal to b
	        System.out.println("a > b  : " + (a > b));  // Checks if a is greater than b
	        System.out.println("a < b  : " + (a < b));  // Checks if a is less than b
	        System.out.println("a >= b : " + (a >= b)); // Checks if a is greater than or equal to b
	        System.out.println("a <= b : " + (a <= b)); // Checks if a is less than or equal to b

	        // Logical Operators
	        System.out.println("\nLogical Operators:");
	        System.out.println("x = " + x + ", y = " + y);
	        System.out.println("x && y : " + (x && y)); // Logical AND - true if both x and y are true
	        System.out.println("x || y : " + (x || y)); // Logical OR - true if either x or y is true
	        System.out.println("!x     : " + (!x));     // Logical NOT - reverses the value of x
	        System.out.println("!y     : " + (!y));     // Logical NOT - reverses the value of y
	    }
	
}
