import javax.swing.JOptionPane;

public class RunInputDialogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName;
		String lastName;
		int age;
		
		firstName = JOptionPane.showInputDialog("Enter your first name");
		lastName = JOptionPane.showInputDialog("Enter your last name");
		age= Integer.parseInt (JOptionPane.showInputDialog("Enter your age"));
		
		JOptionPane.showMessageDialog(null, "Your first name is " + firstName + ", your last name is " + lastName + ", and you are " + age + " years old.");
		
	}

}
