package 연습4_정렬;

import javax.swing.*;
import java.awt.*;

public class RulePanel extends JPanel {
	
	public RulePanel() {
		
		setLayout(new GridLayout(3,1,4,4));
		JLabel rule1 = new JLabel();
		JLabel rule2 = new JLabel();
		JLabel rule3 = new JLabel();
		rule1.setText("정렬 시키기 규칙");
		rule2.setText("마우스 우클릭 : 자신의 오른쪽 수와 바꾸기");
		rule3.setText("마우스 좌클릭 : 자신의 왼쪽 수와 바꾸기");
		rule1.setFont(new Font("Serif",Font.BOLD,30));
		rule2.setFont(new Font("Serif",Font.PLAIN,20));
		rule3.setFont(new Font("Serif",Font.PLAIN,20));
		add(rule1);
		add(rule2);
		add(rule3);
	}
}
