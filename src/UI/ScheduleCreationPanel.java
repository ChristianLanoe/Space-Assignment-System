package UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Schedule.DayOfWeekTimeSpan;
import Schedule.TimeSpan;

public class ScheduleCreationPanel {
	private final JPanel panel;
	private ArrayList<JCheckBox> boxes;
	JComboBox start;
	JComboBox end;
	String[] endTime;;

	public ScheduleCreationPanel() {
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		String[] times = { "00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00",
				"10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00",
				"21:00", "22:00", "23:00" };

		GridBagConstraints pTimeConstraints = new GridBagConstraints();

		// Create buttons for each day of the week
		JCheckBox mon = new JCheckBox("Monday");
		JCheckBox tue = new JCheckBox("Tuesday");
		JCheckBox wed = new JCheckBox("Wednesday");
		JCheckBox thu = new JCheckBox("Thursday");
		JCheckBox fri = new JCheckBox("Friday");
		JCheckBox sat = new JCheckBox("Saturday");
		JCheckBox sun = new JCheckBox("Sunday");

		boxes = new ArrayList<JCheckBox>();
		boxes.add(mon);
		boxes.add(tue);
		boxes.add(wed);
		boxes.add(thu);
		boxes.add(fri);
		boxes.add(sat);
		boxes.add(sun);

		JLabel stlabel = new JLabel("Start Time:");
		JLabel etlabel = new JLabel("End Time:");

		// Combo Boxes for the start and end times
		
		start = new JComboBox(times);
		end = new JComboBox(times);

		panel.add(mon);
		panel.add(tue);
		panel.add(wed);
		panel.add(thu);
		panel.add(fri);
		panel.add(sat);
		panel.add(sun);

		// Layout of the buttons
		pTimeConstraints.gridx = 0;
		pTimeConstraints.gridy = 0;

		pTimeConstraints.gridx = 0;
		pTimeConstraints.gridy++;
		panel.add(mon, pTimeConstraints);

		pTimeConstraints.gridx++;
		panel.add(tue, pTimeConstraints);

		pTimeConstraints.gridx++;
		panel.add(wed, pTimeConstraints);

		pTimeConstraints.gridx++;
		panel.add(thu, pTimeConstraints);

		pTimeConstraints.gridx++;
		panel.add(fri, pTimeConstraints);

		pTimeConstraints.gridx++;
		panel.add(sat, pTimeConstraints);

		pTimeConstraints.gridx++;
		panel.add(sun, pTimeConstraints);

		pTimeConstraints.gridx = 0;
		pTimeConstraints.gridy++;

		panel.add(stlabel, pTimeConstraints);

		pTimeConstraints.gridx++;
		panel.add(start, pTimeConstraints);

		pTimeConstraints.gridx = 0;
		pTimeConstraints.gridy++;
		panel.add(etlabel, pTimeConstraints);

		pTimeConstraints.gridx++;
		panel.add(end, pTimeConstraints);
	}

	//Creates DayOfWeekTimeSpans from the selected days of the week, start times and end times
	public ArrayList<DayOfWeekTimeSpan> getInfo() {
		ArrayList<DayOfWeekTimeSpan> result = new ArrayList<DayOfWeekTimeSpan>();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:MM");		//Formatter to parse the start and end times
		for (JCheckBox box : boxes) {									//Iterate through all the JCheckBoxes
			if (box.isSelected()) {										//If the box is selected, create a DayOfWeekTimeSpan
				String dayOfWeek = box.getText().toUpperCase();			//The day of week selected
				TimeSpan span = new TimeSpan(LocalTime.parse((String) start.getSelectedItem(), dtf),
						LocalTime.parse((String) end.getSelectedItem(), dtf));		//Creating a TimeSpan Object by parsing the text in start and end time JComboBoxes
				DayOfWeekTimeSpan temp = new DayOfWeekTimeSpan(DayOfWeek.valueOf(dayOfWeek), span);	//Creating the DayOfWeekTimeSpan
				result.add(temp);										//Adding this new DayOfWeekTimeSpan to our result ArrayList
			}
		}
		return result;
	}

	public JPanel getPanel() {
		return panel;
	}
}
