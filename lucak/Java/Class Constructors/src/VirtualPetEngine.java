import javax.swing.JOptionPane;

public class VirtualPetEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Pet myPet = new Pet("Mac");
			
			JOptionPane.showMessageDialog(null, "My pet's name is " + myPet.name);
			JOptionPane.showMessageDialog(null, "My pet is a " + myPet.type);
			JOptionPane.showMessageDialog(null, "My pet's hair color is " + myPet.color);
		
	}

}