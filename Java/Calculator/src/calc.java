import java.util.Scanner;
public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.println("Put in a first number.");
			double num1 = scan.nextDouble();
			System.out.println("Put in a second number.");
			double num2 = scan.nextDouble();
			// System.out.println("What operation would you like to use?  Multiplication, division, addition, or subtraction?  Put in either m, d, a, or s for the operations, respectively.");
			// scan.nextLine();
			// String operator = scan.nextLine();
			System.out.println("Menu");
			System.out.println("<1> Multiplication");
			System.out.println("<2> Division");
			System.out.println("<3> Addition");
			System.out.println("<4> Subtraction");
			System.out.println("Put in 1 for multiplication, 2 for division, 3 for addition, and 4 for subtraction.");
			int operator = scan.nextInt();
			
			switch (operator){
			
				case 1:
					double result1 = num1 * num2;
					System.out.println(num1+"*"+num2+"="+result1);
					break;
				case 2:
					double result2 = num1 / num2;
					System.out.println(num1+"/"+num2+"="+result2);
					break;
				case 3:
					double result3 = num1 + num2;
					System.out.println(num1+"+"+num2+"="+result3);
					break;
				case 4:
					double result4 = num1 - num2;
					System.out.println(num1+"-"+num2+"="+result4);
					break;
				default:
					System.out.println("Sorry, that option is not available.");
					
			}
			
			/* if (operator.equals("m")){
				double result = num1 * num2;
				System.out.println("The product of your two numbers is "+result+".");
			} else if (operator.equals("d")){
				double result = num1 / num2;
				System.out.println("The quotient of your two numbers is "+result+".");
			} else if (operator.equals("a")){
				double result = num1 + num2;
				System.out.println("The sum of your two numbers is "+result+".");
			} else if (operator.equals("s")){
				double result = num1 - num2;
				System.out.println("The result of your two numbers is "+result+".");
			}
			*/
			// int z = num1 + num2;
			// System.out.println("The sum of your two numbers is "+z+".");
			
	}

}