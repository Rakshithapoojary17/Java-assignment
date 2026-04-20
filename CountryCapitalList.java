//5c. Develop a Swing program in Java to add the countries USA, India, Vietnam,  Canada,  Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and  display the capital of the countries on console whenever the countries are selected on the list

package javalabprogram_6;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;

public class CountryCapitalList {

    JFrame f;

    CountryCapitalList() {

        f = new JFrame();

        String countries[] = {
                "USA", "India", "Vietnam", "Canada",
                "Denmark", "France", "Great Britain",
                "Japan", "Africa", "Greenland", "Singapore"
        };

        // Store capitals
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Addis Ababa");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        JList<String> list = new JList<>(countries);
        list.setBounds(50, 50, 200, 200);

        // Fix: print only once
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {

                    String country = list.getSelectedValue();

                    if (country != null) {
                        System.out.println("Capital of " + country + " is: "
                                + capitals.get(country));
                  
                    }}
            }
        });

        f.add(list);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new CountryCapitalList();
	}

}
