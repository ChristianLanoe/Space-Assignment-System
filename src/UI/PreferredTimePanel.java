package UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PreferredTimePanel {
	private final JPanel panel;
	private String room;
	private JComboBox start;
	private JComboBox end;
	private LocalDate date;
	private DayOfWeek dow;
	private ButtonGroup bG;

	public PreferredTimePanel(String room) {
		this.date = date;
		this.room = room;
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		String[] times = { "00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00",
				"10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00",
				"21:00", "22:00", "23:00" };
		String[] Stimes = times;
		String[] Etimes = times;

		ArrayList<String> ATimes;
		String[] startTime = null;
		String[] endTime = null;

		GridBagConstraints pTimeConstraints = new GridBagConstraints();

		// Create buttons for each day of the week
		JRadioButton mon = new JRadioButton("Monday");
		JRadioButton tue = new JRadioButton("Tuesday");
		JRadioButton wed = new JRadioButton("Wednesday");
		JRadioButton thu = new JRadioButton("Thursday");
		JRadioButton fri = new JRadioButton("Friday");
		JRadioButton sat = new JRadioButton("Saturday");
		JRadioButton sun = new JRadioButton("Sunday");

		// Combo Boxes for the start and end times
		JComboBox start = new JComboBox(Stimes);
		JComboBox end = new JComboBox(Etimes);

		// Button group so only one day can be selected
		bG = new ButtonGroup();
		bG.add(mon);
		bG.add(tue);
		bG.add(wed);
		bG.add(thu);
		bG.add(fri);
		bG.add(sat);
		bG.add(sun);

		// Layout of the buttons
		pTimeConstraints.gridx = 0;
		pTimeConstraints.gridy = 0;
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
		pTimeConstraints.gridy = 1;
		panel.add(start, pTimeConstraints);

		pTimeConstraints.gridx++;
		panel.add(end, pTimeConstraints);

	}

	public void getInfo() {
		DayOfWeek day = DayOfWeek.valueOf((String) bG.getSelection().getSelectedObjects().toString().toUpperCase());
		System.out.println(day.toString());
		// DayOfWeekTimeSpan result = new DayOfWeekTimeSpan()
	}

	// public String[]
	public void setStart(JComboBox start) {
		this.start = start;
	}

	public void setEnd(JComboBox end) {
		this.end = end;
	}

	public JPanel getPanel() {
		return panel;
	}
}