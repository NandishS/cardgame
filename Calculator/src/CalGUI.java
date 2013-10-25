
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;


public class CalGUI extends JFrame {
   /* boolean operation = false;
    double firstNum, secondNum, result;
    String input = "";*/
    JPanel buttonPanel = new JPanel();
    JTextField jtxtDisplay = new JTextField("0");
    Random rand = new Random();
   // int btnsize = 10;
    int r,g,b;
    public CalGUI() {
    	Rectangle rec = new Rectangle(500,500,500,500);
    	r = rand.nextInt(256);
    	g = rand.nextInt(256);
    	b = rand.nextInt(256);
    	Color myColor = new Color(r,g,b);
        add(jtxtDisplay, BorderLayout.NORTH);
        generateButton();
        buttonPanel.setBackground(myColor);
        add(buttonPanel, BorderLayout.CENTER);
        setSize(200,200);
        setLocationRelativeTo(null);//center
        //setBounds(rec);
        //setLocation(300,390);
        
        setVisible(true);
       // pack();
    
    }

    private void generateButton() {
        // TODO Auto-generated method stub
        buttonPanel.setLayout(new GridLayout(5, 4));
        for (int i = 0; i < btnsize; i++) {
            JButton jbtNumber = new JButton(i + "");
            jbtNumber.addActionListener(new NumberAction());
            buttonPanel.add(jbtNumber);
        }

        JButton jbtClear = new JButton("C");
        jbtClear.addActionListener(new ClearAction());
        buttonPanel.add(jbtClear);

        JButton jbtDivide = new JButton("/");
        jbtDivide.addActionListener(new DivideAction());
        buttonPanel.add(jbtDivide);

        JButton jbtMultiply = new JButton("*");
        jbtMultiply.addActionListener(new MultiplyAction());
        buttonPanel.add(jbtMultiply);

        buttonPanel.add(new JButton("-"));

        JButton jbtAdd = new JButton("+");
        jbtAdd.addActionListener(new AddAction());
        buttonPanel.add(jbtAdd);

        buttonPanel.add(new JButton("()"));

        JButton jbtEqual = new JButton("=");
        jbtEqual.addActionListener(new EqualAction());
        buttonPanel.add(jbtEqual);
        
        buttonPanel.add(new JButton("<--"));
        buttonPanel.add(new JButton("."));
        buttonPanel.add(new JButton("+/-"));
    }

    public class ClearAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub
            jtxtDisplay.setText("");
        }
    }

    public class DivideAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub
            jtxtDisplay.setText("/");
        }
    }

    public class MultiplyAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub
            jtxtDisplay.setText("*");
        }
    }

    public class AddAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub
            operation = true;
            System.out.println(operation);
            firstNum = Double.parseDouble(input);
        }
    }

    public class EqualAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub
            operation = true;
            secondNum = Double.parseDouble(input);
            result=firstNum+secondNum;
            jtxtDisplay.setText(result+"");
        }
    }
    
    public class NumberAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!operation) {
                setNumber(e);
            } else {
                input = "";
                operation = false;
                setNumber(e);
            }
            jtxtDisplay.setText(input);

        }
    }
    public void setNumber(ActionEvent e) {
        switch (e.getActionCommand()) {
        case "1":
            input += 1;
            break;
        case "2":
            input += 2;
            break;
        case "3":
            input += 3;
            break;
        case "4":
            input += 4;
            break;
        case "5":
            input += 5;
            break;
        case "6":
            input += 6;
            break;
        case "7":
            input += 7;
            break;
        case "8":
            input += 8;
            break;
        case "9":
            input += 9;
            break;
        case "0":
            input += 0;
            break;
        }
    
    }
*/
}


