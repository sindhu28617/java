package AllProgram
{
		public class AddNumbers {
			
		    public static int add(int number1, int number2) {
		        int sum = number1 + number2; 
		        return sum; 
		    }

		    public static void main(String[] args) {
		        int num1 = 4; // First number
		        int num2 = 8; // Second number
		        
		        int total = add(num1, num2);

		        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + total);
		    }
	}

