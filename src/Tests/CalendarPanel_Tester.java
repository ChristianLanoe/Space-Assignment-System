package Tests;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import UI.CalendarPanel;

public class CalendarPanel_Tester {
	public static void main(String[] args) {
		new CalendarPanel_Tester();
	}

	private int DEFAULT_WIDTH = 500;
	private int DEFAULT_HEIGHT = 500;

	public CalendarPanel_Tester() {

		JFrame requestFrame = new JFrame();

		requestFrame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		requestFrame.setLocationRelativeTo(null);
		requestFrame.setResizable(true);
		requestFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		requestFrame.setTitle("Calendar Panel");
		requestFrame.getContentPane().setLayout(new BorderLayout());

		requestFrame.getContentPane().add(new CalendarPanel(null, null).getPanel());
		requestFrame.setVisible(true);

		requestFrame.pack();
	}
}
