
public class RunFibonacci {
	
	public static int counting (int num1, int num2){
		if (num1 >= 100000){
			return num1;
		}
		else {
			System.out.println(num1);
			return counting(num2, num1 + num2);
		}
	}

}
