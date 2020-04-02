package sulbing;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BeverageAdmin extends JPanel {
	
	
	BeverageAdmin(JButton beverageMenu1, JButton beverageMenu2, JButton beverageMenu3) {
		setLayout(new GridLayout(1,3));
//		add(beverageMenu1 = new JButton(new ImageIcon("src/sulbing/img/3-1.PNG")));
//		add(beverageMenu2 = new JButton(new ImageIcon("src/sulbing/img/3-2.PNG")));
//		add(beverageMenu3 = new JButton(new ImageIcon("src/sulbing/img/3-3.PNG")));
//		
//		
//		beverageMenu1.setBackground(Color.WHITE);
//		beverageMenu2.setBackground(Color.WHITE);
//		beverageMenu3.setBackground(Color.WHITE);
		add(beverageMenu1);
		add(beverageMenu2);			
		add(beverageMenu3);

	}
}
