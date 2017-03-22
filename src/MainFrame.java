import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	JButton[] b=new JButton[5];
	String[] str={"배차차량조회", "예약신청", " 차량좌석조회", "승차권발매", "예약조회"};
	CardLayout cards=new CardLayout();
	public MainFrame(String userid){
		setSize(700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("고속버스예매 프로그램");
		
		JPanel p=new JPanel(new BorderLayout());
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel(new BorderLayout());
		JPanel tp=new JPanel();
		JPanel cardpanel=new JPanel();
		tp.setBackground(Color.black);
		
		JLabel title=new JLabel("고속버스예매 프로그램");
		title.setFont(new Font("", Font.BOLD, 30));
		p1.add(title);
		
		for(int i=0; i<5; i++){
			b[i]=new JButton(str[i]);
			p2.add(b[i]);
		}
		
		p3.add(p2, BorderLayout.NORTH);
		p3.add(tp, BorderLayout.CENTER);
		
		SelectBus sb=new SelectBus();
		cardpanel.add(sb);
		
		//cards.addLayoutComponent("selectbus", sb);
		//cards.show(cardpanel, "selectbus");
		
		p.add(p1, BorderLayout.NORTH);
		p.add(p3, BorderLayout.CENTER);
		sb.add(tp, BorderLayout.NORTH);
		p.add(cardpanel, BorderLayout.SOUTH);
		add(p);
		setResizable(true);
		setVisible(true);
	}
}
