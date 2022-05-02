package ch07.practice;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Exercise7_28 {

	public static void main(String[] args) {
		Frame f = new Frame();
//		f.addWindowListener(new EventHandler());
		f.addWindowListener(new WindowAdapter() {	// 익명 클래스 
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}// main()
}

class EventHandler extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}
}


