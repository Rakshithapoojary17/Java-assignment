
//4c Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by implementing the event handling mechanism with addActionListener( ).
package javalabprogram5;
import java.awt.event.*;
import javax.swing.*; 
 public class ImageButtonExample {
	 JLabel l1;

	    ImageButtonExample() {
	        JFrame f = new JFrame("Image Button Example");

	        l1 = new JLabel();
	        l1.setBounds(50, 50, 400, 50);

	        // Load images (keep images in same folder)
	        ImageIcon clockIcon = new ImageIcon("clock.png");
	        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

	        JButton b1 = new JButton(clockIcon);
	        JButton b2 = new JButton(hourglassIcon);

	        b1.setBounds(50, 120, 150, 150);
	        b2.setBounds(220, 120, 150, 150);

	        b1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                l1.setText("Digital Clock is pressed");
	            }
	        });

	        b2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                l1.setText("Hour Glass is pressed");
	            }
	        });

	        f.add(b1);
	        f.add(b2);
	        f.add(l1);

	        f.setSize(450, 350);
	        f.setLayout(null);
	        f.setVisible(true);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageButtonExample();
	}

}
