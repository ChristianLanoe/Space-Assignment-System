package Tests;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import UI.RoomCreationPanel;

public class RoomCreation_Tester {
	public static void main(String[] args) {
		new RoomCreation_Tester();
	}

	private int DEFAULT_WIDTH = 500;
	private int DEFAULT_HEIGHT = 500;
	public RoomCreation_Tester() {
		JFrame requestFrame = new JFrame();
		
		requestFrame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		requestFrame.setLocationRelativeTo(null);
		requestFrame.setResizable(true);
		requestFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		requestFrame.setTitle("Room Creation Tester");
		requestFrame.getContentPane().setLayout(new BorderLayout());
		
		requestFrame.getContentPane().add(new RoomCreationPanel().getPanel());
		requestFrame.setVisible(true);
		
		requestFrame.pack();
	}
}