import javax.swing.JOptionPane;

public class CalTest {

	/**
	 * Main method for calculator
	 * @param args - taking input arguments from command prompt
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instatiation an object from Cal class
		String s;
	
		s=JOptionPane.showInputDialog("Enter a name");
		
		System.out.println("Hello " + s);
		Greeting greet = new Greeting();
		Greeting greet2 = new Greeting();
		greet.hello();
		greet2.hello();
		
		System.out.print("The sum is ");
		System.out.println(Cal.add(5, 6));
		System.out.println("The quotient is " + Cal.divide(5,2));
		System.out.println("The quotient is " + Cal.divide(5.0,2.0));
		System.out.println("The square root of 4.0 is " +Math.sqrt(4.0));
		System.out.println(Math.pow(10, 2));
	}
	


}
