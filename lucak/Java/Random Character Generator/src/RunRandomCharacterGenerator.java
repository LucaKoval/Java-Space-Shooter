import java.util.Random;

public class RunRandomCharacterGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Random generator = new Random();
			
			//char c = (char) ((int) 'a' + generator.nextInt(26));
		
			for (int index = 0; index < 10; index++){
				char c = (char) ((int) 'a' + generator.nextInt(26));
				System.out.println(c);
			}
		
	}

}