package UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;


public class ScheduleAndRequestPanel {
	private final JPanel panel;

	public ScheduleAndRequestPanel() {
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();

		JPanel ScheduleSection = new JPanel();
		JPanel RequestSection = new JPanel();
		
		ScheduleSection.add(new CalendarPanel().getPanel());
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
		JLabel allocSchedule = new JLabel("\t Allocation Schedule");
		gbc.anchor = GridBagConstraints.LINE_START;
		panel.add(allocSchedule,gbc);
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		gbc.anchor = GridBagConstraints.LINE_END;
		panel.add(datePicker,gbc);

		
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		JLabel request = new JLabel("Room Requests");
		panel.add(request, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel.add(ScheduleSection, gbc);
		
		gbc.gridx = 1;
		panel.add(RequestSection, gbc);
	}

	public JPanel getPanel() {
		return panel;
	}
}
