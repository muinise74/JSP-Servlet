package ����4_����;

import javax.swing.*;
import java.awt.*;

public class NorthPanel extends JPanel {
	
	public NorthPanel() {
		setLayout(new GridLayout(1,1,4,4));
		Sort.info = new JLabel();
		Sort.info.setText("�̵� �� : "+Sort.moveCount);
		Sort.info.setFont(new Font("San Serif",Font.BOLD,25));
		add(Sort.info);
	}

}
