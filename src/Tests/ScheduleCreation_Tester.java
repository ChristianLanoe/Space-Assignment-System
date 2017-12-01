package Tests;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import UI.ScheduleCreationHolderPanel;
import UI.ScheduleCreationPanel;

public class ScheduleCreation_Tester {
	public static void main(String[] args) {
		new ScheduleCreation_Tester();
	}

	private int DEFAULT_WIDTH = 1920;
	private int DEFAULT_HEIGHT = 1080;
	public ScheduleCreation_Tester() {
		JFrame requestFrame = new JFrame();
		requestFrame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		requestFrame.setLocationRelativeTo(null);
		requestFrame.setResizable(true);
		requestFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		requestFrame.setTitle("Schedule Creation Tester");
		requestFrame.getContentPane().setLayout(new BorderLayout());
		
		requestFrame.getContentPane().add(new ScheduleCreationHolderPanel().getPanel());
		requestFrame.setVisible(true);
		
		
	}
}