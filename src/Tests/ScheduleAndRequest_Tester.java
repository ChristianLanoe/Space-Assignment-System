package Tests;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import UI.ScheduleAndRequestPanel;

public class ScheduleAndRequest_Tester {
	public static void main(String[] args) {
		new ScheduleAndRequest_Tester();
	}

//	private int DEFAULT_WIDTH = 500;
//	private int DEFAULT_HEIGHT = 500;
	public ScheduleAndRequest_Tester() {
		JFrame requestFrame = new JFrame();
		
		Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
		requestFrame.setSize(ScreenSize);
		requestFrame.setLocationRelativeTo(null);
		requestFrame.setResizable(true);
		requestFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		requestFrame.setTitle("ScheduleRequest Tester");
		requestFrame.getContentPane().setLayout(new BorderLayout());
		
		requestFrame.getContentPane().add(new ScheduleAndRequestPanel().getPanel());
		requestFrame.setVisible(true);
		
		requestFrame.pack();
	}
}