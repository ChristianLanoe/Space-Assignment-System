package UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ScheduleAndRequestPanel {
	private final JPanel panel;

	public ScheduleAndRequestPanel() {
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();

		JPanel SchedulePanel = new JPanel();
		JPanel RequestSection = new JPanel();
		
		SchedulePanel.add(new CalendarPanel().getPanel());
		RequestSection.add(new RequestPanel().getPanel());

		// Adding Log-in Button
		JPanel login = new JPanel();
		GridBagConstraints lc = new GridBagConstraints();
		lc.anchor = GridBagConstraints.LINE_END;
		JButton loginButton = new JButton("Log-in");
		login.add(loginButton, lc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		panel.add(login, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		JLabel allocSchedule = new JLabel("Allocation Schedule");
		panel.add(allocSchedule,gbc);
		
		gbc.gridx = 1;
		JLabel request = new JLabel("Room Requests");
		panel.add(request, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel.add(SchedulePanel, gbc);
		
		gbc.gridx = 1;
		panel.add(RequestSection, gbc);
	}

	public JPanel getPanel() {
		return panel;
	}
}
