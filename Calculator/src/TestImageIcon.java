import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class TestImageIcon extends JFrame {
	ImageIcon caFlag = new ImageIcon("image/ca.gif");
	ImageIcon cardImg;
	JButton cardButton;
	JLabel calabel = new JLabel(caFlag);
	JPanel cardPanel = new JPanel(new FlowLayout(5,5,5));
	int cardSize=54;
	public TestImageIcon() {
		generateCard();	
		add(calabel, BorderLayout.NORTH);
		add(cardPanel, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		setVisible(true);
		pack();
	}

	public void generateCard() {
		for(int i=1; i<=cardSize; i++) {
			cardImg = new ImageIcon("image/card/" + i + ".png");
			cardButton = new JButton(cardImg);
			cardButton.addActionListener(new CardAction());
			cardPanel.add(cardButton);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestImageIcon();
	}

	   public class CardAction implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	calabel.setIcon(((JButton)e.getSource()).getIcon());
	        	
	        	
	        	//ImageIcon back = new ImageIcon("image/card/" + 1 + ".png");
	        	System.out.println(e.getSource());
	        	//calabel.setIcon(back);
	        }
	    }
}
