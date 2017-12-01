package UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Schedule.SemesterType;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;


public class ScheduleAndRequestPanel {
	private final JPanel panel;
	private JPanel update;

	public ScheduleAndRequestPanel() {
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());

		String[] roomNames = {"Board Room","Cafeteria","Computer Lab","Gym","Library"};

		GridBagConstraints gbc = new GridBagConstraints();


		// Adding Log-in Button
		JPanel login = new JPanel();
		GridBagConstraints lc = new GridBagConstraints();
		lc.anchor = GridBagConstraints.LINE_END;
		JButton loginButton = new JButton("Log-in");
		login.add(loginButton, lc);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(login, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.LINE_START;
		JLabel rooms = new JLabel("\t Pick room: ");
		panel.add(rooms,gbc);
		
		gbc.gridx++;
		gbc.anchor = GridBagConstraints.LINE_START;
		JComboBox roomList = new JComboBox(roomNames);
		panel.add(roomList,gbc);
		
		gbc.gridy++;
		gbc.gridx = 0;
		gbc.anchor = GridBagConstraints.LINE_END;
		JLabel semester = new JLabel("\t Pick Semester: ");
		panel.add(semester,gbc);
		
		gbc.gridx++;
		gbc.anchor = GridBagConstraints.LINE_START;
		JComboBox SemesterList = new JComboBox(SemesterType.values());
		panel.add(SemesterList,gbc);
		
		gbc.gridx = 0;
		gbc.gridy++;
		JButton submit = new JButton("Submit");
		panel.add(submit,gbc);
		
		JPanel ScheduleSection = new JPanel();
		JPanel RequestSection = new JPanel();
		
		update = new CalendarPanel((String)roomList.getSelectedItem()	, (SemesterType) SemesterList.getSelectedItem()).getPanel();
		ScheduleSection.add(update,gbc);
		RequestSection.add(new RequestPanel().getPanel());
		
		gbc.gridx = 0;
		gbc.gridy++;
		gbc.gridwidth = 2;
		panel.add(ScheduleSection, gbc);
		
		gbc.gridx = 3;
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.LINE_END;
		panel.add(RequestSection, gbc);
		
		submit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String room = (String)	roomList.getSelectedItem();
				SemesterType type = (SemesterType) SemesterList.getSelectedItem();
				ScheduleSection.removeAll();
				update = new CalendarPanel(room,type).getPanel();
				ScheduleSection.add(update,gbc);
//				ScheduleSection.validate();
				ScheduleSection.repaint();
				ScheduleSection.revalidate();
			}
		});
	}

	public JPanel getPanel() {
		return panel;
	}
}
