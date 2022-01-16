package 연습4_정렬;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SortPanel extends JPanel {
	
	Random rd = new Random();
	
	public SortPanel() {
		
		int[] sortList = new int[Sort.len];
		
		for (int i = 0; i < Sort.len; i++) {
			sortList[i] = rd.nextInt(101);
		}
		
		
		setLayout(new GridLayout(1,Sort.len,3,3));
		
		JButton[] bt = new JButton[Sort.len];
		
		for (int i = 0; i < Sort.len; i++) {
			bt[i] = new JButton();
			bt[i].setText(""+sortList[i]);
			bt[i].setFont(new Font("San Serif",Font.BOLD,30));
			bt[i].addMouseListener(new MouseListener() {

				public void mouseClicked(MouseEvent e) {
					for (int j = 0; j < Sort.len; j++) {
						String temp = "";
						if (j < Sort.len - 1 && e.getButton() == MouseEvent.BUTTON1 && e.getSource() == bt[j]) {
							temp = bt[j].getText();
							bt[j].setText(bt[j+1].getText());
							bt[j+1].setText(temp);
							Sort.moveCount++;
							Sort.info.setText("이동 수 : "+Sort.moveCount);
						} else if (j > 0 && e.getButton() == MouseEvent.BUTTON3 && e.getSource() == bt[j]) {
							temp = bt[j].getText();
							bt[j].setText(bt[j-1].getText());
							bt[j-1].setText(temp);
							Sort.moveCount++;
							Sort.info.setText("이동 수 : "+Sort.moveCount);
						}
					}
				}

				public void mousePressed(MouseEvent e) {
				}

				public void mouseReleased(MouseEvent e) {
				}

				public void mouseEntered(MouseEvent e) {
				}

				public void mouseExited(MouseEvent e) {
				}
			});
			add(bt[i]);
		}
		
	}
	
}
