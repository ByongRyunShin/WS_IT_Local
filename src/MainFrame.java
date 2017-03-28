import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class MainFrame extends JFrame implements ActionListener{
	JToggleButton[] b=new JToggleButton[5];
	String[] str={"배차차량조회", "예약신청", " 차량좌석조회", "승차권발매", "예약조회"};
	CardLayout cards=new CardLayout();
	JPanel cardpanel;
	ButtonGroup bg;
	public MainFrame(String userid){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("고속버스예매 프로그램");
		
		JPanel p=new JPanel(new BorderLayout());
		JPanel p1=new JPanel();
		JPanel p2=new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 5));
		JPanel p3=new JPanel(new BorderLayout());
		JPanel tp=new JPanel();
		cardpanel=new JPanel(cards);
		tp.setBackground(Color.black);
		
		JLabel title=new JLabel("고속버스예매 프로그램");
		title.setFont(new Font("", Font.BOLD, 25));
		p1.add(title);
		
		bg=new ButtonGroup();
		
		for(int i=0; i<5; i++){
			b[i]=new JToggleButton(str[i]);
			b[i].addActionListener(this);
			bg.add(b[i]);
			p2.add(b[i]);
		}
		
		p3.add(p2, BorderLayout.NORTH);
		p3.add(tp, BorderLayout.CENTER);
		
		SelectBus sb=new SelectBus();
		cardpanel.add(sb, "selectbus");
		
		cardpanel.setPreferredSize(new Dimension(800, 550));
		
		p.add(p1, BorderLayout.NORTH);
		p.add(p3, BorderLayout.CENTER);
		p.add(cardpanel, BorderLayout.SOUTH);
		add(p);
		pack();
		setResizable(true);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b[0]){
			cards.show(cardpanel, "selectbus");
		}
		else if(e.getSource()==b[1]){
		}
		else if(e.getSource()==b[2]){
			
		}
		else if(e.getSource()==b[3]){
			
		}
		else if(e.getSource()==b[4]){
			
		}
	}
}
