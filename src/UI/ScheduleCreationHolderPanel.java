package UI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Schedule.DayOfWeekTimeSpan;
import Schedule.Full_Calendar;
import Schedule.SemesterType;
import Schedule.Semester_RoomSchedule;

public class ScheduleCreationHolderPanel {
	private final JPanel panel;
	private final JPanel holder;
	private ArrayList<ScheduleCreationPanel> SchedCreationPanels = new ArrayList<ScheduleCreationPanel>();
	private Full_Calendar fullCalendar;

	public ScheduleCreationHolderPanel() {
		initializeCalendar();
		holder = new JPanel();
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints roomCreator = new GridBagConstraints();
		JLabel semesterlabel = new JLabel("Semester:");
		JLabel roomlabel = new JLabel("Room:");

		String[] rooms = { "Board Room", "Cafeteria", "Computer Lab", "Gym", "Library" };

		JComboBox room = new JComboBox(rooms);
		holder.setPreferredSize(new Dimension(1000, 1000));
		holder.add(panel);

		JScrollPane scrPane = new JScrollPane(panel);
		scrPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrPane.setPreferredSize(new Dimension(1000, 1000));

		holder.add(scrPane);

		roomCreator.gridx = 0;
		roomCreator.gridy = 0;

		JComboBox semesters = new JComboBox(SemesterType.values());
		panel.add(semesterlabel, roomCreator);
		roomCreator.gridx++;
		panel.add(semesters, roomCreator);
		roomCreator.gridy++;
		roomCreator.gridx = 0;

		panel.add(roomlabel, roomCreator);
		roomCreator.gridx++;
		panel.add(room, roomCreator);
		roomCreator.gridy++;
		roomCreator.gridx = 0;

		JButton addpanel = new JButton("+");
		panel.add(addpanel, roomCreator);
		roomCreator.gridy++;

		JButton submit = new JButton("Submit");
		panel.add(submit, roomCreator);

		roomCreator.gridx = 2;
		roomCreator.gridy = 0;

		ScheduleCreationPanel first = new ScheduleCreationPanel();
		SchedCreationPanels.add(first);

		panel.add(first.getPanel(), roomCreator);
		JButton invis = new JButton("      ");
		roomCreator.gridy++;
		invis.setOpaque(false);
		invis.setContentAreaFilled(false);
		invis.setBorderPainted(false);
		panel.add(invis, roomCreator);

		addpanel.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				roomCreator.gridx = 2;
				roomCreator.gridy++;
				ScheduleCreationPanel next = new ScheduleCreationPanel();
				panel.add(next.getPanel(), roomCreator);
				SchedCreationPanels.add(next);
				panel.revalidate();
				panel.validate();
				JButton invis = new JButton("      ");
				roomCreator.gridy++;
				invis.setOpaque(false);
				invis.setContentAreaFilled(false);
				invis.setBorderPainted(false);
				panel.add(invis, roomCreator);
			}
		});

		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Semester_RoomSchedule schedule = fullCalendar.forSemester((String) room.getSelectedItem(),
						(SemesterType) semesters.getSelectedItem()); // Get Semester_RoomSchdeule for the specified room
																		// and semester
				for (ScheduleCreationPanel panel : SchedCreationPanels) { // Iterate through all the
																			// SchedulCreationPanels
					ArrayList<DayOfWeekTimeSpan> spans = panel.getInfo(); // getInfo returns DayOfWeekTimeSpans for
																			// 'schedule'
					for (DayOfWeekTimeSpan dowts : spans) { // Iterate through all the spans from getInto()
						schedule.addRoomSchedule(dowts); // Add each DayOfWeekTimeSpan to the Semester_Schedule
					}
				}
				fullCalendar.serialize(); // write fullCalendar back to it's file
			}
		});
	}

	// Deserializing Calendar
	public void initializeCalendar() {
		try {
			FileInputStream fis = new FileInputStream("docs/fullSchedule.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			fullCalendar = (Full_Calendar) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException e) {
			System.out.println("Full_Calendar not found!");
			e.printStackTrace();
			return;

		}
	}

	public JPanel getPanel() {
		return holder;
	}

}
