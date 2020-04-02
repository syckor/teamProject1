
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class SulBing extends JFrame implements ActionListener{
	//변수선언
	BestAdmin best;
	BingsuAdmin bingsu;
	DesertAdmin desert;
	BeverageAdmin beverage;
	JTextArea tf, tf2;
	JButton order, cancel, add;
	JButton bestMenu1, bestMenu2, bestMenu3, desertMenu1, desertMenu2, desertMenu3
			, bingsuMenu1,bingsuMenu2,bingsuMenu3, beverageMenu1, beverageMenu2, beverageMenu3;
	int price1000 = 1000;
	int price3000= 3000;
	int price5000 = 5000;
	int totalPrice;

	SulBing() {
		//객체 생성
		//메뉴별로  그리드 생성
		
		
		tf = new JTextArea(22,20);
		tf2 = new JTextArea(22,20);
		
		add = new JButton("추가");
		order = new JButton("주문");
		cancel = new JButton("취소");
		//베스트메뉴
		bestMenu1 = new JButton(new ImageIcon("src/sulbing/img/4-1.PNG"));
		bestMenu2 = new JButton(new ImageIcon("src/sulbing/img/4-2.PNG"));
		bestMenu3 = new JButton(new ImageIcon("src/sulbing/img/4-3.PNG"));
		
		bestMenu1.setRolloverIcon(new ImageIcon("src/c_info/Imgs/18.png"));
		bestMenu2.setRolloverIcon(new ImageIcon("src/c_info/Imgs/19.png"));
		bestMenu3.setRolloverIcon(new ImageIcon("src/c_info/Imgs/20.png"));
		
		bestMenu1.setBackground(Color.WHITE);
		bestMenu2.setBackground(Color.WHITE);
		bestMenu3.setBackground(Color.WHITE);
		//디저트메뉴
		desertMenu1 = new JButton(new ImageIcon("src/sulbing/img/2-1.PNG"));
		desertMenu2 = new JButton(new ImageIcon("src/sulbing/img/2-2.PNG"));
		desertMenu3 = new JButton(new ImageIcon("src/sulbing/img/2-3.PNG"));
		
		desertMenu1.setRolloverIcon(new ImageIcon("src/c_info/Imgs/18.png"));
		desertMenu2.setRolloverIcon(new ImageIcon("src/c_info/Imgs/19.png"));
		desertMenu3.setRolloverIcon(new ImageIcon("src/c_info/Imgs/20.png"));
		
		desertMenu1.setBackground(Color.WHITE);
		desertMenu2.setBackground(Color.WHITE);
		desertMenu3.setBackground(Color.WHITE);
		
		//빙수메뉴
		bingsuMenu1 = new JButton(new ImageIcon("src/sulbing/img/1-1.PNG"));
		bingsuMenu2 = new JButton(new ImageIcon("src/sulbing/img/1-2.PNG"));
		bingsuMenu3 = new JButton(new ImageIcon("src/sulbing/img/1-3.PNG"));
		
		bingsuMenu1.setRolloverIcon(new ImageIcon("src/c_info/Imgs/18.png"));
		bingsuMenu2.setRolloverIcon(new ImageIcon("src/c_info/Imgs/19.png"));
		bingsuMenu3.setRolloverIcon(new ImageIcon("src/c_info/Imgs/20.png"));
		
		bingsuMenu1.setBackground(Color.WHITE);
		bingsuMenu2.setBackground(Color.WHITE);
		bingsuMenu3.setBackground(Color.WHITE);
		
		//음료메뉴
		beverageMenu1 = new JButton(new ImageIcon("src/sulbing/img/3-1.PNG"));
		beverageMenu2 = new JButton(new ImageIcon("src/sulbing/img/3-2.PNG"));
		beverageMenu3 = new JButton(new ImageIcon("src/sulbing/img/3-3.PNG"));
		
		beverageMenu1.setRolloverIcon(new ImageIcon("src/c_info/Imgs/18.png"));
		beverageMenu2.setRolloverIcon(new ImageIcon("src/c_info/Imgs/19.png"));
		beverageMenu3.setRolloverIcon(new ImageIcon("src/c_info/Imgs/20.png"));
		
		beverageMenu1.setBackground(Color.WHITE);
		beverageMenu2.setBackground(Color.WHITE);
		beverageMenu3.setBackground(Color.WHITE);
		
		//메뉴별 레이아웃 지정
		best = new BestAdmin(bestMenu1,bestMenu2,bestMenu3);
		bingsu = new BingsuAdmin(bingsuMenu1,bingsuMenu2,bingsuMenu3);
		desert = new DesertAdmin(desertMenu1, desertMenu2, desertMenu3);
		beverage = new BeverageAdmin(beverageMenu1, beverageMenu2, beverageMenu3);
	}
	
	void display() {
		setLayout(new BorderLayout());
		
		JTabbedPane pane = new JTabbedPane();
		
		pane.add("베스트메뉴", best);
		pane.add("빙수메뉴", bingsu);
		pane.add("디저트메뉴", desert);
		pane.add("음료메뉴", beverage);
		add(pane, BorderLayout.CENTER);
		
		// 텍스트필드
		/* JPanel p = new JPanel(new FlowLayout());
			p.setLayout(new BorderLayout());
			p.add(tf, BorderLayout.CENTER);

			p.add(tf2, BorderLayout.NORTH);
		
		// 주문/취소 버튼
		JPanel p2 = new JPanel(new GridLayout(1, 3));
			p2.add(add);
			p2.add(order);
			p2.add(cancel); */
		
		//텍스트 상
		JPanel p = new JPanel();
			p.setLayout(new BorderLayout());
			p.add(tf, BorderLayout.NORTH);
		JPanel p2 = new JPanel();
			p2.setLayout(new GridLayout());
			p2.add(add);
			p2.add(cancel);
			
			p.add(p2, BorderLayout.SOUTH);
		
		//텍스트 하	
		JPanel p3 = new JPanel();
			p3.setLayout(new BorderLayout());
			p3.add(tf2, BorderLayout.NORTH);
			p3.add(order, BorderLayout.SOUTH);
		
		//텍스트 상,하	
		JPanel p4 = new JPanel();
		 	p4.setLayout(new BorderLayout());
		 	p4.add(p, BorderLayout.NORTH);
		 	p4.add(p3, BorderLayout.SOUTH);
		 
		 	
		add(p4, BorderLayout.EAST);
			
			


	
	// 주문/취소 버튼
		
		
		
		setSize(1200, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	
	
	public void actionPerformed(ActionEvent e) {
		JButton evt = (JButton)e.getSource();
		if (evt == add) {
		String msg = add.getText();
		JOptionPane.showMessageDialog(null, "추가하시겠습니까?");
		}else if (evt == cancel){
			String msg = add.getText();
			JOptionPane.showMessageDialog(null, "취소하시겠습니까?");
			tf.setText(null);
		}else if (evt == order) {
			int i = JOptionPane.showConfirmDialog(null, "주문하시겠습니까?");
			if(i == 0) {
				JOptionPane.showConfirmDialog(null, "주문 완료");	
			}			
		}
		if (evt == bestMenu1) {
			totalPrice += price1000;
			tf.insert("\n딸기초코러블리설빙 ",1);
			
			tf2.setText(null);
			tf2.insert(String.valueOf((totalPrice)),1);
		}else if (evt == bestMenu2) {
			totalPrice += price1000;
			tf.insert("\n한딸기치즈케이크설빙 ",1);
			tf2.setText(null);
			tf2.insert(String.valueOf((totalPrice)),1);
		}else if (evt == bestMenu3) {
			totalPrice += price1000;
			tf.insert("\n불고기피자 ",1);
			tf2.setText(null);
			tf2.insert(String.valueOf((totalPrice)),1);
		}	
	
		
		
	}
	public void eventProc() {
		add.addActionListener(this);
		cancel.addActionListener(this);
		order.addActionListener(this);
	
		bestMenu1.addActionListener(this);
		bestMenu2.addActionListener(this);
		bestMenu3.addActionListener(this);
		
		desertMenu1.addActionListener(this);
		desertMenu1.addActionListener(this);
		desertMenu1.addActionListener(this);
		
		bingsuMenu1.addActionListener(this);
		bingsuMenu1.addActionListener(this);
		bingsuMenu1.addActionListener(this);
		
		beverageMenu1.addActionListener(this);
		beverageMenu1.addActionListener(this);
		beverageMenu1.addActionListener(this);
		
		
		
	}
	
	
	public static void main(String[] args) {
		SulBing s = new SulBing();
		
		s.display();
		s.eventProc();
	}
}