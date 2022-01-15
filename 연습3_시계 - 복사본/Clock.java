package 연습3_시계;

import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Clock extends JFrame implements Runnable {
	
	private Thread thread;
	static final int width  = 360;
	static final int height = 120;
	static JLabel time;
	
	public Clock() {
		setTitle("MyClock");
		time = new JLabel();
		time.setFont(new Font("궁서",Font.BOLD,30));
		if(thread == null){
			thread = new Thread(this);
			thread.start();
		}

		add(time);
		setSize(width,height);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void run() {
		while(true) {
			Calendar cal = Calendar.getInstance();
			String dat = cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH)+1) + "-"
					+ cal.get(Calendar.DATE) + " " + cal.get(Calendar.HOUR) + ":"
					+ cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND);
			Clock.time.setText(dat);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
