package Tests;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import UI.LoginPanel;

public class LoginPanel_Tester {

	public static void main(String[] args) {
		new LoginPanel_Tester();
	}

	public LoginPanel_Tester() {
		JFrame frame = new JFrame();

		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Login Panel");
		frame.getContentPane().setLayout(new BorderLayout());

		frame.getContentPane().add(new LoginPanel().getPanel());
		frame.setVisible(true);

		frame.pack();
	}
}
