import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;



public class Exercise12_01 extends JFrame {
	private JButton jbt1, jbt2, jbt3, jbt4, jbt5, jbt6;
	private JPanel buttonPanel, operationPanel, displayPanel;
	private int btnSize = 10, r,g,b;
	private Random rand = new Random();
	 
	Font displayFont = new Font("SansSerif", Font.BOLD, 16);

	public static void main(String[] args) {
		Exercise12_01 frame = new Exercise12_01();
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Exercise12_01");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setVisible(true);
	}

	public Exercise12_01() {
		// Create panel p1 add three buttons
		/*
		 * JPanel p1 = new JPanel(); p1.setLayout(new FlowLayout()); p1.add(jbt1
		 * = new JButton("Button 1")); p1.add(jbt2 = new JButton("Button 2"));
		 * p1.add(jbt3 = new JButton("Button 3"));
		 * 
		 * // Create Panel p2 and add three buttons JPanel p2 = new JPanel();
		 * p2.setLayout(new FlowLayout()); p2.add(jbt4 = new
		 * JButton("Button 4")); p2.add(jbt5 = new JButton("Button 5"));
		 * p2.add(jbt6 = new JButton("Button 6"));
		 */
		// Place p1 and p2 in the frame
		Rectangle rec = new Rectangle(500,500,500,500);
    	r = rand.nextInt(256);
    	g = rand.nextInt(256);
    	b = rand.nextInt(256);
    	Color myColor = new Color(r,g,b);
    	r = rand.nextInt(256);
    	g = rand.nextInt(256);
    	b = rand.nextInt(256);
    	Color opColor  = new Color(r,g,b);
		setLayout(new BorderLayout());

		JTextField textField = new JTextField("Here we go");
		textField.setFont(displayFont);
		buttonPanel = new JPanel(new GridLayout(4, 3));
		operationPanel = new JPanel(new GridLayout(4, 3));
		buttonPanel.setBackground(myColor);
		operationPanel.setBackground(opColor);
		displayPanel = new JPanel(new BorderLayout());
		displayPanel.add(textField, BorderLayout.NORTH);
		displayPanel.add(operationPanel, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(new JMenu("Test Menu"));

		//testPanel.add(new JButton("+"), BorderLayout.SOUTH);
		//testPanel.add(new JButton("Clear"), BorderLayout.NORTH);
		
		generateNumButtons();
		generateOpButtons();

		add(menuBar, BorderLayout.NORTH);
		add(displayPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
	
	}

	public void generateNumButtons() {
		JButton jbtNumber;
		for (int i = 0; i < btnSize; i++) {
			jbtNumber = new JButton(i + "");
		//	jbtNumber.addActionListener(new NumberAction());
			buttonPanel.add(jbtNumber);
		}
	}
	
	public void generateOpButtons() {
		JButton jbtOperation; //37 to 47
		int start = 37;
		int end = 47;
		for(int i=start; i<=end; i++) {
			jbtOperation = new JButton(((char)i)+"");
			operationPanel.add(jbtOperation);
		}
	}
}