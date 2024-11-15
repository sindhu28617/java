package AllProgram
{
		public class AddNumbers {

		    // This method takes two integers as input and returns their sum
		    public static int add(int number1, int number2) {
		        int sum = number1 + number2; // Calculate the sum
		        return sum; // Return the sum to where the method was called
		    }

		    public static void main(String[] args) {
		        int num1 = 4; // First number
		        int num2 = 8; // Second number

		        // Call the add method and store the result in total
		        int total = add(num1, num2);

		        // Display the result
		        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + total);
		    }
	}

