package ����4_����;

import javax.swing.*;
import java.awt.*;

public class RulePanel extends JPanel {
	
	public RulePanel() {
		
		setLayout(new GridLayout(3,1,4,4));
		JLabel rule1 = new JLabel();
		JLabel rule2 = new JLabel();
		JLabel rule3 = new JLabel();
		rule1.setText("���� ��Ű�� ��Ģ");
		rule2.setText("���콺 ��Ŭ�� : �ڽ��� ������ ���� �ٲٱ�");
		rule3.setText("���콺 ��Ŭ�� : �ڽ��� ���� ���� �ٲٱ�");
		rule1.setFont(new Font("Serif",Font.BOLD,30));
		rule2.setFont(new Font("Serif",Font.PLAIN,20));
		rule3.setFont(new Font("Serif",Font.PLAIN,20));
		add(rule1);
		add(rule2);
		add(rule3);
	}
}
