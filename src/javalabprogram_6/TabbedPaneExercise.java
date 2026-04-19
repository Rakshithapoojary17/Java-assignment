//6d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and display the concerned color whenever the specific tab is selected in the Pan
package javalabprogram_6;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
public class TabbedPaneExercise {
	 JFrame f;

	    TabbedPaneExercise() {
	        f = new JFrame();

	        JPanel p1 = new JPanel();
	        JPanel p2 = new JPanel();
	        JPanel p3 = new JPanel();

	        p1.setBackground(Color.CYAN);
	        p2.setBackground(Color.MAGENTA);
	        p3.setBackground(Color.YELLOW);

	        JTabbedPane tp = new JTabbedPane();
	        tp.setBounds(50, 50, 200, 200);

	        tp.add("CYAN", p1);
	        tp.add("MAGENTA", p2);
	        tp.add("YELLOW", p3);

	        // Print selected tab
	        tp.addChangeListener(new ChangeListener() {
	            public void stateChanged(ChangeEvent e) {
	                int index = tp.getSelectedIndex();
	                String title = tp.getTitleAt(index);
	                System.out.println("Selected Color: " + title);
	            }
	        });

	        f.add(tp);
	        f.setSize(400, 400);
	        f.setLayout(null);
	        f.setVisible(true);
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new TabbedPaneExercise();
	}

}
