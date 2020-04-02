package sulbing;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BingsuAdmin extends JPanel {
	
	
	BingsuAdmin(JButton bingsuMenu1,JButton bingsuMenu2,JButton bingsuMenu3) {
		setLayout(new GridLayout(1,3));
//		add(bingsuMenu1 = new JButton(new ImageIcon("src/sulbing/img/1-1.PNG")));
//		add(bingsuMenu2 = new JButton(new ImageIcon("src/sulbing/img/1-2.PNG")));
//		add(bingsuMenu3 = new JButton(new ImageIcon("src/sulbing/img/1-3.PNG")));
//		
//		bingsuMenu1.setBackground(Color.WHITE);
//		bingsuMenu2.setBackground(Color.WHITE);
//		bingsuMenu3.setBackground(Color.WHITE);
		add(bingsuMenu1);
		add(bingsuMenu2);			
		add(bingsuMenu3);

	}
}
