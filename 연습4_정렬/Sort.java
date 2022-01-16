package 연습4_정렬;

import javax.swing.*;
import java.awt.*;

public class Sort extends JFrame{

	private static final int height = 360;
	private static final int width = 1024;
	static int len = 10;
	static int moveCount = 0;
	static JLabel info;
	
	public Sort() {
		
		setTitle("Sort");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(3,3));
		c.setBackground(Color.WHITE);
		
		NorthPanel np = new NorthPanel();
		c.add(np, BorderLayout.NORTH);
		
		SortPanel sp = new SortPanel();
		c.add(sp, BorderLayout.CENTER);
		
		RulePanel rp = new RulePanel();
		c.add(rp, BorderLayout.SOUTH);
		
		setSize(width,height);
		setResizable(false);
		setVisible(true);
	}
}
