import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginMain extends JFrame implements ActionListener{
	JPanel[] p=new JPanel[6];
	JRadioButton rb1, rb2;
	JButton b1, b2;
	JTextField t1;
	JPasswordField t2;
	public LoginMain(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("회원 로그인");
		
		for(int i=0; i<6; i++){
			p[i]=new JPanel();
		}
		rb1=new JRadioButton("회원 로그인");
		rb1.addActionListener(this);
		rb2=new JRadioButton("비회원 로그인");
		rb2.addActionListener(this);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		p[1].add(rb1);
		p[1].add(rb2);
		rb1.setSelected(true);
		
		JLabel title=new JLabel("로그인");
		title.setFont(new Font("", Font.BOLD, 20));
		p[2].add(title);
		p[2].setBorder(new EmptyBorder(-4, 0, -2, 0));
		
		JLabel l1=new JLabel("회원 번호 :  ", JLabel.TRAILING);
		JLabel l2=new JLabel("비밀 번호 :  ", JLabel.TRAILING);
		t1=new JTextField(10);
		t2=new JPasswordField(10);
		
		p[4].setLayout(new GridLayout(0,2, 0, 13));
		p[4].setBorder(new EmptyBorder(0, -45, 0, 15));
		p[4].add(l1);
		p[4].add(t1);
		p[4].add(l2);
		p[4].add(t2);
		
		b1=new JButton("확인");
		b2=new JButton("취소");
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		p[5].setLayout(new BoxLayout(p[5], BoxLayout.Y_AXIS));
		p[5].add(b1);
		p[5].add(b2);
		
		p[3].setBorder(new EmptyBorder(-5, 0, 0, 0));
		p[3].add(p[4]);
		p[3].add(p[5]);
		
		p[0].setLayout(new BorderLayout());
		p[0].setBorder(new EmptyBorder(3, 5, 5, 5));
		p[0].add(p[1], BorderLayout.NORTH);
		p[0].add(p[2]);
		p[0].add(p[3], BorderLayout.SOUTH);
		
		add(p[0]);
		
		setResizable(false);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginMain();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==rb1){
			if(rb1.isSelected()){
				t1.setEnabled(true);
				t2.setEnabled(true);
				t1.setText("");
				t2.setText("");
			}
		}
		else if(e.getSource()==rb2){
			t1.setEnabled(false);
			t2.setEnabled(false);
			t1.setText("비회원");
			t2.setText("000");
		}
		else if(e.getSource()==b1){
			DB db=new DB();
			
		}
		else if(e.getSource()==b2){
			System.exit(0);
		}
	}

}
