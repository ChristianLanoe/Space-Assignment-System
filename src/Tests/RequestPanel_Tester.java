package Tests;

import java.awt.BorderLayout;
import javax.swing.JFrame;

import UI.RequestPanel;

class RequestPanel_Tester {
	public static void main(String[] args) {
		new RequestPanel_Tester();
	}

	private int DEFAULT_WIDTH = 500;
	private int DEFAULT_HEIGHT = 500;

	public RequestPanel_Tester() {
		JFrame frame = new JFrame();

		frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Request Panel");
		frame.getContentPane().setLayout(new BorderLayout());

		frame.getContentPane().add(new RequestPanel().getPanel());
		frame.setVisible(true);

		frame.pack();
	}
}