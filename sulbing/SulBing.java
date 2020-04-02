package sulbing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class SulBing extends JFrame implements ActionListener {
	// 변수선언
	BestAdmin best;
	BingsuAdmin bingsu;
	DesertAdmin desert;
	BeverageAdmin beverage;
	
	JLabel laname, lamany, laprice;
	JTextField tf;
	JList list_name, list_many, list_Price;
	JButton order, cancel;
	JButton[] menu = new JButton[12];
	String[] me = { "딸기초코러블리설빙", "한딸기치즈설빙", "불고기피자", "생딸기복숭아설빙", "민트초코설빙", "딸기마카롱설빙", "생딸기와플", "생딸기찹쌀떡", "달콤퐁당꿀떡",
			"흑당스노우밀크티", "초코밀크티", "딸기피치우롱블렌드티" };
	
	int price[] = {3000,4000,5000};
	
	int totalPrice;
	int howMany[] = new int[12];
	
	SulBing() {
		// 객체 생성
		// 메뉴별로 그리드 생성
		tf = new JTextField(10);
		
		list_name = new JList(new DefaultListModel());
		list_many = new JList(new DefaultListModel());
		list_Price = new JList(new DefaultListModel());
		
		list_name.setPreferredSize(new Dimension(120, 10));
		
		
		
		laname = new JLabel("메뉴");
		lamany = new JLabel("수량");
		laprice = new JLabel("가격");
		
		laname.setSize(120, 10);
		
		order = new JButton("주문");
		cancel = new JButton("취소");

		for (int i = 0; i < 12; i++) {
			menu[i] = new JButton(new ImageIcon("src/sulbing/img/4-1.PNG"));
		}

		for (int i = 0; i < 12; i++) {
			menu[i].setRolloverIcon(new ImageIcon("src/c_info/Imgs/18.png"));
		}

		for (int i = 0; i < 12; i++) {
			menu[i].setBackground(Color.WHITE);
		}

		// 메뉴별 레이아웃 지정
		best = new BestAdmin(menu[0], menu[1], menu[2]);
		bingsu = new BingsuAdmin(menu[3], menu[4], menu[5]);
		desert = new DesertAdmin(menu[6], menu[7], menu[8]);
		beverage = new BeverageAdmin(menu[9], menu[10], menu[11]);
	}

	void display() {
		setLayout(new BorderLayout());

		JTabbedPane pane = new JTabbedPane();

		pane.add("베스트메뉴", best);
		pane.add("빙수메뉴", bingsu);
		pane.add("디저트메뉴", desert);
		pane.add("음료메뉴", beverage);
		add(pane, BorderLayout.CENTER);

		//버튼과 화면이 있는 패널 p
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		
		JPanel p4 = new JPanel();
		p4.setLayout(new BorderLayout());
		p4.add(tf, BorderLayout.NORTH);
		//버튼패널 p1
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1,2));
		p1.add(order);
		p1.add(cancel);
		p4.add(p1, BorderLayout.SOUTH);
		//리스트 패널 p2
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1,3));
		p2.add(list_name); 
		p2.add(list_many);
		p2.add(list_Price);
		//라벨 패널 p3
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(1,3));
		p3.add(laname);
		p3.add(lamany);
		p3.add(laprice);
		
		p.add(p3, BorderLayout.NORTH);
		p.add(p2, BorderLayout.CENTER);
		p.add(p4, BorderLayout.SOUTH);
		
		add(p, BorderLayout.EAST);

	
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


	
	public void actionPerformed(ActionEvent e) {
		JButton evt = (JButton) e.getSource();

		if (evt == order) {
			
			JOptionPane.showMessageDialog(null, "주문하시겠습니까?");
		} else if (evt == cancel) {
			
			JOptionPane.showMessageDialog(null, "취소하시겠습니까?");
			tf.setText(null); //JList만 지워지면 해결될 문제
			DefaultListModel model = (DefaultListModel) list_name.getModel();
			int selectedIndex = list_name.getSelectedIndex();
			if (selectedIndex != -1) {
			       model.remove(selectedIndex);
		}                                             

		}
		
		//JList에 글을 입력하기 위해 객체생성
		DefaultListModel model1 = new DefaultListModel();
		DefaultListModel model2 = new DefaultListModel();
		DefaultListModel model3 = new DefaultListModel();
		model1 = (DefaultListModel)list_name.getModel();
		model2 = (DefaultListModel)list_many.getModel();
		model3 = (DefaultListModel)list_Price.getModel();
		
		
		for (int i = 0; i < 12; i++) { //의지의 한국인
			if (menu[i] == evt) {
				if(i == 0 | i ==3 | i ==6 | i ==9) {
					totalPrice += price[0];
					model3.addElement(price[0]);
				}
				else if(i == 1 | i ==4 | i ==7 | i ==10) {
					totalPrice += price[1];
					model3.addElement(price[1]);
				}
				else if (i ==2| i== 5 | i == 8 | i== 11) {
					totalPrice += price[2];
					model3.addElement(price[2]);
				}
				howMany[i]++;
				model1.addElement(me[i]);
				model2.addElement(howMany[i]);
				
				
			}
			
			
		}
		tf.setText(String.valueOf(totalPrice) + "원");
	}

	public void eventProc() {
		
		cancel.addActionListener(this);
		order.addActionListener(this);

		for (int i = 0; i < 12; i++) {
			menu[i].addActionListener(this);
		}
	}

	public static void main(String[] args) {
		SulBing s = new SulBing();

		s.display();
		s.eventProc();
	}
}