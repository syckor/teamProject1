package sulbing;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BestAdmin extends JPanel {
	
	
	BestAdmin(JButton bestMenu1, JButton bestMenu2,JButton bestMenu3) {
		
		
		
		setLayout(new GridLayout(1,3));
//		add(bestMenu1 = new JButton(new ImageIcon("src/sulbing/img/4-1.PNG")));
//		add(bestMenu2 = new JButton(new ImageIcon("src/sulbing/img/4-2.PNG")));
//		add(bestMenu3 = new JButton(new ImageIcon("src/sulbing/img/4-3.PNG")));
//		
//		bestMenu1.setBackground(Color.WHITE);
//		bestMenu2.setBackground(Color.WHITE);
//		bestMenu3.setBackground(Color.WHITE);
		add(bestMenu1);
		add(bestMenu2);			
		add(bestMenu3);
		
	}

}
