package javalabprogram5;
import javax.swing.*;
import java.awt.event.*;

public class MouseDemo {

	 
		 
		 
		    JLabel l;

		    MouseDemo() {
		        JFrame f = new JFrame("Mouse Operations Demo");

		        l = new JLabel("Perform action on button");
		        l.setBounds(80, 50, 300, 30);

		        JButton b = new JButton("Click Me!");
		        b.setBounds(100, 100, 120, 50);

		        b.addMouseListener(new MouseListener() {

		            public void mouseClicked(MouseEvent e) {
		                if (e.getClickCount() == 2) {
		                    l.setText("Double Click detected");
		                } else {
		                    l.setText("Single Click detected");
		                }
		            }

		            public void mousePressed(MouseEvent e) {
		                l.setText("Mouse Down (Pressed)");
		            }

		            public void mouseReleased(MouseEvent e) {
		                l.setText("Mouse Up (Released)");
		            }

		            public void mouseEntered(MouseEvent e) { }

		            public void mouseExited(MouseEvent e) { }
		        });

		        f.add(b);
		        f.add(l);

		        f.setSize(350, 250);
		        f.setLayout(null);
		        f.setVisible(true);
		        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    }

		      
		    public static void main(String[] args) {
				// TODO Auto-generated method stub
		    	
		        new MouseDemo();
		    }
		}
	
